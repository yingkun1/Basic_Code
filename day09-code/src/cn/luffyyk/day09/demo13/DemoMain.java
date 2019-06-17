package cn.luffyyk.day09.demo13;

public class DemoMain {

    public static void main(String[] args) {
//        Animal animal = new Animal();            //错误写法
//        Dog dog = new Dog();    //错误写法
        Dog2Ha dog2Ha = new Dog2Ha();              //这是普通类，可以直接new对象
        dog2Ha.sleep();
        dog2Ha.eat();

        DogGolden dogGolden = new DogGolden();
        dogGolden.sleep();
        dogGolden.eat();
    }
}
