package cn.luffyyk.day12.myutils;

public class HomeworkString {
    public static void main(String[] args) {
//        String string = reverseString("abcdefg");
//        System.out.println(string);
//        String string = concatString("okko");
//        System.out.println(string);
//        plalindrome("1234321");
//        String helloworld = rightRmove("helloworld", 5);
//        System.out.println(helloworld);
//        String s = stringLength("ab", "abce", "abcd");
//        System.out.println("最长的字符串是:" + s);
//        int aaaaaa = stringLength("aaaaaa");
//        String str = firstUpper("this is a java test");
//        System.out.println(str);
//        String str = "wowowo";
//        String str2 = 't'+"";
//         str+=str2.toUpperCase();
//        System.out.println(str);
//        System.out.println("avc"+'c');
//        System.out.println('c'+"".to);
//        System.out.println("acs".concat("c"));
//        String str1 = "abc";
//        str1.concat("dddd");
//        str1+="zsadads";
//        System.out.println(str1);
        String str12 = getNumber("asdasd123sadasd98asd0");
        System.out.println(str12);
    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        String str1 = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }
        return str1;
    }


    public static String concatString(String str) {
        char[] chars = str.toCharArray();
        for (int i = chars.length - 1; i >= 0; i--) {
            str += chars[i];
        }
        return str;
    }

    // 判断回文实际上是很简单的，最为重要的有两点：
    //1.需要知道整个回文串的长度count，推算出最大的下标值count-1
    //2.使用for循环开始遍历，无需遍历整个字符串，只需要遍历一半使用'/'
    //for(int i = 0;i<chars.length/2;i++){
    //      if (chars[i] != chars[count-1]){
    //          break;
    //      }else{
    //          count--;
    //      }
    // }
    //3.最开始的的与最后的相比，一次向中间靠拢
    //4.最好需要一个flag,用于打印输出语句
    public static void plalindrome(String str) {
        char[] chars = str.toCharArray();
        int count = chars.length;
        boolean flag = false;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[count - 1]) {
                flag = true;
                break;
            }
            count--;
        }
        if (flag) {
            System.out.println(str + "不是回文");
        } else {
            System.out.println(str + "是回文");
        }

    }

    public static String rightRmove(String str, int length) {
        char[] chars = str.toCharArray();
        int origin_length1 = chars.length;
        String str1 = "";
        String str2 = "";
        for (int i = origin_length1 - 1; i > origin_length1 - 1 - length; i--) {
            str1 += chars[i];
        }
        str = str1 + str;
        char[] chars1 = str.toCharArray();
        for (int i = 0; i < origin_length1; i++) {
            str2 += chars1[i];
        }
        return str2;
    }

    public static String stringLength(String str1, String str2, String str3) {
        int leng1 = str1.length();
        int leng2 = str2.length();
        int leng3 = str3.length();
        int max = 0;
        if (leng1 > leng2) {
            if (leng1 > leng3) {
                return str1;
            } else {
                return str3;
            }
        } else if (leng2 > leng3) {
            return str2;
        } else {
            return str3;
        }
    }

//    public static int statistics(String str ) {
//        char[] chars = str.toCharArray();
//        int couut = 0;
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == 'a') {
//                count++;
//            }
//        }
//        return couunt;
//    }

    public static String firstUpper(String str){
        String[] split = str.split(" ");
        String str1 = "";
        for (int i = 0; i < split.length; i++) {
            char[] chars = split[i].toCharArray();
            String upperCase = (chars[0] + "").toUpperCase();
            str1 = str1.concat(upperCase);
            for (int i1 = 1; i1 < chars.length; i1++) {
                str1 = str1.concat(String.valueOf(chars[i1]));
            }
            str1+=" ";
        }
        return str1.trim();
    }

    public static String getNumber(String str){
        char[] chars = str.toCharArray();
        String str1 = "";
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>=48 && chars[i]<=57){
                   str1 += chars[i];
            }
        }
        return str1;
    }
}

