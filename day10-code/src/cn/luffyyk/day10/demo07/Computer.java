package cn.luffyyk.day10.demo07;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本电脑开机!");
    }

    public void powerOff(){
        System.out.println("笔记本电脑关机!");
    }

    public void useDevice(USB usb){
        usb.open();            //打开设备
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb;
            mouse.click();
        }
        if (usb instanceof KeyBoard){
            KeyBoard keyBoard = (KeyBoard) usb;
            keyBoard.type();
        }
        usb.close();           //关闭设备
    }
}
