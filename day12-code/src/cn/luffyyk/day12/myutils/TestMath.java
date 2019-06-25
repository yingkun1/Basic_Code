package cn.luffyyk.day12.myutils;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

public class TestMath {

    public static void main(String[] args) {
//        System.out.println(Math.ceil(1.4));          //2.0
//        System.out.println(Math.floor(1.4));        //1.0
//        System.out.println(Math.rint(1.4));         //1.0
//        System.out.println(Math.round(1.4));        //1
//        System.out.println(Math.sqrt(9));

//        Random r = new Random();
//        int i = r.nextInt(-10);
//        System.out.println(i);

//        Random r = new Random();
//        for (int i1 = 0; i1 < 10; i1++) {
//            int i = 0 - r.nextInt(10);
//            System.out.println(i);
//        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(r.nextFloat());
//        }
//        [5.0~10.9]:当需要这样范围的随机数的时候，可以将这种数进行拆分，分为整数部分[5~10] [5~11),小数部分[0~0.9]
//        for (int i = 0; i < 20; i++) {
//            float v = r.nextInt(6) + 5 + r.nextFloat();
//            System.out.println(v);
//        }

//        UUID randomUUID = UUID.randomUUID();
//        System.out.println(randomUUID);
//        System.out.println(randomUUID.toString());
////        long timestamp = randomUUID.timestamp();
////        System.out.println(timestamp);
////        System.out.println(UUID.randomUUID());
//        BigInteger bi = new BigInteger("123");
//        BigInteger bigInteger = new BigInteger("456");
//        System.out.println(bi.add(bigInteger));
//        System.out.println(bi.subtract(bigInteger));
//        System.out.println("请输入一个整数：");
//        while (true){
////            BigInteger bigInteger = getFactorial(new Scanner(System.in).nextInt());
//            int sum = getFactorial1(new Scanner(System.in).nextInt());
////            System.out.println("阶乘是:"+bigInteger);
//            System.out.println("阶乘是："+sum);
//        }

//        BigDecimal decimal = new BigDecimal("123.456");
//        BigDecimal bigDecimal = decimal.setScale(2, BigDecimal.ROUND_DOWN);     //小数点之后保留两位，向下取整
//        System.out.println(bigDecimal);

        DecimalFormat df = new DecimalFormat("000.000");
        String str1 = df.format(123.45);
        System.out.println(str1);

    }

    public static BigInteger getFactorial(int num){
        BigInteger sum = new BigInteger("1");
        for (int i = num; i > 0; i--) {
            sum = sum.multiply(BigInteger.valueOf(i));
        }
        return sum;
    }

    public static int getFactorial1(int num){
        int sum = 1;
        for (int i = num; i > 0; i--) {
            sum = sum*i;
        }
        return sum;
    }


}
