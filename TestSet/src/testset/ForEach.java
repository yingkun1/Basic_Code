package testset;

/*
* 增强for循环：底层使用的是迭代器，使用for循环的格式，简化了迭代器的书写
* 是JDK1.5之后出现的新特性
* collection<E>extends Iterable<E>:所有的单列集合都可以使用增强for循环
* public interface Iterable<T>实现这个接口允许对象成为"foreach"语句的目标
* */

import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        for (String s : list) {
            System.out.println(s);
        }
    }

    public static void demo01(){
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
