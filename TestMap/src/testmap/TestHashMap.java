package testmap;

import java.util.*;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"aaa");
        hashMap.put(6,"fff");
        hashMap.put(2,"bbb");
        hashMap.put(4,"ddd");
        hashMap.put(5,"eee");
        hashMap.put(3,"ccc");
        hashMap.put(6,"kkk");
//        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
//        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            Map.Entry<Integer, String> entry = iterator.next();
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println(key+":"+value);
//        }
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey()+":"+entry.getValue()+":"+entry.getClass());
        }
//        System.out.println(entries);
//        for (int i = 0; i < entries.size(); i++) {
//            System.out.println(hashMap.get(entries));
//        }
//        hashMap.remove(3);
//        hashMap.put(3,"zzzzz");
//        hashMap.replace(3,"ooooo");
//        String s = hashMap.get(3);
//        System.out.println(s);
//        System.out.println(hashMap);
//        Set<Integer> keySet = hashMap.keySet();
//        System.out.println(keySet);
//        for (Integer integer : keySet) {
//            System.out.println(hashMap.get(integer));
//        }
//        Iterator<Integer> iterator = keySet.iterator();
//        while (iterator.hasNext()){
//            System.out.println(hashMap.get(iterator.next()));
//        }
//        int size = hashMap.size();
//        System.out.println(size);
//        hashMap.clear();
//        System.out.println(hashMap);
//        boolean b = hashMap.containsKey(3);
//        System.out.println(b);
//        boolean aaa = hashMap.containsValue("aaa");
//        System.out.println(aaa);
//        String s = hashMap.get(200);
//        System.out.println(s);
//        String orDefault = hashMap.getOrDefault(3, "没有找到");
//        System.out.println(orDefault);
//        String zzzz = hashMap.putIfAbsent(10, "zzzz");
//        System.out.println(zzzz);
//        String aaa = hashMap.putIfAbsent(1, "zzz");
//        System.out.println(aaa);
//        System.out.println(hashMap);
//        ArrayList<String> list = new ArrayList<>();
//        list.add("yingkun-9257");
//        list.add("zhanglei-9258");
//        list.add("lifei-9259");
//        System.out.println(list);
//        for (int i = 0; i < list.size(); i++) {
//            String[] split = list.get(i).split("-");
//            System.out.println(split[0]);
//        }


    }
}
