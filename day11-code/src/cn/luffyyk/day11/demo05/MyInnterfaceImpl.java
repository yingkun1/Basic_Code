package cn.luffyyk.day11.demo05;

public class MyInnterfaceImpl implements MyInterface {
    @Override
    public void method() {
        System.out.println("实现类覆盖重写了方法!");
    }

    @Override
    public void method2() {
        System.out.println("实现类覆盖重写了方法222！");
    }
}
