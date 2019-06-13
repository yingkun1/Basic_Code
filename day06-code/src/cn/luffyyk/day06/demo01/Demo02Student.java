package cn.luffyyk.day06.demo01;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.age = 20;
        //如果成员变量没有进行初始化赋值，那么将会有一个默认值，规则和数组一样。
        System.out.println(stu.age);
        stu.eat();
    }
}
