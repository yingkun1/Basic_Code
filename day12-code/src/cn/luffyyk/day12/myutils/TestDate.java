package cn.luffyyk.day12.myutils;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TestDate {

    public static void main(String[] args) {
        //返回的是当前时间与计算机元年之间的差，并将其转换成毫秒值
//        long currentTimeMillis = System.currentTimeMillis();
//        System.out.println(currentTimeMillis);
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = new Date(1535364985172L);
//        String s1 = dateFormat.format(date);
//        System.out.println(s1);

        Date date1 = new Date(1545364985172L);
        Date date2 = new Date();           //默认使用当前的系统时间进行构建
        System.out.println(date1);
        System.out.println(date2);

        boolean before = date1.before(date2);
        boolean after = date1.after(date2);
        System.out.println(before);
        System.out.println(after);

        //修改date1的时间(毫秒值)：
        date1.setTime(1545365012877L);
        System.out.println(date1);

        //获取date1的时间(毫秒值)：
        System.out.println(date1.getTime());

        int i = date1.compareTo(date2);
        System.out.println(i);

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss");
//        String s1 = simpleDateFormat.format(date1);
//        System.out.println(s1);
//        System.out.println(simpleDateFormat.format(new Date()));
        Calendar instance = Calendar.getInstance();         //构建一个系统当前时间的calendar对象
        //calendar里面包含一个date，date里面包含一个time毫秒值
        instance.setTime(date1);
        Date time = instance.getTime();
        System.out.println(time);
        long timeInMillis = instance.getTimeInMillis();
        System.out.println(timeInMillis);
        TimeZone tz1 = instance.getTimeZone();
        System.out.println(tz1);
        instance.set(Calendar.YEAR,2015);
        int year = instance.get(Calendar.YEAR);
        System.out.println(year);
        System.out.println(instance.get(Calendar.MONTH));   //month从0开始数的
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        System.out.println(instance);


        TimeZone tz = TimeZone.getDefault();
        System.out.println(tz1.getID());
        System.out.println(tz1.getDisplayName());
    }
}
