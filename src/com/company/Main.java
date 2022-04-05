package com.company;

public class Main {

    public static void main(String[] args) {


        evenMoreMain mainer = new evenMoreMain();
        Cat bamse = new Cat("Bamse");
        Dog viggo = new Dog("Viggo");

        mainer.hi();

        bamse.makeNoise();
        viggo.makeNoise();

        bamse.eat("kattemad");
        viggo.eat("hundemad");

        bamse.showMood(false);
        viggo.showMood(true);

        bamse.showMood(true);
    }
}
