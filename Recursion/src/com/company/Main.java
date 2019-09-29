package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(3));

    }

    // Method to get factorial of n
    public static int recursiveFactorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * recursiveFactorial(num - 1);
    }

    // Method to calculate factorial
    public static int iterativeFactorial(int num) {
        // Check if num = 0
        if (num == 0){
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        }

        return factorial;
    }
}
