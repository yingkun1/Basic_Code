package cn.luffyyk.day12.demo01;

public class Demo01System {

    public static void main(String[] args) {
        demo01();
    }

    /*
    验证for循环打印数字1-9999所需要使用的时间(毫秒)
     */
    private static void demo01() {
        long start = System.currentTimeMillis();
        for (int i = 0; i <10000 ; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序耗时"+(end-start));
    }

}
