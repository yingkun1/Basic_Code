package generics;

/*
* 定义含有泛型的方法：泛型定义在方法的修饰符和返回值类型之间(返回值类型的左边，static的右边)
* 格式：
*   修饰符<泛型> 返回值类型   方法名(参数列表(使用泛型)){
*   方法体
* }
*
* 含有泛型的方法，在调用方法的时候确定泛型的数据类型
* 传递什么类型的参数，泛型就是什么类型
* */

public class GenericMethod {
    //定义一个含有泛型的普通方法
    public <M> void demo01(M m){
        System.out.println(m);
    }

    //定义一个含有泛型的静态方法
    public static <M> void  demo02(M m){
        System.out.println(m);
    }

}
