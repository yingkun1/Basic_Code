package generics;

/*
* 泛型的通配符：
*   ?:代表任意的数据类型
* 使用方式：
*   不能创建对象使用
*   只能作为方法的参数使用
* */

import java.util.ArrayList;

public class GenericwildCard {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("应昆");
        list.add("张磊");
        printArray(list);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(9);
        list1.add(8);
        printArray(list1);
//        ArrayList<?> list2 = new ArrayList<>();
//        list2.add("sda");
    }

    /*
    * 定义一个方法，能遍历所有类型的ArrayList集合
    * 这时候我们不知道ArrayList集合使用什么数据类型，可以泛型的通配符?来接收数据类型
    * 注意：
    *   泛型没有继承概念
    * */
    public static void printArray(ArrayList<?> list){
        for (int i = 0; i < list.size(); i++) {
            Object o = list.get(i);
            System.out.println(o);
        }
    }
}
