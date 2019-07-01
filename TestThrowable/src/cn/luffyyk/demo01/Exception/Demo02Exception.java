package cn.luffyyk.demo01.Exception;

public class Demo02Exception {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int element = getElement(arr, 3);
        System.out.println(element);
    }

    private static int getElement(int[] arr,int index) {
        int i = arr[index];
        return i;
    }
}
