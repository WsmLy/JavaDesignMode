package com.sam.SimpleFactory;

public class Apple implements Fruit {
    @Override
    public void getName() {
        System.out.println(getClass().getName());
    }
}
