package com.company;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println(name + " siger Miau");
    }

}
