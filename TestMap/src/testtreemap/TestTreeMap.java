package testtreemap;

import java.util.TreeMap;

public class TestTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(5,"e");
        treeMap.put(2,"b");
        treeMap.put(3,"c");
        treeMap.put(7,"g");
        treeMap.put(1,"a");
        treeMap.put(8,"h");
        treeMap.put(9,"i");
        treeMap.put(4,"d");
        treeMap.put(6,"f");
        treeMap.put(5,"z");
        System.out.println(treeMap);
    }
}
