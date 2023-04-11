package com.madhukartemba.smarttest.service;

import java.awt.Color;

import com.madhukartemba.smarttest.entity.Parameters;

public class PrintService {

    private static final String RESET = "\033[0m";
    private static final Color DEFAULT_COLOR = Parameters.DEFAULT_COLOR;
    private static final String DEFAULT_COLOR_CODE = getColorCode(DEFAULT_COLOR);
    private static final String SEPERATOR = ":";

    public static void print(String str, Color color) {
        String colorCode = getColorCode(color);
        System.out.print(colorCode + str + RESET);
    }

    public static void println(String str, Color color) {
        String colorCode = getColorCode(color);
        System.out.println(colorCode + str + RESET);
    }

    public static void print(String str) {
        System.out.print(DEFAULT_COLOR_CODE + str + RESET);
    }

    public static void println(String str) {
        System.out.println(DEFAULT_COLOR_CODE + str + RESET);
    }

    public static void formatPrint(String str) {
        formatPrint(str, DEFAULT_COLOR, Color.YELLOW);
    }

    public static void formatPrint(String str, Color color2) {
        formatPrint(str, DEFAULT_COLOR, color2);
    }

    public static void formatPrint(String str, Color color1, Color color2) {
        String strs[] = str.split(SEPERATOR);
        print(strs[0] + SEPERATOR, color1);
        for (int i = 1; i < strs.length; i++) {
            print(strs[i], color2);
        }
        System.out.println();
    }

    private static String getColorCode(Color color) {
        int r = color.getRed();
        int g = color.getGreen();
        int b = color.getBlue();
        return String.format("\033[38;2;%d;%d;%dm", r, g, b);
    }
}
