package cn.luffyyk.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println(num);

        //匿名对象使用方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println(num);

//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

//        methodParam(new Scanner(System.in));
        Scanner sc = methodReturn();
        int i = sc.nextInt();
        System.out.println("输出的是:" + i);
    }

    public static void methodParam(Scanner sc) {
        int num = sc.nextInt();
        System.out.println("输入的是:" + num);
    }

    public static Scanner methodReturn() {
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }
}
