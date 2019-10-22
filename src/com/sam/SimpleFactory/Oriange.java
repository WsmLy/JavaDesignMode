package com.sam.SimpleFactory;

public class Oriange  implements Fruit {
    @Override
    public void getName() {
        System.out.println(getClass().getName());
    }
}
