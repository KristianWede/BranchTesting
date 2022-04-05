package com.company;

public class Main {

    public static void main(String[] args) {

        Cat bamse = new Cat("Bamse");
        Dog viggo = new Dog("Viggo");

        bamse.makeNoise();
        viggo.makeNoise();

        bamse.eat("kattemad");
        viggo.eat("hundemad");
    }
}