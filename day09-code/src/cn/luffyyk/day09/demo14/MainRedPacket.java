package cn.luffyyk.day09.demo14;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Memeber one = new Memeber("成员A",0);
        Memeber two = new Memeber("成员B",20);
        Memeber three = new Memeber("成员C",40);

        manager.show();
        one.show();
        two.show();
        three.show();
        System.out.println("============================================");

        ArrayList<Integer> list = manager.send(20, 3);
        one.receive(list);
        two.receive(list);
        three.receive(list);

        manager.show();
        one.show();
        two.show();
        three.show();
    }
}
