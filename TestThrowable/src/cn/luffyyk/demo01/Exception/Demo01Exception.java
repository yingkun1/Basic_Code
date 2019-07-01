package cn.luffyyk.demo01.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Exception {
    public static void main(String[] args) {
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        Date parse = null;
//        try {
//            parse = dateFormat.parse("1999-038");
//        } catch (ParseException e) {
//            System.out.println("时间格式有问题，出现异常，对其进行了捕获！");
//        }
//        System.out.println(parse);
//        int[] array = new int[1024*1024*1024];  //OutOfMemoryError内存溢出的错误，创建的数组太大了，超出了给JVM分配的内存
        int[] array = new int[1024*1024];
    }
}
