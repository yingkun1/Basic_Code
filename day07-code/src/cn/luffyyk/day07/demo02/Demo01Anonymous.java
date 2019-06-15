package cn.luffyyk.day07.demo02;

/*
创建对象的标准格式：
类名称 对象名 = new 类名称();

匿名对象就是只有右边的对象，没有左边的名字和赋值运算符

注意事项：匿名对象只能使用唯一的一次，下次再用会创建一个新的对象

使用建议：如果确定有一个对象只需要使用唯一的一次，就可以用匿名对象
 */

public class Demo01Anonymous {
    public static void main(String[] args) {
        //左边的one就是对象的名字
        Person one = new Person();
        one.name = "高圆圆";
        one.show();
        System.out.println("这是华丽的分割线============================");

        //匿名对象
        new Person().name = "赵又廷";
        new Person().show();

    }
}
