package com.sam.SingleMode;

public class LazySingleSafe {
    private static LazySingleSafe lazySingle;
    private LazySingleSafe() {}
    public static synchronized LazySingleSafe getInstance() {
        if (lazySingle == null) {
            lazySingle = new LazySingleSafe();
        }
        return lazySingle;
    }
}
