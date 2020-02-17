package com.company;

public class RemoteLogTwoWayAdapter implements ILog, IRemoteLog {
    private IRemoteLog log = new RemoteLog();

    @Override
    public void log(String text) {
        log.remoteLog(text);
    }

    @Override
    public void remoteLog(String text) {
        log.remoteLog(text);
    }
}
