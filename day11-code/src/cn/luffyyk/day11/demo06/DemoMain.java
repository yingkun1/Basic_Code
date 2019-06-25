package cn.luffyyk.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个英雄角色
        Hero hero = new Hero();
        //为英雄赋予一个名字
        hero.setName("盖伦");
        //为英雄赋予年龄
        hero.setAge(20);

        //创建一把武器
        Weapon weapon = new Weapon("多兰剑");
        //为英雄赋予武器
        hero.setWeapon(weapon);
        hero.attack();
    }

}
