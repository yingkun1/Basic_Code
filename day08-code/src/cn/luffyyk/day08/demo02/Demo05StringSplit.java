package cn.luffyyk.day08.demo02;

/*
分割字符串的方法：
public String[] split(String regex):按照参数的规则，将字符串切分成为若干部分

注意事项：
split方法的参数其实就是一个"正则表达式",今后学习。
今天要注意：如果按照英文句点"."进行切分，必须写"\\."(两个反斜杠)
 */

public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] strings = str1.split(",");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }

        String str2 = "hello world java";
        String[] strings1 = str2.split(" ");
        for (int i = 0; i < strings1.length; i++) {
            System.out.println(strings1[i]);
        }

        String str3 = "eee.fff.ggg";
        String[] strings2 = str3.split("\\.");
        System.out.println(strings2.length);
        for (int i = 0; i < strings2.length; i++) {
            System.out.println(strings2[i]);
        }
    }
}
