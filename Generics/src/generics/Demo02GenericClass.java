package generics;

public class Demo02GenericClass {
    public static void main(String[] args) {
        GenericClass genericClass = new GenericClass();
//        genericClass.setName("张杰");
//        Object name = genericClass.getName();
//        System.out.println(name);
//        genericClass.setName(true);
//        Object name = genericClass.getName();
//        System.out.println(name);
        GenericClass<String> genericClass1 = new GenericClass<>();
        genericClass1.setName("应昆");
        String name = genericClass1.getName();
        System.out.println(name);

        GenericClass<Integer> genericClass2 = new GenericClass<>();
        genericClass2.setName(19);
        Integer name1 = genericClass2.getName();
        System.out.println(name1);
    }
}
