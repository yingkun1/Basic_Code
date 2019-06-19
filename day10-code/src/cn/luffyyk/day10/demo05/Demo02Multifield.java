package cn.luffyyk.day10.demo05;

/*
在多态的代码当中,成员方法的访问规则是:
    看new的是谁,就优先用谁,没有则向上找

口诀:编译看左边,运行看右边
对比一下：
成员方法:编译看左边,运行看右边
成员变量:编译看左边,运行还看左边
 */

public class Demo02Multifield {

    public static void main(String[] args) {
        Fu obj = new Zi();           //多态

        obj.method();              //父子都有，且new的是Zi，优先用Zi
        obj.methodFu();            //子类没有，父类有,向上找父类
//        obj.methodZi();          //错误写法
        //编译看左边,左边是Fu,Fu当中没有methodZi方法,所以编译器报错

    }
}
