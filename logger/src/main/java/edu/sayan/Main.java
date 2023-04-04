package edu.sayan;

import edu.sayan.logger.Logger;

public class Main {
    public static void main(String[] args) {
//        String name;
//        if (args.length > 0) {
//            name = args[0];
//        }
//        else {
//            name = "unknown";
//        }
//        System.out.println("Hello " + name + "!");
        Logger myLogger = new Logger("Sayan");
        myLogger.logToConsole("Message for logger instance");
        System.out.println(myLogger.lastMessage);

        Logger.logToConsoleStatic("Message for logger class");
        System.out.println(Logger.lastStaticMessage);
    }
}