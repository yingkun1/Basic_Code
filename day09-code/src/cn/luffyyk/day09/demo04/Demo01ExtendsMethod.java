package cn.luffyyk.day09.demo04;

/*
在父子类的继承关系当中，创建子类对象，访问成员方法的规则：
    创建的对象是谁，就优先用谁，如果没有则向上找。

注意事项：
无论是成员方法还是成员变量，如果没有都是向上找父类，绝对不会向下找子类的。

重写（Override）
概念：在继承关系中，方法的名称一样，参数列表也一样
重写（Override）:建议读成覆盖重写，即方法的名称一样，参数列表也一样，一般用于子类覆盖父类的方法
重载（Overload）:方法名称一样，方法的参数不一样，举例System.out.println()这个函数根据传入的参数不一样，会有不同的实现
方法覆盖重写的特点：创建的是子类对象，则优先用子类方法
 */

public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();
        zi.method();
        System.out.println();
    }
}
