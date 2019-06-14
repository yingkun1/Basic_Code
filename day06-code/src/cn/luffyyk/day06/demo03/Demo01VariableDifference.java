package cn.luffyyk.day06.demo03;
/*
java中局部变量和成员变量的区别
1.定义的位置不一样【重点】：
局部变量：定义在方法中
成员变量：定义在类中

2.作用的范围不一样【重点】：
局部变量：只能在方法内部使用
成员变量：可以在整个类中使用

3.默认值不一样【重点】：
局部变量：若想要使用局部变量，必须要手动将其赋值
成员变量：系统自动赋予默认值，和数组的规则一样。

4.内存的位置不一样【了解】：
局部变量：位于栈内存
成员变量：位于堆内存

5.生命周期不一样【了解】：
局部变量：随着方法进栈而诞生，随着方法出栈而销毁
成员变量：随着对象的创建而诞生，随着对象被垃圾回收而销毁

 */
public class Demo01VariableDifference {
    String name;  //成员变量

    public void methodA(){
        int num = 20;  //局部变量
        System.out.println(num);
        System.out.println(name);
    }

    public void methodB(int param){ //方法的参数就是局部变量，方法的参数在方法被调用的时候，是会传值进来的。那时就会有值
        System.out.println(param);
        int age;
//        System.out.println(age); //没有赋值初始化的局部变量是不能够使用的。
//        System.out.println(num); //这个num是局部的变量，不能够在外面访问。
        System.out.println(name);
    }
}
