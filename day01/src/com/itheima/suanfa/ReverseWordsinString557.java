package com.itheima.suanfa;

public class ReverseWordsinString557 {
    public static String reverseWords(String s) {
        char[] ch = s.toCharArray();
        int start=0;

        for (int i = 0; i < ch.length; i++) {
            if(s.charAt(i)==' '){
                swap(ch, start, i-1);
                start=i+1;
            }else if(i==ch.length-1){
                swap(ch, start, i);
            }
        }

        return new String(ch);
    }


    public static void swap(char[] s,int i,int j){
        while (i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        String s = "Hello World!";
        String str = reverseWords(s);
        System.out.println(str);

    }
}
