package cn.luffyyk.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo03Random {
    public static void main(String[] args) {
//        System.out.println("请输入一个数字：");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        Random r = new Random();
//        for (int i = 0; i < 100; i++) {
//            System.out.println(r.nextInt(num)+1);
//        }
        System.out.println("请输入一个数字:");
        int num = new Scanner(System.in).nextInt();
        for (int i = 0; i < 100; i++) {
            System.out.println(new Random().nextInt(num)+1);
        }
    }
}
