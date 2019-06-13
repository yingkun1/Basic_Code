package cn.luffyyk.day06.demo01;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int [] array = {10,20,30,40,50,60};
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println(array[array.length-1] + "]");

        System.out.println("===========================================");

        System.out.println(Arrays.toString(array));
    }
}
