package cn.luffyyk.day06.demo04;

public class Demo02Student {
    public static void main(String[] args) {
        Student stu2 = new Student(); //无参的构造函数
        System.out.println("华丽的分割线=======================================");
        Student stu1 = new Student("赵丽颖", 20); //全参的构造函数
        System.out.println("姓名：" + stu1.getName() + " ,年龄" + stu1.getAge());
        stu1.setAge(21);
        System.out.println("姓名：" + stu1.getName() + " ,年龄" + stu1.getAge());
    }
}
