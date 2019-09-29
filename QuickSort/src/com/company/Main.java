package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2){
            return;
        }

        // find index of pivot when array is sorted
        int pivotIndex = partition(input, start, end);
        // quick sort left subarray
        quickSort(input, start, pivotIndex);
        // quick sort right subarray
        quickSort(input, pivotIndex + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        // This is using the first element as the first pivot
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            // use j to look for elements that are less than pivots
            while (i < j && input[--j] >= pivot);
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot);
            if (i < j) {
                input[j] = input[i];
            }
        }

        input[j] = pivot;
        return j;
    }
}
