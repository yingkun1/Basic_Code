package testmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a","a");
        hashMap.put("c","c");
        hashMap.put("b","b");
        hashMap.put("d","d");
        System.out.println(hashMap);

        LinkedHashMap<String, String> hashMap1 = new LinkedHashMap<>();
        hashMap1.put("a","a");
        hashMap1.put("c","c");
        hashMap1.put("b","b");
        hashMap1.put("d","d");
        System.out.println(hashMap1);
    }
}
