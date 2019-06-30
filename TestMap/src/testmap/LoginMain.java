package testmap;

public class LoginMain {
    public static void main(String[] args) {
//        LoginServiceForArrayList service = new LoginServiceForArrayList();
//        String s = service.loginForArrayList("郑中拓", "1234");
//        System.out.println(s);

//        LoginServiceForHashSet hashSet = new LoginServiceForHashSet();
//        String s = hashSet.loginForHashSet2("郑中拓", "123");
//        System.out.println(s);
        LoginServiceForHashMap service = new LoginServiceForHashMap();
        String s = service.loginForHashMap2("郑中拓", "123");
        System.out.println(s);
    }
}
