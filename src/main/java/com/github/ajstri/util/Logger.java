package com.github.ajstri.util;

import java.io.PrintStream;

public class Logger {

    protected static PrintStream err = System.err;
    protected static PrintStream warning = System.out;
    protected static PrintStream info = System.out;
    protected static PrintStream debug = System.out;

    protected static String title = "[AJStriBot";

    public static void debug(String message) {
        //if (Data.DEBUG_MODE) {
            debug.println(title + "/DEBUG] " + message);
        //}
        //else {
            return;
        //}
    }

    public static void info(String message) {
        info.println(title + "/INFO] " + message);
    }

    public static void warning(String message) {
        warning.println(title + "/WARNING] " + message);
    }

    public static void error(String message) {
        err.println(title + "/ERROR] " + message);
    }

    public static void exception(Exception e) {
        info.println(e);
    }
}
