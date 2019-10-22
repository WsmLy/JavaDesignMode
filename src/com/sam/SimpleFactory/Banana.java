package com.sam.SimpleFactory;

public class Banana  implements Fruit {
    @Override
    public void getName() {
        System.out.println(getClass().getName());
    }
}
