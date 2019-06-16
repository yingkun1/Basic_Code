package cn.luffyyk.day08.demo01;

/*
对于引用类型来说，==进行的是地址值的比较
双引号直接写的字符串在常量池当中，new的不在池当中

字符串常量池：程序当中直接写上额双引号字符串，就在字符串常量池中进行保存
对于基本类型来说，==是进行数值的比较
对于引用类型来说，==是进行【地址值】的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";

        char[] charArray = {'a','b','c'};
        String str3 = new String(charArray);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
    }
}
