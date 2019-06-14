package cn.luffyyk.day06.demo04;

public class Demo01Person {
    public static void main(String[] args) {
        Person person = new Person();
        //设置自己的名字
        person.name = "王思聪";
        person.sayHello("王宝强");
        System.out.println(person);
    }
}
