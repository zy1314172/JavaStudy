package com.itheima.suanfa;

public class ReverseString344 {
    public static void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i < j; i++,j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }
}
