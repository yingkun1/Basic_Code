package cn.luffyyk.day08.demo02;

import java.util.Scanner;


public class Dem07StringCount {
    public static void main(String[] args) {
        int uppercase_num = 0;
        int lowercase_num = 0;
        int number_num = 0;
        int other_num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("请随机输入一串字符串");
        String str = sc.next();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                uppercase_num++;
            } else if (chars[i] >= 'a' && chars[i] <= 'z') {
                lowercase_num++;
            } else if (chars[i] >= '0' && chars[i] <= '9') {
                number_num++;
            } else {
                other_num++;
            }
        }
        System.out.println("大写字母的个数: "+uppercase_num);
        System.out.println("小写字母的个数: "+lowercase_num);
        System.out.println("数字的个数: "+number_num);
        System.out.println("其他的个数: "+other_num);
    }
}

