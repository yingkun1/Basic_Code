package testmap;

import java.util.*;

/*
* 题目要求：计算一个字符串中每个字符出现的次数
*
* 分析：
*   1.使用Scanner获取用户输入的字符串
*   2.创建Map集合，key是字符串中的字符，value是字符的个数
*   3.遍历字符串，获取每一个字符
*   4.使用获取到的字符，去Map集合判断key是否存在
*       key存在：
*           通过字符key,获取value(字符个数)
*           value++
*       key不存在：
*           put(key,1)
*   5.遍历Map集合,输出结果
* */
public class MapTest {
    public static void main(String[] args) {
        System.out.println("请输入一串随机的字符串：");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        HashMap<String, Integer> characterNumber = getCharacterNumber(str);
//        Set<String> keySet = characterNumber.keySet();
//        for (String s : keySet) {
//            System.out.println("字母 "+s+" 出现的次数:"+characterNumber.get(s));
//        }
        Set<Map.Entry<String, Integer>> entrySet = characterNumber.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getKey()+":"+iterator.next().getValue());
        }
    }

    public static HashMap<String,Integer> getCharacterNumber(String str){
        HashMap<String, Integer> hashMap = new HashMap<>();
        int count = 1;
        for (int i = 0;i<str.length();i++){
            String charkey = str.charAt(i) + "";
            if (!hashMap.containsKey(charkey)){
                hashMap.put(charkey,count);
            }else{
                hashMap.replace(charkey,count++);
            }
        }
        return hashMap;
    }

    public static String getcharacterNumber1(String str){
        HashMap<String, Integer> hashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        String string = "";
        int count = 1;
        for (int i = 0; i < chars.length; i++) {
            String charkey = chars[i] + "";
            if (hashMap.containsKey(charkey)){
                hashMap.replace(charkey,count++);
            }else{
                hashMap.put(charkey,count);
            }
        }
        Set<Map.Entry<String, Integer>> entries = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            String key = iterator.next().getKey();
            Integer value = iterator.next().getValue();
             string += "字母："+key+"出现的次数是:"+value+"\n";
        }
        return string;
    }
}
