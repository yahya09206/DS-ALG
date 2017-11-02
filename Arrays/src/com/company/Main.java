package com.company;

import java.util.Scanner;

public class Main {

    //Scanner for user input
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //Define array of 10 integers
        int[] myIntegers = getIntegers(5);
        //pass my integers to print array method
        printArray(myIntegers);
    }

    //get integers from user input
    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values:\r" );
        //define array from user input
        int[] values = new int[number];
        for(int i = 0; i < values.length; i++){
            values[i] = scanner.nextInt();
        }
        return values;
    }

    //print array values
    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    //method for sorting the array
    public static int[] sortIntegers(int[] array){
        //copy input from user to new array using a new array
        int[] sortedArray = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sortedArray[i] = array[i];
        }
        boolean flag = true;
        int temp;
        while(flag){
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

}

//Arrays allow you to store a sequence of values
//Index starts at position 0
//.length will give you length of array instead of hardcoding.


// write your code here
//        //Define Array
//        int[] myIntArray = new int[25]; //{1,2,3,4,5,6,7,8,9,10};
//        //Save value of array
//        double[] myDoubleArray = new double[10];
//        //Retrieve value from array
////        System.out.println(myIntArray[5]);
////        System.out.println(myIntArray[6]);
////        System.out.println(myIntArray[8]);
//        //For loop to retrieve values
//        for(int i = 0; i < myIntArray.length; i++){
//            myIntArray[i] = i * 10;
//        }
//        printArray(myIntArray);
//    }
//
//    public static void printArray(int[] array){
//        for(int i = 0; i < array.length; i++){
//            System.out.println("Element " + i + ", value is " + array[i]);
//        }


//   int[] myIntegers = getIntegers(5);
//        for(int i = 0; i < myIntegers.length; i++){
//            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
//        }
//        System.out.println("The average is " + getAverage(myIntegers));
//
//    }
//
//    public static int[] getIntegers(int number){
//        System.out.println("Enter " + number + " integer values. \r");
//        //define array
//        int[] values = new int[number];
//        for(int i = 0; i < values.length; i++){
//            values[i] = scanner.nextInt();
//        }
//        return values;
//    }
//
//    //method for calculating average of numbers
//    public static double getAverage(int[] array){
//        int sum = 0;
//        for(int i = 0; i < array.length; i++){
//            sum += array[i];
//        }
//        //cast to double
//        return (double) sum / (double)array.length;