package cn.luffyyk.day08.demo02;
/*
String当中与获取相关的常用方法有：
public int length():获取字符串当中含有的字符个数，拿到字符串长度。
public String concat(String str):将当前字符串和参数字符串拼接成为返回新值的字符串
public char charAt(int index):获取指定索引位置的单个字符（索引从0开始）
public int indexOf(String str):查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        int length = "adsadasdsadasdsadasdasd".length();
        System.out.println("字符串的长度是: "+length);

        //拼接字符串
        String str1 = "Hello";
        String str2 = "World";
        String str3 = str1.concat(str2);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        //获取指定索引位置的单个字符
        char c = "Hello".charAt(1);
        System.out.println("在索引位置1处的字符是:"+c);

        //查找参数字符串在本来字符串中出现的第一次索引的位置
        //如果没有，返回-1
        String original = "HelloWorld";
        int index = original.indexOf("llo");
        System.out.println("子字符串在原来字符串中首次出现的索引位置: "+index);
        System.out.println("Hello".indexOf("abc"));
    }
}
