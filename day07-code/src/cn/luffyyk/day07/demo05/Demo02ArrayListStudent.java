package cn.luffyyk.day07.demo05;

/*
题目:
自定义4个学生对象，添加到集合，并遍历
思路：
1.自定义Student学生类，四个部分
2.创建一个集合，用来存储学生对象。泛型：<Student>
3.根据类，创建4个学生对象。
4.将4个学生对象添加到集合中，add
5.遍历集合:for、size、get
 */

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student("张雨绮", 18);
        Student stu2 = new Student("张雨菲", 19);
        Student stu3 = new Student("张雨丽", 20);
        Student stu4 = new Student("张雨婷", 21);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("姓名：" + list.get(i).getName() + " ,年龄:" + list.get(i).getAge());
        }
    }
}
