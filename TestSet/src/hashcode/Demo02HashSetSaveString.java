package hashcode;

import java.util.HashSet;

public class Demo02HashSetSaveString {
    public static void main(String[] args) {
//        HashSet<String> hashSet = new HashSet<>();
//        String s1 = new String("abc");
//        String s2 = new String("abc");
//        hashSet.add(s1);
//        hashSet.add(s2);
//        hashSet.add("重地");
//        hashSet.add("通话");
//        hashSet.add("abc");
//        System.out.println(hashSet);
        Person1 person1 = new Person1("张杰",18);
        Person1 person2 = new Person1("张杰",18);
        Person1 person3 = new Person1("张杰",19);
        HashSet<Person1> hashSet = new HashSet<>();
        hashSet.add(person1);
        hashSet.add(person2);
        hashSet.add(person3);
        System.out.println(hashSet);
    }
}
