package cn.luffyyk.day10.demo06;

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("小猫吃鱼!");
    }

    //子类特有方法
    public void catchMouse(){
        System.out.println("猫爪老鼠!");
    }
}
