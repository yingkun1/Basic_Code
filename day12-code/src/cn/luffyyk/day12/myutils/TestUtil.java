package cn.luffyyk.day12.myutils;

public class TestUtil {

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Integer i3 = new Integer(10);
        Integer i4 = new Integer(10);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i1==i2);
        System.out.println(i1==i3);
        System.out.println(i3==i4);
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i3));
        System.out.println(i3.equals(i4));
    }
}
