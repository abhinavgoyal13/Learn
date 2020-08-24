package com.company;

public class StringCodes {
    public static void reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        System.out.println("Reversed String is " + sb.reverse());
    }

    public static void reverseStringUsingToCharArray(String str) {
        char[] ch = str.toCharArray();
        System.out.print("Reversed String is ");
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);

        }
        System.out.println();
    }

    public static void reverseStringUsingSwap(String str) {
        int i = 0;
        int j = str.length() - 1;
        StringBuilder sb = new StringBuilder(str);
        while (i <= j) {
            char temp = str.charAt(j);
            sb.setCharAt(j, str.charAt(i));
            sb.setCharAt(i, temp);
            i++;
            j--;
        }
        System.out.println("Reversed String is " + sb.toString());
    }
    public  static void countChars(String str)
    {

    }
    public static void isAnagram(String str)
    {

    }
}
