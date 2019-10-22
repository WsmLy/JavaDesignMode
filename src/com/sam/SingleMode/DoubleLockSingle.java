package com.sam.SingleMode;

public class DoubleLockSingle {
    private volatile static DoubleLockSingle singleton;
    private DoubleLockSingle (){}
    public static DoubleLockSingle getSingleton() {
        if (singleton == null) {
            synchronized (DoubleLockSingle.class) {
                if (singleton == null) {
                    singleton = new DoubleLockSingle();
                }
            }
        }
        return singleton;
    }
}
