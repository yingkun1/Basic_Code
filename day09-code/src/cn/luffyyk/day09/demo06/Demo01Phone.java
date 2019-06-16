package cn.luffyyk.day09.demo06;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.send();
        phone.show();

        System.out.println("=============================================");

        NewPhone phone1 = new NewPhone();
        phone1.call();
        phone1.send();
        phone1.show();
    }
}
