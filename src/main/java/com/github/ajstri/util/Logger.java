/*
 * Copyright 2018 AJStri
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.ajstri.util;

import java.io.PrintStream;

/**
 * Logger. A super simple logging system
 * for outputting messages.
 *
 * @author AJStri
 * @since April 1st, 2018
 */
public class Logger {

    protected static PrintStream err = System.err;
    protected static PrintStream warning = System.out;
    protected static PrintStream info = System.out;
    protected static PrintStream debug = System.out;

    protected static String title = "[KingdomOfStriastria";

    /**
     * Outputs debugging messages
     *
     * @param message Message to be sent
     */
    public static void debug(String message) {
        //if (Data.DEBUG_MODE) {
            debug.println(title + "/DEBUG] " + message);
        //}
        //else {
            return;
        //}
    }

    /**
     * Outputs informational messages
     *
     * @param message Message to be sent
     */
    public static void info(String message) {
        info.println(title + "/INFO] " + message);
    }

    /**
     * Outputs warning messages
     *
     * @param message Message to be sent
     */
    public static void warning(String message) {
        warning.println(title + "/WARNING] " + message);
    }

    /**
     * Outputs error messages
     *
     * @param message Message to be sent
     */
    public static void error(String message) {
        err.println(title + "/ERROR] " + message);
    }

    /**
     * Outputs exception
     *
     * @param message Message to be sent
     */
    public static void exception(Exception e) {
        info.println(e);
    }
}
