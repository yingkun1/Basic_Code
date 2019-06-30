package testset;

import java.util.HashSet;
import java.util.Iterator;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
//        stringHashSet.add(new String("应昆"));
//        stringHashSet.add(new String("应昆"));
//        stringHashSet.add(new String("应昆"));
//        stringHashSet.add(new String("应昆"));
//        stringHashSet.add(new String("应昆"));
//        System.out.println(stringHashSet);
//        System.out.println(stringHashSet.size());
        HashSet<Person> people = new HashSet<>();
//        Person person1 = new Person("应昆");
//        people.add(person1);
//        people.add(person1);
//        people.add(person1);
//        people.add(person1);
//        people.add(person1);
//        System.out.println(people);
//        System.out.println(people.size());
        people.add(new Person("郑中拓",9));
        people.add(new Person("郑中拓",2));
        people.add(new Person("郑中拓",3));
        people.add(new Person("郑中拓",4));
        people.add(new Person("郑中拓",5));
//        System.out.println(people+":"+people.iterator().next().getNumber());
//        System.out.println(people.size());
        System.out.println(people);
        HashSet<String> set = new HashSet<>();
//        set.add("A");
//        set.add("C");
//        set.add("b");
//        set.add("a");
//        set.add("B");
//        set.add("c");
//        //获取一个迭代器对象：
//        Iterator<String> iterator = set.iterator();     //Iterator接口，多态的效果
//        //如果还有元素，那么就继续迭代
//        while(iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(set);
//        set.remove("B");
//        System.out.println(set);
//        for (String s : set) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.iterator().hasNext());
//        }
    }
}
