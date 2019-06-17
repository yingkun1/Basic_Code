package cn.luffyyk.day09.demo14;

import java.util.ArrayList;

public class Manager extends User{
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redlist = new ArrayList<>();

        //查看群主的余额
        int accountMoney = super.getMoney();
        if (totalMoney > accountMoney){
            System.out.println("对不起，余额不足，不能发红包!");
            return redlist;
        }

        //设置红包的大小
        int avg = totalMoney / count;
        int mod = totalMoney % count;

        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        redlist.add(avg+mod);

        //修改群主的余额
        super.setMoney(accountMoney - totalMoney);

        return redlist;
    }

}
