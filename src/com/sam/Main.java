package com.sam;

import com.sam.SimpleFactory.Apple;
import com.sam.SimpleFactory.Banana;
import com.sam.SimpleFactory.Oriange;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**简单工厂**/
        Apple apple = new Apple();
        apple.getName();
        Oriange oriange = new Oriange();
        oriange.getName();
        Banana banana = new Banana();
        banana.getName();
    }
}
