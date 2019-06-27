package cn.luffyyk.day12.myutils;

import cn.luffyyk.day12.myenum.Test;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
//        String s1 = "abc";
//        String s2 = "abc";
//        String s3 = new String("abc");
//        String s4 = new String("abc");
//        System.out.println(s1==s2);             //true
//        System.out.println(s1==s3);             //false
//        System.out.println(s3==s4);             //false
//        System.out.println(s1.equals(s2));      //true          //String类将继承自Object中的equals方法重写了
//        System.out.println(s1.equals(s3));      //true          //将原有比较==的方式改为比较字符值
//        System.out.println(s3.equals(s4));      //true
//        char[] value = {'h','e','l','l','o'};
//        String str = new String(value,1,3);
//        System.out.println(str);
//        str.equals(null);   //默认的equals是比较地址的 this==obj,但是String重写了这个方法，改成了比字符串内容
//        str.hashCode();     //原来的hasHCode内存地址调用一个本地的native方法进行计算,现在是这样
        //"abc"     h=0
        //h = (0*31)+97
        //h = (97)*31+98
        //h = ((97)*31+98)*31+99

//        String str1 = "abc";
//        String str2 = "cb";
//        int i = str1.compareTo(str2);
        //按照两个字符串长度较短的那个作为比较循环的次数
        //挨个比较元素 str1[i]-str2[i],循环内如果产生结果，那么就返回那个结果值
        //如果在整个循环过程中没有出现结果，那么就用两个字符串的长度进行相减
        //返回0表示两个字符相等
//        System.out.println(i);

//        TestString testString = new TestString();
//        String cde = new String("cde");
//        System.out.println(testString);
//        System.out.println(cde);
//        String str1 = "abc";
//        char c = str1.charAt(0);
//        System.out.println(c);
//        char[] chars = str1.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }
//        byte[] bytes = str1.getBytes();
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.print(bytes[i]-96);
//        }

//        String str1 = "hello";
//        String concat = str1.concat(" world!");
//        System.out.println(str1);
//        System.out.println(concat);
//        String str1 = "a" + "b" + "c" + "d";    //数学计算  拼接符号
//        System.out.println(str1);               //过程中产生了几个String对象？字符串常量池7个
        //对象1   value[] a       "a"
        //对象2   value[] b       "b"
        //对象3   value[] {a,b}   "ab"
        //对象4   value[] c       "c"
        //对象5   value[] {a,b,c} "abc"
        //对象6   value[] d       "d"
        //对象7   value[] {a,b,c,d} abcd""

//        String str1 = "a";
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 100000000; i++) {
////            str1+="i";    //每一次利用+在原来的字符串后面拼接一个新的a+
//            str1.concat(String.valueOf(i));     //利用concat拼接字符串 一个String对象  自己的value属性，频繁创建新的小数组
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end-start);

//        String str1 = "TestString.java";
//        boolean endsWith = str1.endsWith(".java");
//        System.out.println(endsWith);
//
//        String str2 = "我爱你中国";
//        byte[] bytes = str2.getBytes();
//        for (int i = 0; i < bytes.length; i++) {
//            System.out.println(bytes[i]);
//        }
//
//        String str3 = "ajgjgjhfhdzezw";
//        int index = str3.lastIndexOf('z');
//        System.out.println(index);

//        String str1 = "";
//        String str2 = null;
//        boolean empty = str2.isEmpty();//NullPointerException
//        System.out.println(empty);

//        String str = "拓哥很帅气拓哥很帅气拓哥很帅气拓哥很帅气拓哥很帅气拓哥很帅气";
//        String replace = str.replaceFirst("帅气","美丽");
//        System.out.println(replace);

//        String str = "a-b-c-d";
//        String[] split = str.split("-",2);
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }

//        String[] useBox = {"郑中拓-123", "渡一教育-666", "java-888"};
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入账号：");
//        String name = sc.nextLine();
//        System.out.println("请输入密码：");
//        String password = sc.nextLine();
//        boolean flag = false;
//        while (true) {
//
//            for (int i = 0; i < useBox.length; i++) {
//                String[] value = useBox[i].split("-");
//                if (value[0].equals(name) && value[1].equals(password)) {
//                    System.out.println("登录成功");
//                    flag = true;
//                    break;
//
//                }
//            }
//            if (!flag) {
//                System.out.println("账号或者密码错误!");
//                break;
//            }
//        }
        String str = "abcdefg";
        String substring = str.substring(3,5);
        System.out.println(substring);

    }
}
