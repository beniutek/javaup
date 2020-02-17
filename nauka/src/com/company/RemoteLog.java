package com.company;

public class RemoteLog implements IRemoteLog {
    @Override
    public void remoteLog(String text) {
        System.out.println("REMOTE ! " + text);
    }
}
