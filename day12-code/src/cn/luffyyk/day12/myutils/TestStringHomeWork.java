package cn.luffyyk.day12.myutils;

public class TestStringHomeWork {
    public String reverse(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char charstemp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = charstemp;
        }
        return new String(chars);
    }

    public String concatReverse(String str) {
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length/2; i++) {
//            char temp = chars[i];
//            chars[i] = chars[chars.length-1-i];
//            chars[chars.length-1-i] = temp;
//        }
        return str.concat(this.reverse(str));
//        return str.concat(new String(chars));
    }

    public void plalindrome(String str) {
//        char[] chars = str.toCharArray();
//        boolean flag = false;
//        for (int i = 0; i < chars.length/2; i++) {
//            if (chars[i] != chars[chars.length-1-i]){
//                flag = true;
//                break;
//            }
//        }
//        if (flag){
//            System.out.println(str+"不是回文!");
//        }else{
//            System.out.println(str+"是回文!");
//        }

        String reverse = this.reverse(str);
//        if (reverse.equals(str)){
//            System.out.println("是回文!");
//        }else{
//            System.out.println("不是回文!");
//        }
        if (this.reverse(str).equals(str)) {
            System.out.println("是回文!");
        } else {
            System.out.println("不是回文!");
        }

    }

    public String rightMove(String str, int count) {
//        String prefix = str.substring(0, str.length() - count);
//        System.out.println(prefix);
//        String suffix = str.substring(str.length()-count);
//        System.out.println(suffix);
//        String movestr = suffix.concat(prefix);
//        return movestr;
        if (count > str.length()) {
            count = count % str.length();
        }
        return str.substring(str.length() - count).concat(str.substring(0, str.length() - count));
    }

    public String maxlength(String... strs) {
        String maxlengthstr = strs[0];
        int max = maxlengthstr.length();
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() > max) {
                max = strs[i].length();
                maxlengthstr = strs[i];
            }
        }
        return maxlengthstr;
    }

    public int letterExsiCount(String str, char c) {
//        int count = 0;
//        char[] chars = str.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (chars[i] == c){
//                count++;
//            }
//        }
//        for (int i = 0; i < str.length(); i++){
//            if (str.charAt(i) == c){
//                count++;
//            }
//        }
//        return count;
//        String str1 = str.replace(c+"","");
//        int i = str.length() - str1.length();
//        return i;
        return str.length() - str.replace(c + "", "").length();


    }

    public String firstUpper(String str) {
        String[] split = str.split(" ");
        String str1 = "";
        for (int i = 0; i < split.length; i++) {
            str1 = str1 + split[i].substring(0, 1).toUpperCase() + split[i].substring(1) + " ";
        }
        return str1.trim();
    }

    public int findNumber(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++){
            if (str.codePointAt(i)>=48 && str.codePointAt(i)<=57){
                str1+=str.charAt(i);
            }
        }
        return Integer.valueOf(str1);
    }
}
