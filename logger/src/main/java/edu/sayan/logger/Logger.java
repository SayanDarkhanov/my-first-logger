package edu.sayan.logger;

public class Logger {
    public String lastMessage;
    public static String lastStaticMessage;
    public String owner;
    public Logger(String name) {
        this.owner = name;
    }

    public void logToConsole(String opera) {
        System.out.println(opera);
   lastMessage = opera;
    }

    public static void logToConsoleStatic(String opera) {
        System.out.println(opera);
        lastStaticMessage = opera;
    }
}
