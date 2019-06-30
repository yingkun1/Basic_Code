package exam;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private String username;
    private String password;

    public Student() {
    }

    public Student(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public String getusername() {
        return username;
    }

    public void setusername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] exam(ArrayList<Question> paper){
        String[] answers = new String[paper.size()];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < paper.size(); i++) {
            Question question = paper.get(i);
            System.out.println((i+1)+"."+question.getQuestion());
            System.out.println("请输入正确的答案：");
            answers[i] = input.nextLine();
        }
        return answers;
    }


}
