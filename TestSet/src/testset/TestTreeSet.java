package testset;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
//        TreeSet<String> strings = new TreeSet<>();
//        strings.add("b");
//        strings.add("C");
//        strings.add("A");
//        strings.add("c");
//        strings.add("a");
//        strings.add("B");
//        System.out.println(strings.size());
//        System.out.println(strings);

        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("郑中拓",1));
        people.add(new Person("郑中拓",2));
        people.add(new Person("郑中拓",3));
        people.add(new Person("郑中拓",4));
        people.add(new Person("郑中拓",5));
        System.out.println(people);
        System.out.println(people.size());


//        TreeSet<String> strings = new TreeSet<>();
//        strings.add(new String("郑中拓"));
//        strings.add(new String("郑中拓"));
//        strings.add(new String("郑中拓"));
//        strings.add(new String("郑中拓"));
//        strings.add(new String("郑中拓"));
//        System.out.println(strings);
//        System.out.println(strings.size());
    }
}
