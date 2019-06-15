package cn.luffyyk.day07.demo04;

import java.util.ArrayList;

/*
如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。
基本类型    包装类型（引用类型，包装类都位于java.lang包下，不需要导入）
byte    Byte
short   Short
int     Integer     【特殊】
long    Long
float   Float
double  Double
char    Character   【特殊】
boolean Boolean

从JDK1.5开始，支持自动装箱、自动拆箱
自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型
 */

public class Demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        //下面是错误的写法！泛型只能是引用类型，不能是基本类型
        //ArrayList<int> listB = new ArrayList<int>();
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        for (int i = 0; i < listC.size(); i++) {
            System.out.println(listC.get(i));
        }
    }
}
