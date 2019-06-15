package cn.luffyyk.day07.demo05;

/*
题目：
 */

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> big_list = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt();
            big_list.add(num);
        }
        ArrayList<Integer> list = filterArrayList(big_list);
        System.out.println("集合中偶数的个数是:"+list.size()+"， 集合是："+list);
    }

    public static ArrayList<Integer> filterArrayList(ArrayList<Integer> list){
        ArrayList<Integer> small_list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0){
                small_list.add(list.get(i));
            }
        }
        return small_list;
    }
}
