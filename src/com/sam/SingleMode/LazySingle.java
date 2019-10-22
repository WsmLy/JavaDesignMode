package com.sam.SingleMode;

public class LazySingle {
    private static LazySingle lazySingle;
    private LazySingle() {}
    public static LazySingle getInstance() {
        if (lazySingle == null) {
            lazySingle = new LazySingle();
        }
        return lazySingle;
    }
}
