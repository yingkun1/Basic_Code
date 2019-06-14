package cn.luffyyk.day06.demo02;

public class Demo02PhoneOne {
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
        System.out.println("华丽的分割线=============================================");

        Phone phone2 = new Phone();
        System.out.println(phone2.brand);
        System.out.println(phone2.price);
        System.out.println(phone2.color);

        phone2.brand = "三星";
        phone2.price = 5999.0;
        phone2.color = "blue";

        System.out.println(phone2.brand);
        System.out.println(phone2.price);
        System.out.println(phone2.color);

        phone2.call("欧巴");
        phone2.sendMessage();


    }
}
