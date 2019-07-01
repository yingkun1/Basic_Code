package generics;
/*
* 泛型的上限限定： ? extends E 代表使用的泛型只能是E类型的子类/本身
* 泛型的下限限定： ? extends E 代表使用的泛型只能是E类型的父类/本身
* */
import java.util.ArrayList;
import java.util.Collection;

public class Genericadvanced {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();
        ArrayList<Object> list4 = new ArrayList<>();
        list1.add(9);
        list1.add(8);
        list1.add(7);
        list1.add(6);
        list1.add(5);
        list1.add(4);
        System.out.println(list1);
        /*
        类与类之间的继承关系：
        Integer extends Number extends Object
        String extends Object
         */
//        getElement1(list1);
//        getElement1(list2);
//        getElement1(list3);
//        getElement1(list4);

//        getElement2(list1);
//        getElement2(list2);
//        getElement2(list3);
//        getElement2(list4);
    }

    //泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
    public static void getElement1(Collection<? extends Number>coll){}

    //泛型的下限：此时的泛型?,必须是Number类型或者Number类型的父类
    public static void getElement2(Collection<? super Number>coll){}
}
