package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        ExamMachine examMachine = new ExamMachine();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = scanner.nextLine();
        System.out.println("请输入密码");
        String password = scanner.nextLine();
        Student student = new Student(username,password);
        if (examMachine.loginForStudent(student.getusername(),student.getPassword())){
            ArrayList<Question> paper = examMachine.getPaper(2);
            System.out.println(student.getusername()+": 你好，欢迎参加考试!考试正式开始!");
            String[] exam = student.exam(paper);
            Teacher teacher = new Teacher();
            int score = teacher.giveAScore(paper, exam);
            System.out.println("你的分数是:"+score);
        }
    }
}
