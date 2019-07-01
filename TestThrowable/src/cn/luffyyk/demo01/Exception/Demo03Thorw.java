package cn.luffyyk.demo01.Exception;
/*
    throw关键字
    作用：
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式：
        throw new xxxException("异常产生的原因");
    注意:
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new必须是Exception或者是Exception的子类对象
        3.throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
                throw关键字后边创建的是RuntimeException或者是RuntimeException的子类对象，我们可以不处理,默认交给JVM处理(打印异常对象，中断程序)
                throw关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常，要么throws,要么try{}catch(){}
 */

import java.util.Objects;

public class Demo03Thorw {
    public static void main(String[] args) {
//        int[] arr = {1,2,3};
        int[] arr = null;
        int element = getElement(arr, 2);
        System.out.println(element);
    }


    /*
    以后(工作中)我们首先必须对方法传递过来的参数进行合法性校验
    如果参数不合法，那么我们就必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题
     */
    private static int getElement(int[] arr,int index) {
        /*
            我们可以对传递过来的参数数组,进行合法性校验
            如果数组arr的值是null
            那么我们就抛出空指针异常，告知方法的调用者"传递的数组的值是null"
         */
//        if (arr == null){
//            throw new NullPointerException("传递的数组是空指针");
//        }
        Objects.requireNonNull(arr,"传递的数组的值是null");
        if (index>= arr.length||index<0){
            throw new ArrayIndexOutOfBoundsException("传递的索引值超过了数组的边界！");
        }
        return arr[index];
    }
}
