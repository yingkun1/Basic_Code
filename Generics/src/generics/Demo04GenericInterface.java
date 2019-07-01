package generics;

public class Demo04GenericInterface {
    public static void main(String[] args) {
//        GenericInterfaceImpl genericInterface = new GenericInterfaceImpl();
//        genericInterface.method("应昆sdasd");
        GenericInterfaceImpl2<String> impl2 = new GenericInterfaceImpl2<>();
        impl2.method("应昆");
    }
}
