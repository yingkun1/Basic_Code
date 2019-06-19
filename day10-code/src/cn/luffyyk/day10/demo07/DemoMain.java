package cn.luffyyk.day10.demo07;

public class DemoMain {

    public static void main(String[] args) {
        //创建一台电脑对象
        Computer computer = new Computer();

        //打开电脑
        computer.powerOn();

        //准备一个鼠标,供电脑使用
        USB usbMouse = new Mouse();

        computer.useDevice(usbMouse);

        //准备一个键盘,供电脑使用
//        USB keyBoard = new KeyBoard();
        KeyBoard keyBoard = new KeyBoard();
        computer.useDevice(keyBoard);

        //关闭电脑
        computer.powerOff();

        method(10.0);    //正确写法，double --> double
        method(20);      //正确写法，int --> double
        int a = 30;
        method(a);

    }

    public static void method(double num){
        System.out.println(num);
    }
}
