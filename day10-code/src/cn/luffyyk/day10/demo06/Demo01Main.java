package cn.luffyyk.day10.demo06;

/*
向上转型一定是安全的,没有问题的,正确的,但是也有一个弊端
对象一旦向上转型为父类,那么就无法调用子类原本特有的内容
 */

public class Demo01Main {

    public static void main(String[] args) {
        //对象的向上转型就是父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat();
//        animal.catchMouse();      错误写法

        //向下转型,进行还原动作
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //错误写法!编译不会报错，但是运行会出现异常
        //java.lang.ClassCastException
//        Dog dog = (Dog) animal;

    }
}
