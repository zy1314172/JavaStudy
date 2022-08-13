package com.itheima.hello;

import java.util.*;

public class HelloWorld {
    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        /*
//
//         */
//        System.out.println();
//        System.out.println("HelloWorld.main");
//        System.out.println("args = " + Arrays.deepToString(args));
//        System.out.println("args = " + args);
//        System.out.println("什么鬼东西哦");
//        System.out.println(666);
//
////        Scanner sc = new Scanner(System.in);
////        int age = sc.nextInt();
////        System.out.println(age);
////
////        System.out.println(age);
//
//        int sum = 0;
//        for (int i = 0; i <=1000 ; i++) {
//            sum += i;
//        }
//        System.out.println(sum);
//
//        for (int i = 100; i < 1000 ; i++) {
//            int ge = i % 10;
//            int shi = i / 10 % 10;
//            int bai = i / 100;
////            System.out.println(ge+" "+shi+" "+bai+" "+i);
//            if(ge*ge*ge + shi*shi*shi + bai*bai*bai == i){
//                System.out.print(i+" ");
//            }
//        }
//
//        System.out.println();
//        double paperSize = 0.1;
//        int count = 0;
//        while(paperSize < 8848860){
//            paperSize *= 2;
//            count++;
//        }
//        System.out.println(paperSize+" "+count);
//        Scanner sc = new Scanner(System.in);
//        int okPassword = 20211122;
//        while(true){
//            System.out.println("请输入正确的密码:");
//            int password = sc.nextInt();
//            if(password == okPassword){
//                System.out.println("登录成功！");
//                break;
//            }
//        }
////        System.out.println("登录成功！");
//        System.out.println(1+1);

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 0; j <= 5; j++) {
//                System.out.println("第"+i+"天"+"哈哈哈");
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        Random r = new Random();
//        int key = r.nextInt(500);
//        System.out.print("请输入您猜的值:");
//        int guess = sc.nextInt();
//        while(true){
//            if(guess == key){
//                System.out.println("您猜对了！");
//                break;
//            }else if(guess > key){
//                System.out.println("您猜的有点大了！");
//            }else{
//                System.out.println("您猜的有点小了！");
//            }
//            guess = sc.nextInt();
//        }

//        int[] arr = new int[3];
//        for (int i : arr) {
//            System.out.println(i);
//        }
//        for (int i=0;i<arr.length;i++) {
//            System.out.println(arr[i]);
//        }

//        int[] arr = {15, 9000, 10000, 20000, -5};
//        int max = arr[0];
//        for (int i : arr) {
//            max = i > max ? i : max;
//        }
//        System.out.println(max);

//        Random r = new Random();
//        int[] arr = new int[5];
//        for(int i = 0;i < 5;i++){
//            arr[i] = r.nextInt(20) + 1;
//        }
//        Scanner sc = new Scanner(System.in);
//        OUT:
//        while (true){
//            System.out.print("请输入您猜测的值：");
//            int guessData = sc.nextInt();
//
//            for (int i = 0; i < arr.length; i++) {
//                if(guessData == arr[i]){
//                    System.out.println("恭喜您猜中了"+"位置在第"+(i+1)+"个");
//                    for (int i1 : arr) {
//                        System.out.print(i1+" ");
//                    }
//                    break OUT;
//                }
//            }
//
//            System.out.println("请重新猜测！");
//        }

//        int[] arr = {1,9,3,5,7,10,36,28,45,16};
//        sortArr(arr, true);
//        for (int i : arr) {
//            System.out.println(i);
//        }


    }

    public static void sortArr(int[] arr, boolean flag){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (flag){
                    if (arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]=temp;
                    }
                }else{
                    if (arr[j] < arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]=temp;
                    }
                }

            }
        }
    }
    public String reorderSpaces(String text) {
        StringBuilder sb =new StringBuilder();
        int spaceCount = 0;
        List<String> words = new ArrayList<String>();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' '){
                spaceCount++;
            }else {
                int j = i + 1;
                while (j < text.length() && text.charAt(j) != ' '){
                    j++;
                }
                words.add(text.substring(i, j));
                i = j - 1;
            }
        }

        if (words.size() == 1){
            sb.append(words.get(0));
            for (int i = 0; i < spaceCount; i++) {
                sb.append(' ');
            }
        }else{
            int gap = spaceCount / (words.size() - 1);
            StringBuilder space = new StringBuilder();
            for (int i = 0; i < gap; i++) {
                space.append(' ');
            }
            int left = spaceCount % (words.size() - 1);
            for (int i = 0; i < words.size(); i++) {
                sb.append(words.get(i));
                if (i != words.size() - 1){
                    sb.append(space);
                }
            }
            for (int i = 0; i < left; i++) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }

}
