package com.company;

public class Main {

    public static void main(String[] args) {
	Counter myCounter = new Counter("myCounterc");
	    myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        System.out.println(myCounter);
    }
}
//abstract means handling more advanced functionality