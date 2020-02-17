package com.company;

public class Operation {
    private ILog logger;
    public Operation(ILog logger) {
        this.logger = logger;
    }

    public void start(String text) {
        logger.log(text);
    }
}
