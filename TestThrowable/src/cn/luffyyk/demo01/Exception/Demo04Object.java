package cn.luffyyk.demo01.Exception;

import java.util.Objects;

public class Demo04Object {
    public static void main(String[] args) {
        method(null);
    }

    public static void method(Object obj){
//        if (obj == null){
//            throw new NullPointerException("传递过来的参数是null");
//        }
        Objects.requireNonNull(obj,"传递过来的参数是null");
    }
}
