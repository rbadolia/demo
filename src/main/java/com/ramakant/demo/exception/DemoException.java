package com.ramakant.demo.exception;

import java.io.Serializable;

/**
 * Created by Pranav S Kurup on 5/13/2018.
 */
public class DemoException extends RuntimeException implements Serializable {
    public DemoException(String msg) {
        super(msg);
    }
}
