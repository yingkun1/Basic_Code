package bufferandbuilder;

public class TestStringBuilder {
    public static void main(String[] args) {
        //使用默认的无参构造函数创建了一个StringBuilder对象，char[16]
//        StringBuilder stringBuilder = new StringBuilder();
        //使用有参的构造函数创建了一个容量为20的StringBuilder对象 char[20]
//        StringBuilder stringBuilder1 = new StringBuilder(20);
        //使用有参的构造函数创建了一个容量为字符串长度+16的StringBuilder对象
//        StringBuilder stringBuilder2 = new StringBuilder("acdsa");
//        StringBuilder builder = new StringBuilder("a");
//        long time1 = System.currentTimeMillis();
//        for (int i = 0; i < 200; i++) {
//            builder.append('a');
//        }
//        long time2 = System.currentTimeMillis();
//        System.out.println(time2-time1);
//        StringBuilder builder = new StringBuilder("ABCDEFG");        //capacity 7+16=23
//        System.out.println(builder.capacity());                      //底层数组的容量
//        System.out.println(builder.length());                        //数组中有效元素的个数

//        String substring = builder.substring(2, 5);
//        System.out.println(substring);
//        StringBuilder builder1 = builder.delete(2, 5);
//        System.out.println(builder1);
//        builder.deleteCharAt(2);
//        System.out.println(builder);
//        builder.append("m");
//        System.out.println(builder);
//        builder.insert(1,'n');
//        System.out.println(builder);
//        builder.replace(2,5,"zzt");
//        System.out.println(builder);
//        builder.reverse();
//        System.out.println(builder);
        StringBuilder builder = new StringBuilder("abcdefg");
//        builder.setCharAt(2,'k');
//        System.out.println(builder);
//        builder.toString();
        System.out.println(builder.length());
        System.out.println(builder.capacity());
        builder.setLength(15);
        builder.trimToSize();
        System.out.println(builder.length());
        System.out.println(builder.capacity());
    }

}
