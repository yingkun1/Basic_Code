package cn.luffyyk.day09.demo14;

import java.util.ArrayList;
import java.util.Random;

public class Memeber  extends User{

    public Memeber() {
    }

    public Memeber(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> list){
        Random r = new Random();
        int index = r.nextInt(list.size());
        //从多个红包中随机抽取一个给自己,并同时在list中删除这个红包
        Integer detal = list.remove(index);
        //查看自己当前余额
        int money = super.getMoney();
        //修改自己当前的余额
        super.setMoney(money+detal);
    }
}
