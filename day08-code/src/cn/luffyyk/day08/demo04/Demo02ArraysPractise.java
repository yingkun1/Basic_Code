package cn.luffyyk.day08.demo04;

/*
题目：
请使用Arrays相关的API，将一个随机字符串中的所有字符升序排列，并倒序打印
 */

import java.util.Arrays;

public class Demo02ArraysPractise {
    public static void main(String[] args) {
        String str = "sdadasdkjasdbjsd8872312asdasd12123";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
//        for (int i = chars.length - 1; i >= 0; i--) {
//            System.out.println(chars[i]);
//        }
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
