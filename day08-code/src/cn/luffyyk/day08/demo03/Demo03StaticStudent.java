package cn.luffyyk.day08.demo03;

/*
注意：
根据类名称访问静态成员变量的时候，全程和对象就没有关系，只和类有关系
 */

public class Demo03StaticStudent {
    public static void main(String[] args) {
        Student.room = "101教室";
        Student one = new Student("杨过",18);
        Student two = new Student("小龙女",18);

        System.out.println("one的名字: "+one.getName()+" ,one的教室:"+Student.room);
        System.out.println("=============================================");
        System.out.println("two的名字: "+two.getName()+" ,two的教室:"+Student.room);
    }
}
