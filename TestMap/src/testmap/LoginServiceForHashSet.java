package testmap;

import java.util.HashSet;
import java.util.Iterator;

public class LoginServiceForHashSet {
    private HashSet<String> hashSet = new HashSet<>();
    {
        hashSet.add("郑中拓-123");
        hashSet.add("渡一教育-666");
        hashSet.add("java-888");
    }

    public String loginForHashSet(String name,String password){
        for (String s : hashSet) {
            String[] split = s.split("-");
            if (split[0].equals(name)){
                if (split[1].equals(password)){
                    return "登录成功!";
                }
                break;
            }
        }
        return "账号或者密码错误,登录失败!";
    }

    public String loginForHashSet2(String name,String password){
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()){
            String[] split = iterator.next().split("-");
            if (split[0].equals(name)){
                if (split[1].equals(password)){
                    return "登录成功!";
                }
                break;
            }
        }
        return "账号或者密码错误,登录失败!";
    }

}
