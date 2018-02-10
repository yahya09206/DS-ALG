package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //new instance of new human class
        Human tom;

        //new human object
        tom = new Human();
        tom.age = 5;
        tom.eyecolor = "brown";
        tom.heightInInches = 72;
        tom.name = "Tom from myspace";

        tom.speak();


    }
}
