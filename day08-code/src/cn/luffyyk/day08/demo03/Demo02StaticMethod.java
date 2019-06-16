package cn.luffyyk.day08.demo03;

/*
一旦使用static修饰成员方法，那么这就成为了静态方法，静态方法不属于对象，而是属于类的
如果没有static关键字，那么必须首先创建对象，然后通过对象才能使用它
如果有了static关键字，那么不需要创建对象，直接就能通过类名称来使用它

无论是成员变量还是成员方法，如果有了static，都推荐使用类名称进行调用
静态变量：类名称.静态变量
静态方法：类名称.静态方法()

 */

public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.method();
        obj.methodStatic();           //正确，不推荐，这种写法在编译之后也会被javac翻译成为"类名称.静态方法名"
        MyClass.methodStatic();       //正确，推荐

        //对于本类当中的静态方法，可以省略类名称，完全等效于：Demo02StaticMethod.myMethod()
        myMethod();
        Demo02StaticMethod.myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法!");

    }
}
