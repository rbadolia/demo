package com.ramakant.demo.common;

import java.util.HashMap;
import java.util.Map;

public class MonthMaps {
    public static final Map<String, Integer> monthToIdMap = new HashMap<String, Integer>() {{
        put("1", 1);
        put("2", 2);
        put("3", 3);
        put("4", 4);
        put("5", 5);
        put("6", 6);
        put("7", 7);
        put("8", 8);
        put("9", 9);
        put("10", 10);
        put("11", 11);
        put("12", 12);
        put("JAN", 1);
        put("FEB", 2);
        put("MAR", 3);
        put("APR", 4);
        put("MAY", 5);
        put("JUN", 6);
        put("JUL", 7);
        put("AUG", 8);
        put("SEP", 9);
        put("OCT", 10);
        put("NOV", 11);
        put("DEC", 12);
        put("JANUARY", 1);
        put("FEBRUARY", 2);
        put("MARCH", 3);
        put("APRIL", 4);
        put("JUNE", 6);
        put("JULY", 7);
        put("AUGUST", 8);
        put("SEPTEMBER", 9);
        put("OCTOBER", 10);
        put("NOVEMBER", 11);
        put("DECEMBER", 12);
    }};

    public static final Map<Integer, String> monthIdToMonthMap = new HashMap<Integer, String>() {{
        put(1, "JANUARY");
        put(2, "FEBRUARY");
        put(3, "MARCH");
        put(4, "APRIL");
        put(5, "MAY");
        put(6, "JUNE");
        put(7, "JULY");
        put(8, "AUGUST");
        put(9, "SEPTEMBER");
        put(10, "OCTOBER");
        put(11, "NOVEMBER");
        put(12, "DECEMBER");
    }};
}
