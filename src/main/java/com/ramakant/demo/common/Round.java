package com.ramakant.demo.common;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Round {
    public static double getRoundedDouble(double d, int places){
        if (places < 0) {
            throw new IllegalArgumentException();
        }

        BigDecimal bd = new BigDecimal(String.valueOf(d));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
