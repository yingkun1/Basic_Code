package cn.luffyyk.day11.demo07;

public class DemoGame {

    public static void main(String[] args) {
        //创建一个英雄
        Hero hero = new Hero();

        //为英雄设置名字
        hero.setName("艾希");

        //为英雄创建技能

        //通过实现接口来实现
//        Skill skill = new SkillImpl();
        //使用匿名内部类实现
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia!");
//            }
//        };
//        hero.setSkill(skill);

        //同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("Biu~Pia~Biu");
            }
        });
        hero.attack();
    }
}
