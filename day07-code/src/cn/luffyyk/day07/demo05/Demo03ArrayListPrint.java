package cn.luffyyk.day07.demo05;

/*
题目：
定义以指定格式打印集合的方法（ArrayList类型作为参数）,使用{}扩展集合，使用@分隔每个元素
格式参照{元素@元素@元素}

定义方法的三要素
返回值的类型：只是进行打印而已，没有运算，没有结果，所以用void
方法名称：printArrayList
参数列表 ArrayList<String> list
 */

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("赵敏");
        list.add("宋远桥");
        list.add("张三丰");
        printArrayList(list);
    }

    public static void printArrayList(ArrayList<String> list){
        System.out.print("{");
        for (int i = 0; i < list.size()-1; i++) {
            System.out.print(list.get(i));
            System.out.print("@");
        }
        System.out.println(list.get(list.size()-1)+"}");

    }
}
