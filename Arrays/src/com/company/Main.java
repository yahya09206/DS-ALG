package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Define Array
        int[] myIntArray = new int[25]; //{1,2,3,4,5,6,7,8,9,10};
        //Save value of array
        double[] myDoubleArray = new double[10];
        //Retrieve value from array
//        System.out.println(myIntArray[5]);
//        System.out.println(myIntArray[6]);
//        System.out.println(myIntArray[8]);
        //For loop to retrieve values
        for(int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}

//Arrays allow you to store a sequence of values
//Index starts at position 0
//.length will give you length of array instead of hardcoding.