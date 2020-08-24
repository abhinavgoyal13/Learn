package com.company.CCI.Arrays;

//Algorithm to determine if string has unique characters
public class DeterminingUniqueCharacters {

    public boolean determineUniqueChars(String str) {
        str=str.toLowerCase();
        int[] ascii = new int[256];
        for (int i = 0; i < str.length(); i++) {
            ascii[str.charAt(i)]++;
        }
        for (int x : ascii) {
            if (x > 1) {
                return false;
            }
        }
        return true;
    }
}
