package cn.luffyyk.day06.demo02;

public class Demo05PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    //当使用一个对象类型作为方法的返回值时：返回值其实就是队形的地址值。
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "华为";
        one.price = 5999.9;
        one.color = "皓月银";
        return one;
    }
}
