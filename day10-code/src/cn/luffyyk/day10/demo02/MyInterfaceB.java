package cn.luffyyk.day10.demo02;

public interface MyInterfaceB {
    //错误写法!接口不能有静态代码块
//    static {
//
//    }
    //错误写法!接口不能有构造方法
//    public MyInterfaceA(){
//
//    }
    public void methodB();

    public abstract void methodAbs();

    public default void methodDefault(){
        System.out.println("默认方法BBBBB");
    }
}
