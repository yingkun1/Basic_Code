package testmap;

/*
* JDK9的新特性：
*   List接口,Set接口，Map接口：里边增加了一个静态方法of,可以给集合一次性添加多个元素
*   static <E> List<E> of (E...elements)
*   使用前提：
*       当集合中存储的元素的个数已经确定了，不再改变的时候才会使用
*   注意：
*       1.of方法只适用于List接口，Set接口，Map接口，不使用于接口的实现类
*       2.of方法的返回值是一个不能改变的集合，集合不能再使用add,put方法添加元素，否则会抛出异常
*       3.Set接口和Map接口在调用of方法的时候，不能有重复的元素，否则会抛出异常
* */

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo04JDK9 {
    public static void main(String[] args) {
//        List<String> list = List.of("a", "b", "a", "c", "d");
//        System.out.println(list);
//        list.add("w");//UnsupportedOperationException不支持操作异常
//        System.out.println(list);

//        Set<String> set = Set.of("a", "b", "a", "c", "d"); //IllegalArgumentException
//        System.out.println(set);
//        Map<String, Integer> map = Map.of("张三", 18, "李四", 19, "王五", 20);
//        System.out.println(map);
//        map.put("赵雷",30);
    }
}
