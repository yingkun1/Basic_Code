package cn.luffyyk.day06.demo03;

public class Demo04Student {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("张旭");
        student.setAge(18);
        student.setMale(true);
        System.out.println("姓名：" + student.getName() + "年龄：" + student.getAge() + "是不是爷们：" + student.isMale());
    }
}
