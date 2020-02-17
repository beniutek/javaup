package com.company;

public class RemoteLogAdapter implements ILog {
    private RemoteLog rl = new RemoteLog();

    @Override
    public void log(String text) {
        rl.remoteLog(text);
    }
}
