package testlist;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(20);
        list2.add(30);
        Integer[] x = new Integer[list1.size()];
        list1.toArray(x);
        System.out.println(x.length);
//        Object[] objects = list1.toArray();
//        for (int i = 0; i < objects.length; i++) {
//            System.out.println(objects[i]);
//        }
//        List<Integer> list = list1.subList(2, 4);
//        System.out.println(list);
//        list1.removeAll(list2);   //差集
//        list1.retainAll(list2);  //交集
//        System.out.println(list1);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("a");
//        System.out.println(list);
//        list.remove("a");
//        System.out.println(list);
//        list1.remove(new Integer(60));
//        System.out.println(list1);
//        list1.set(2,300);
//        System.out.println(list1);
//        list1.addAll(2,list2);
//        Integer remove = list1.remove(100);
//        System.out.println(list1);
//        System.out.println(remove);
//        int index = list1.indexOf(100);
//        System.out.println(index);
//        list1.clear();
//        boolean contains = list1.contains(100);
//        System.out.println(contains);
//        System.out.println(list1);
//        ArrayList<String> list3 = new ArrayList<>();
//        list3.add("sdasd");
//        list3.add("sdasd1");
//        list3.add("sdasd2");
//        list3.add("sdasd3");
//        list1.addAll(list3);
//        ArrayList list = new ArrayList();
//        list.add("abcdefg");
//        list.add(10);
//        list.add(true);
//        list.add(3.4);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
//        list.add("e");
//        list.add("a");
//        System.out.println(list);  //list底层重写了toString方法
//        System.out.println(list.size());
//        System.out.println(list.get(16));        //IndexOutOfBoundsException
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            list.remove(0);
//        }
//        System.out.println(list);
    }
}
