package Collections;

/*
* java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下
* public static <T> void sort(List<T> list,Comparator<? super T>):将集合中元素按照指定规则排序
*
* Comparator和Comparable的区别
*   Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口，重写比较的规则compareTo方法
*   Comparator:相当于找一个第三方的裁判，对两个元素进行比较
*
*   Comparator的排序规则：
*       o1-o2:升序
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03Sort {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("b迪丽热巴",18));
        list.add(new Student("古力娜扎",16));
        list.add(new Student("马尔扎哈",19));
        list.add(new Student("a刘亦菲",18));

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1,Student o2) {
                if (o1.getAge() - o2.getAge()==0){
                    return o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list);
    }
}
