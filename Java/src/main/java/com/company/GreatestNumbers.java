package main.java.com.company;

public class GreatestNumbers {
    public static void greatestOfArray(int[] array)
    { int max = array[0];

    int i;
    int pos = 0;
    // max number
        for ( i = 0; i < array.length; i++) {
            if(array[i]> max)
            {
                max= array[i];
                pos=i;

            }
        }
        array[pos]=Integer.MIN_VALUE;
        // second largest number
        max= array[0];
        for ( i = 0; i < array.length; i++) {
            if(array[i]>max)
            {
                max= array[i];
            }
        }
        System.out.println("Second largest number is" + max);
    }

    public static void greatestOfArraysUsingSwap(int[] array)
    {       int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] > array[j])
                {
                    temp = array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }

            }

        }
        System.out.println("Third largest number is " + array[2]);
    }

    public static void halfPyramid()
    {
        for (int i = 0; i <=4 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
