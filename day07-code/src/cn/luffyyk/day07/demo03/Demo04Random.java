package cn.luffyyk.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo04Random {
    public static void main(String[] args) {
        Random r = new Random();
        int secret_num = r.nextInt(100)+1;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("请输入一个数字(1,100)：");
            int num = sc.nextInt();
            if (secret_num==num){
                break;
            }else {
                if (secret_num>num){
                    System.out.println("你输入的数字小了一些!请重猜");
                }else{
                    System.out.println("你输入的数字大了一些！请重猜");
                }
            }
        }
        System.out.println("恭喜你，猜对了，隐藏的数字是："+secret_num);
    }
}
