package testmap;
/*
* java.util.Hashtable<K,V>集合 implements Map<K,V>接口
*
* Hashtable：底层也是一个哈希表，是一个线程安全的集合，是单线程集合，速度慢
* HashMap:底层也是一个哈希表，是一个线程不安全的集合，是多线程的集合，速度快
*
* HashMap集合(之前所学的所有的集合)：可以存储null值，也可以将null作为键
* Hashtable集合，不能存储null值，null键
*
* Hashtable和Vector集合一样，在jdk1.2版本之后被更加先进的集合(HashMap,ArrayList)取代了
* Hashtable的子类Properties依然活跃在历史舞台
* Properties集合是唯一一个和IO流相结合的集合
*
* */
import java.util.Hashtable;

public class Demo03HashTable {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();
//        hashtable.put(null,"a");
//        hashtable.put("a",null);
//        hashtable.put(null,null)
        char a = 'c';
        hashtable.put("c","g");
        boolean b = hashtable.containsKey(a+"");
        System.out.println(b);
//        System.out.println(hashtable);
    }
}
