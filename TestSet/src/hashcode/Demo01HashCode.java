package hashcode;

/*
* 哈希值：是一个十进制的整数，由系统随机给出(就是对象额地址值，是一个逻辑地址，是模拟出来得到的地址,不是数据实际存储的地址)
* 在Object类中有一个方法，可以获取对象的哈希值
* int hashCode():返回该对象的哈希码值
* hashCode方法的源码：
*   public native int hashCode();
*   native:代表该方法调用的是本地操作系统的方法
* */

public class Demo01HashCode {
    public static void main(String[] args) {
        Person person = new Person();
        int hashCode = person.hashCode();
//        System.out.println(hashCode);
        Person person1 = new Person();
        System.out.println(person1.hashCode());
        System.out.println(person);
        System.out.println(person1);

        String s1 = new String("重地");
        String s2 = new String("通话");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1);
        System.out.println(s2);

    }
}
