package cn.luffyyk.day07.demo04;

import java.util.ArrayList;

/*
ArrayList当中的常用方法：
public boolean add(E,e):向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可以使用也可以不使用
但是，对于其他集合(今后学习)来说，add添加动作不一定成功。

public E get(int index):从集合当中获取元素，参数是索引编号，返回值就是被删除的元素

public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。
 */

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //向集合中添加元素:add
        boolean success = list.add("柳岩");
        System.out.println(list);
        System.out.println(success);
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);

        //从集合中获取元素:get.索引值从0开始
        String name = list.get(2);
        System.out.println(name);

        //从集合中删除元素：remove,索引值从0开始
        String whoRemoved = list.remove(3);
        System.out.println("被删除的是:"+whoRemoved);
        System.out.println(list);

        //获取集合的长度尺寸，也就是其中元素的个数
        int size = list.size();
        System.out.println("这个集合的长度是:"+size);
    }
}
