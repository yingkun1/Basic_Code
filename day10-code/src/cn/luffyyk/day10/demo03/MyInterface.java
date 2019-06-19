package cn.luffyyk.day10.demo03;

public interface MyInterface extends MyInterfaceA,MyInterfaceB {
    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
