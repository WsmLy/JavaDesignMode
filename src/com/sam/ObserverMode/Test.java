package com.sam.ObserverMode;

//使用(实现Observer接口）
public class Test implements Observer{

    public static void main(String[] args){

        ConcreteObservable.getInstance().registerObserver(Test.class);
        ConcreteObservable.getInstance().notifyObservers();
    }

    //实现接口处理
    public void update(){
        //做操作，比如更新数据，更新UI等
        System.out.println("update");
    }
}
