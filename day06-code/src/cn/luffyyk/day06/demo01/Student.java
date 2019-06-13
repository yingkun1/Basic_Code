package cn.luffyyk.day06.demo01;

public class Student {
    //成员变量
    //注意：成员变量是直接定义在类当中的，在方法外边
    //注意：成员方法不要写static关键字
    String name;
    int age;

    //成员方法
    public void eat(){
        System.out.println("吃饭!");
    }

    public void sleep(){
        System.out.println("睡觉");
    }

    public void study(){
        System.out.println("学习！");
    }
}
