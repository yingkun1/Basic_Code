package cn.luffyyk.day11.demo08;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements cn.itcast.day11.red.OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        int leftMoney = totalMoney;
        int leftCount = totalCount;

        for (int i = 0;i<totalCount-1;i++){
            int money = r.nextInt(leftMoney / leftCount *2)+1;
            list.add(money);
            leftMoney = totalMoney-money;
            leftCount--;
        }
        list.add(leftCount);
        return list;
    };
}
