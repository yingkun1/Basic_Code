package Collections;

import java.util.ArrayList;
import java.util.Collections;

/*
* java.utils.Collections是集合工具类,用来对集合进行操作。部分方法如下：
* public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
*
* 注意：
*   sort(List<T> list)使用前提
*   被排序额集合里边存储的元素，必须实现Comparable,重写接口中的方法compareTo定义排序额规则
*
* Comparable接口的排序规则
*   自己(this) - 参数：升序
*    @Override
*    public int compareTo(Person o) {
*       return o.getAge() - this.getAge();  //按年龄升序排序
*    }
* */

public class Demo02Sort {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("张三",18));
        list.add(new Person("李四",20));
        list.add(new Person("王五",15));
        Collections.sort(list);
        System.out.println(list);
    }
}
