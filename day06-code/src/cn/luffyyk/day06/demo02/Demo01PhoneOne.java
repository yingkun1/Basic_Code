package cn.luffyyk.day06.demo02;

public class Demo01PhoneOne {
    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        phone.brand = "苹果";
        phone.price = 8888.0;
        phone.color = "color";

        System.out.println(phone.brand);
        System.out.println(phone.price);
        System.out.println(phone.color);

        phone.call("张雷");
        phone.sendMessage();



    }
}
