package com.sam.SingleMode;

public class HangreySingle {
    private static HangreySingle hangreySingle = new HangreySingle();
    private HangreySingle() {}
    public static HangreySingle getInstance() {
        return hangreySingle;
    }
}
