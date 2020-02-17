package com.company;

public class RemoteOperation {
    private IRemoteLog logger;
    public RemoteOperation(IRemoteLog logger) {
        this.logger = logger;
    }

    public void start(String text) {
        logger.remoteLog(text);
    }
}
