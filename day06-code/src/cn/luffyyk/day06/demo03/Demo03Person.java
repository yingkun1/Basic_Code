package cn.luffyyk.day06.demo03;

public class Demo03Person {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "张婷";
//        person.age = 18;         //直接访问private内容是错误的写法
        person.setAge(18);
        person.show();
    }
}
