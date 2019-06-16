package cn.luffyyk.day08.demo04;

/*
java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

public static double abs(double num):获取绝对值。有多钟重载。
public static double ceil(double num):向上取整
public static double floor(double num):向下取整
public static long round(double num):四舍五入

Math.PI代表近似的圆周率常量(double).
 */

public class Demo03Math {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(8.9));
        System.out.println(Math.abs(3.9));
        System.out.println(Math.abs(0));
        System.out.println(Math.abs(-12.8));
        System.out.println("=============================");

        //向上取整
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(2.1));

        //向下取整
        System.out.println(Math.floor(31.8));
        System.out.println(Math.floor(31.2));
        System.out.println(Math.floor(32.0));

        System.out.println(Math.round(11.6));
        System.out.println(Math.round(11.4));

        System.out.println(Math.PI);
    }
}
