package testlinked;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestLinked {
    public static void main(String[] args) {
        long time1 = System.currentTimeMillis();
//        ArrayList<String> list = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
//            list.add("a");
            linkedList.add("a");
        }
        long time2 = System.currentTimeMillis();
        System.out.println("arraylist向后追加元素的时间："+(time2-time1));
    }
}
