package cn.luffyyk.day07.demo01;

import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int a = sc.nextInt();
        System.out.println("请再输入一个数字:");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("两个数求和是: " + c);
    }
}
