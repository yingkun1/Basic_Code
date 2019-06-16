package cn.luffyyk.day08.demo02;

/*
题目：
定义一个方法，把数组{1,2,3}按照指定格式拼接成一个字符串，格式参照如下:[word1#word2#word3]

分析：
1.首先准备一个int[]数组，内容是：1、2、3
2.定义一个方法，用来将数组变成字符串
三要素
返回值类型：String
方法名称：fromArrayToString
参数列表：int[]
3.格式：[word1#word2#word3]
用到:for循环、字符串拼接、每个数组元素之前都有一个word字样、分隔使用的是#
 */

public class Demo06StringPractise {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        String s = fromArrayToString(array);
        System.out.println(s);
    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length - 1; i++) {
            str = str + "word".concat(array[i] + "#");
        }
        str = str + "word" + array[array.length - 1] + "]";
        return str;
    }
}
