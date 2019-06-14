package cn.luffyyk.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8888.0;
        one.color = "土豪金";

        method(one);          //传递进去的参数就是地址值假设0x333
        //当一个对象（或者数组）作为参数，传递到方法当中时，实际上传递进去的是对象的地址值。
        //在java中，任何的数据类型都可以作为方法的参数，往里面进行传递
    }

    public static void method(Phone param){
        //上面的param接收的也是一个地址值，表面上是一个对象
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
