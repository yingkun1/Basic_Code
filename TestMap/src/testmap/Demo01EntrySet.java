package testmap;

/*
* Map集合遍历的第二种方式：使用Entry对象遍历
*
* Map集合中的方法：
*   Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的Set视图
*
* 实现步骤：
*   1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来，存储到一个Set集合中
*   2.遍历Set集合，获取每一个Entry对象
*   3.使用Entry对象中的方法getKey()和getValue获取键与值
* */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo01EntrySet {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("黄晓明","杨颖");
        hashMap.put("冷锋","龙小云");
        hashMap.put("杨过","小龙女");
        System.out.println(hashMap);
//        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
//        System.out.println(entries);
//        for (Map.Entry<String, String> entry : entries) {
//            String value = entry.getValue();
//            System.out.println(value);
//        }
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getValue());
            System.out.println(next.getKey());
        }
    }
}
