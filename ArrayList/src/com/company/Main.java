package com.company;
import java.util.*;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Define array of 10 integers
        int[] myIntegers = getIntegers(5);
        //pass my integers to print array method
        int[] sorted = sortIntegers(myIntegers);
        printArray(sorted);
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
