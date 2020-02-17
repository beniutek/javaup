package com.company;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        var log1 = new Log();
        var log2 = new RemoteLogAdapter();
        Operation op1 = new Operation(log1);
        Operation op2 = new Operation(log2);

        op1.start("test 1");
        op2.start("test 2");

        var log3 = new RemoteLogTwoWayAdapter();
        RemoteOperation rop = new RemoteOperation(log3);
        Operation op3 = new Operation(log3);

        rop.start("test 3");
        op3.start("test 4");
    }
}
