package main.java.com.company;

import java.util.Arrays;

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
    public static void countChars(String str)
    {
        int[] ascii= new int[256];
        for (int i = 0; i < str.length(); i++) {
            ascii[str.charAt(i)]++;

        }
        for (int x:ascii) {
            if(x!=0){
                System.out.println("Number of characters in "+ str + "for char ["+ x + "] is " + x);
            }
        }
    }
    public static void isAnagramUsingSort(String str1, String str2)
    {
        str1=str1.toLowerCase();
        char[] chars= str1.toCharArray();
        Arrays.sort(chars);
        str2= str2.toLowerCase();
        char[] chars1 = str2.toCharArray();
        Arrays.sort(chars1);
        if (Arrays.equals(chars,chars1))
        {
            System.out.println("A Anagram");
        }
        else
        {
            System.out.println("Not a anagram");
        }
    }
    public static boolean isAnagramWithoutUsingSort(String str1, String str2)
    {str1= str1.toLowerCase();
    str2=str2.toLowerCase();
        if(str1.length()!= str2.length())
        return false;
        else if(str1==null || str2== null)
            return false;
               else {
            int[] ascii = new int[256];
            for (int i = 0; i < str1.length(); i++) {
                ascii[str1.charAt(i)]++;
                ascii[str2.charAt(i)]--;

            }
            for (int x:ascii) {
                if(x!=0)
                    return false;
            }
            return true;
        }
    }
}
