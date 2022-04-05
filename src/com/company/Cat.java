package com.company;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void makeNoise(){
        System.out.println(name + " siger Miau");
    }

    public boolean eat(String foodType){
        System.out.println("yey! " + name + " elsker at spise " + foodType);
        return true;
    }

    public void showMood(boolean isHappy){
        if(isHappy){
            System.out.println("*purring*");
        } else {
            System.out.println("*hisses*");
        }

    }

}