package cn.luffyyk.day10.demo07;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标!");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标!");
    }

    public void click(){
        System.out.println("鼠标点击!");
    }
}
