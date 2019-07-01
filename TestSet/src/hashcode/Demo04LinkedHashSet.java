package hashcode;

/*
* java.util.LinkedHashSet extends HashSet
* LinkedHashSet集合特点：
*   底层回一个哈希表(数组+链表/红黑树)+链表：多了一条链表(记录元素的存储顺序)，保证元素有序
* */

import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("www");
        linkedHashSet.add("123");
        linkedHashSet.add("abc");
        System.out.println(linkedHashSet);
    }
}
