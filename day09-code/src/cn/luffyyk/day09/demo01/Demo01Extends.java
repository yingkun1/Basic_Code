package cn.luffyyk.day09.demo01;

public class Demo01Extends {
    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher teacher = new Teacher();
        //Teacher类当中虽然什么都没有写，但是会继承来自父类的method方法
        teacher.method();

        //创建了一个子类助教的的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
