package testthrowable;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        System.out.println(10/0);
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        System.out.println(Integer.parseInt(s));
//        int[] array = new int[-1];
//        array[1]=0;
//        System.out.println(array);
//        int [][] array = new int[3][];
//        array[0][0] = 1;
//        System.out.println(array[0][0]);
//        String str = "abc";
//        char c = str.charAt(8);
//        System.out.println(c);
//        String[] number = {"1","asd","dasda"};
//        String s = number[9];
//        System.out.println(s);
        ArrayList<String> list = new ArrayList<>(-1);
        list.add("a");
        list.add("b");
        list.add("c");
        String s = list.get(4);
        System.out.println(s);
    }
}
