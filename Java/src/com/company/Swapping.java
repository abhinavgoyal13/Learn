package com.company;

public class Swapping {
    public static void swap2Int(int x,int y)
    {
        int temp ;
        temp =y ;
        y=x;
        x=temp;
        System.out.println("Swapped variables is " + x + "," + y);
    }
    public static void swapwithoutTemp(int x,int y)
    {
        x= x+y;
        y = x-y;
        x= x-y;
        System.out.println("Swapped variables is " + x + "," + y);

    }

}
