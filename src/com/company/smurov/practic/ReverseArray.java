package com.company.smurov.practic;

public class ReverseArray {

    public static String reverseByArray(String s) {

        char[] a = s.toCharArray();
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; i++) {
            b[(a.length - 1) - i] = a[i];
        }
        return new String(b);
    }

    public static void main(String[] args) {
        String string = "test string";
        System.out.print(reverseByArray(string));
    }
}
