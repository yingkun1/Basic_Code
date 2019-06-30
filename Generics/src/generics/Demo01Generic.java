package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();
    }

    /*
    * 创建集合对象，使用泛型
    * 好处：
    *   1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型
    *   2.把运行期异常(代码运行之后才会抛出的异常)，提升到了编译期(写代码的时候会报错)
    * 弊端：
    *   泛型规定是什么类型，那么就只能存储什么类型的数据
    * */

    private static void show02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        list.add(1);
//        list.add(true);
    }

    /*
    * 创建集合对象，不使用泛型
    * 好处：
    *   集合不使用泛型，默认的类型就是Object类型，可以存储任意类型的数据
    * 弊端：
    *   不安全，会引发异常：java.lang.ClassCastException
    * */

    private static void show01() {
        ArrayList list = new ArrayList();
        list.add("asdas");
        list.add(123);
        list.add(true);
//        Iterator iterator = list.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println((String) list.get(i));
//        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            String next1 = (String) next;
            System.out.println(next1.length());
        }
    }
}
