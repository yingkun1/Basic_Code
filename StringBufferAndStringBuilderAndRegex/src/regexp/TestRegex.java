package regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegex {
    public static void main(String[] args) {
//        System.out.println("请输入一个字符串：");
//        Scanner scanner = new Scanner(System.in);
//        String str = scanner.nextLine();
//        boolean matches = str.matches("[A-Za-z]{6,10}");
//        boolean matches = str.matches(".[^abc]");
//        boolean matches = str.matches("[a-z&&[^bc]]");
//        System.out.println(matches);
//        String str = "a,b+C#d";
//        String[] split = str.split(",|\\+|#");
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }

//        Pattern pattern = Pattern.compile("\\d{6}");
//        String str = "123456asd123456abc123456asdd876543sadasdsad";
//        Matcher matcher = pattern.matcher(str);
//        while (matcher.find()){
//            System.out.println(matcher.group());
//        }
        Pattern pattern = Pattern.compile("\\d{6}");
        String str = "123456asd123456abc123456asdd876543sadasdsad";
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
