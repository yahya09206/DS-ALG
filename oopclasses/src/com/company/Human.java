package com.company;

public class Human {
    //attributes for human class
    String name;
    int age;
    int heightInInches;
    String eyecolor;

    //constructor method
    public Human(){

    }

    //methods for different behaviors
    public void speak(){
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyecolor);
    }

    public void eat(){
        System.out.println("Eating....");
    }

    public void walk(){
        System.out.println("Walking...");
    }

    public void work(){
        System.out.println("Working...");
    }
}
