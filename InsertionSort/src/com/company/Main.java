package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {

            // Save value of element that's going to be inserted
            int newElement = intArray[firstUnsortedIndex];

            int i;

            // Keep looking for insertion position as long as element in sorted partion > than element needed to be inserted. Decrement from left to left
            for (i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                // Shift element to right to make room for new element
                intArray[i] = intArray[i - 1];
            }
            // Assign with new element
            intArray[i] = newElement;
        }

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
}
