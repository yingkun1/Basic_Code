package testmap;

import java.util.HashMap;
import java.util.Set;

public class LoginServiceForHashMap {
    private HashMap<String,String> hashMap = new HashMap<>();
    {
        hashMap.put("郑中拓","123");
        hashMap.put("渡一教育","666");
        hashMap.put("java","888");
    }

    public String loginForHashMap(String name,String password){
        Set<String> keys = hashMap.keySet();
        for (String key : keys) {
            if (key.equals(name)){
                if (hashMap.get(key).equals(password)){
                    return "登录成功!";
                }
                break;
            }
        }
        return "登录失败,用户名或密码输入错误!";
    }

    public String loginForHashMap2(String name,String password){
        String realpassword = hashMap.get(name);
        if (realpassword.equals(password)){
            return "登录成功";
        }
        return "登录失败!";
    }
}
