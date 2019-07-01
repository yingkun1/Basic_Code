package VarArgs;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01VarArgs {
    public static void main(String[] args) {
//        int i = addmethod(8, 9, 10,11);
//        System.out.println(i);
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list,"a","b","c","d","e");
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        Collections.addAll(list,1,3,2,4);
//        Collections.sort(list); //默认是按升序排序：[1, 2, 3, 4]
//        System.out.println(list);
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list,"a","c","b");
        Collections.sort(list);
        System.out.println(list);
    }

    private static int addmethod(int...arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }

}
