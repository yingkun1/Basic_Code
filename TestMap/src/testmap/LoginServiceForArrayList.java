package testmap;

import java.util.ArrayList;

public class LoginServiceForArrayList {

    private ArrayList<String> userBox = new ArrayList<>();
    {
        userBox.add("郑中拓-123");
        userBox.add("渡一教育-666");
        userBox.add("java-888");
    }

    public String loginForArrayList(String name,String password){
        for (int i = 0; i < userBox.size(); i++) {
            String[] split = userBox.get(i).split("-");
            if (split[0].equals(name)){
                if (split[1].equals(password)){
                    return "登录成功!";
                }
                break;
            }
        }
        return "登录失败!";
    }
}
