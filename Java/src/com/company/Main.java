package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Abhinav Goyal");
        //Fibonacci
      Fibonacci.fibonacciByLimit(100);
      Fibonacci.fibonacciByNth(5);
      //numbercodes
        //reverse a digit
        NumberCodes.reverseNumber(12345);
        NumberCodes.powerOfNumber(2,3);
        NumberCodes.randomNumbers(100);
        NumberCodes.randomNumbers(10,12);
        NumberCodes.factorial(6);
        NumberCodes.powerOfNumber(3,3);



        // Swapping
        Swapping.swap2Int(2,3);
        Swapping.swapwithoutTemp(2,3);

        //Greatest of numbers
        int[] arr = new int[10];
        int i=1;
        /*
        for (int x: arr) {
            x=i;
            i++;
            System.out.println(x);

        } */
        for (int j = 0; j < arr.length; j++) {
            arr[j]=j+1;
            System.out.println(arr[j]);

        }
        GreatestNumbers.greatestOfArray(arr);
        GreatestNumbers.greatestOfArraysUsingSwap(arr);
        GreatestNumbers.halfPyramid();

        // String codes
        StringCodes.reverseString("Abhinav");
        StringCodes.reverseStringUsingToCharArray("Abhinav");
        StringCodes.reverseStringUsingSwap("Abhilash");
    }
}
