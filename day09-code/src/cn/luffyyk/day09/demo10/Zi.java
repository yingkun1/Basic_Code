package cn.luffyyk.day09.demo10;

public class Zi extends Fu {
    int num = 20;

    @Override
    public void method(){
        super.method(); //调用了父类的方法
        System.out.println("子类方法!");
    }

    public void show(){
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }
}
