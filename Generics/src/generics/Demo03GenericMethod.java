package generics;

public class Demo03GenericMethod {
    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.demo01("应昆");
        genericMethod.demo01(12);
        genericMethod.demo01(true);
        genericMethod.demo01(3.666);
        GenericMethod.demo02(6.8);
    }
}
