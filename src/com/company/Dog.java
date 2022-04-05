package com.company;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println(name + " siger Vov!");
    }

    public boolean eat(String foodType){
        System.out.println("yey! " + name + " elsker at spise " + foodType);
        return true;
    }

}