package cn.luffyyk.demo01.Exception;
/*
    throws关键字：异常处理的第一种方式，交给别人处理
    作用：
        当方法内部抛出异常对象的时候，那么我们就必须处理这个异常对象
        可以使用throws关键字处理异常对象，会把异常对象声明抛出给方法的调用者处理(自己不处理，给别人处理)，最终交给JVM处理--->中断处理
    格式说明：在方法声明时使用
        修饰符 返回值类型   方法名(参数列表) throws AAAException,BBBException...{
            throw new AAAException("产生的原因");
            throw new BBBException("产生的原因");
            ...
        }
    注意：
        1.throws关键字必须写在方法声明处
        2.throws关键字后边声明的异常必须是Exception或者是Exception的子类
        3.方法内部如果抛出了多个异常对象,那么throws后边必须也声明多个异常
            如果抛出的多个异常对象有父子类关系，那么直接声明父类异常即可
        4.调用了一个声明抛出异常的方法，我们就必须处理声明的异常
            要么继续使用throws抛出异常，交给方法的调用者处理，最终交给JVM
            要么tyr{}catch(){}
 */
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo05Throws {
    public static void main(String[] args) {
        try {
            readFile("c:\\aebc.txz");
        } catch (IOException e) {
            System.out.println("文件名的后缀不是.txt");
        }
    }

    private static void readFile(String filename) throws IOException {
        if (!filename.endsWith(".txt")){
            throw new IOException("文件的后缀名不对");
        }
    }
}
