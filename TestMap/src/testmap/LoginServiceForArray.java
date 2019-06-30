package testmap;

import java.util.ArrayList;

public class LoginServiceForArray {
    private String[] usersBox = {"郑中拓","渡一教育","java"};
    private int[] passwordBox = {111,222,333};

    public String loginForArray(String name,String password){
        for (int i = 0; i < usersBox.length; i++) {
            if (usersBox[i].equals(name)){
                if (passwordBox[i] == Integer.parseInt(password)){
                    return "登录成功!";
                }
            }
        }
        return "登录失败!用户名或者密码错误!";
    }

}
