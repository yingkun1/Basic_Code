package cn.luffyyk.day06.demo03;
/*
面向对象三大特征：封装、继承、多态。
封装就是将一些细节信息隐藏起来，对于外界不可见。
 */

public class Demo02Mehtod {
    public static void main(String[] args) {
        int[] array = {5, 15, 20, 25, 30 };
//        int max = array[0];
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] > max){
//                max = array[i];
//            }
//        }
//        System.out.println(max);
        int max = getMax(array);
        System.out.println("最大值: "+max);
    }

    //给我一个数组，我还给你一个最大值
    public static int getMax(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(max<array[i]){
                max = array[i];
            }
        }
        return max;
    }
}
