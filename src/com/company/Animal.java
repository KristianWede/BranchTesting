package com.company;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();

    public abstract boolean eat(String foodType);

    public abstract void showMood(boolean isHappy);
}