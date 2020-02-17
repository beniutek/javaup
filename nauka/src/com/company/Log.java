package com.company;

public class Log implements ILog {
    @Override
    public void log(String text) {
        System.out.println(text);
    }
}
