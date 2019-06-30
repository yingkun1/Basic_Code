package exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class ExamMachine {
    private HashMap<String, String> studentinfo = new HashMap<>();

    {
        studentinfo.put("郑中拓", "123");
        studentinfo.put("应昆", "456");
        studentinfo.put("张杰", "789");
    }

    private HashSet<Question> questionBank = new HashSet<Question>();

    {
        questionBank.add(new Question("下面哪一个不是java的基本数据类型?\n\tA.String\n\tB.char\n\tC.boolean\n\tD.byte", "A"));
        questionBank.add(new Question("下面哪一个是java的基本数据类型?\n\tA.String\n\tB.Integer\n\tC.boolean\n\tD.Byte", "C"));
        questionBank.add(new Question("下面哪一个是java的引用数据类型?\n\tA.String\n\tB.int\n\tC.boolean\n\tD.byte", "A"));
        questionBank.add(new Question("下面哪一个不是java的引用数据类型?\n\tA.String\n\tB.Integer\n\tC.Boolean\n\tD.byte", "D"));
        questionBank.add(new Question("下面哪一个是java.util包中的类?\n\tA.String\n\tB.Integer\n\tC.Scanner\n\tD.Math", "C"));
        questionBank.add(new Question("下面哪一个不是java.util包中的类?\n\tA.Date\n\tB.Integer\n\tC.Calendar\n\tD.Random", "B"));
        questionBank.add(new Question("下面哪一个不是String类中的方法?\n\tA.compareTo\n\tB.append\n\tC.substring\n\tD.concat", "B"));
        questionBank.add(new Question("下面哪一个是String类中的方法?\n\tA.compareTo\n\tB.append\n\tC.delete\n\tD.insert", "A"));
        questionBank.add(new Question("下面哪一个不是接口中属性的的修饰符?\n\tA.public\n\tB.static\n\tC.final\n\tD.abstract", "D"));
        questionBank.add(new Question("下面哪一个不是Set集合的方法?\n\tA.set\n\tB.add\n\tC.remove\n\tD.iterator", "A"));
    }


    /*
     * 设计一个方法，随机生成试卷
     * 参数int num:用于随机设计试卷上题目的数量，返回值ArrayList<Question>:返回的是一个ArrayList集合，便于学生进行遍历
     * 随机抽取的试题应该是不重复的，所以我们可以先使用一个HashSet集合接收生成的题目，然后将其返回，由于HashSet没有序号，我们只能通过ArrayList去遍历出题目
     * 然后将其存到HashSet中
     * */
    public ArrayList<Question> getPaper(int num) {
        System.out.println("考试机正在随机的生成试卷，请耐心等待!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        为了方便遍历，需要一个ArrayList
        ArrayList<Question> questions = new ArrayList<>(this.questionBank);
//        为了防止抽取的题目存在重复的，需要一个HashSet
        HashSet<Question> paper = new HashSet<>();
        while (paper.size() < num) {
            paper.add(questions.get(new Random().nextInt(this.questionBank.size())));
        }
        ArrayList<Question> questionArrayList = new ArrayList<>(paper);
        return questionArrayList;
    }
//    public ArrayList<Question> getPaper(int num){
//        ArrayList<Question> questions = new ArrayList<>(this.questionBank);
//        HashSet<Question> paper = new HashSet<>();
//        while (paper.size()<=num){
//            paper.add(questions.get(new Random().nextInt(this.questionBank.size())));
//        }
//        return new ArrayList<Question>(paper);
//    }

    public boolean loginForStudent(String username, String password) {
        if (this.studentinfo.get(username) != null) {
            if (this.studentinfo.get(username).equals(password)) {
                System.out.println("登录成功!");
                return true;
            }
        }
        System.out.println("登录失败!用户名或者密码错误");
        return false;
    }
}
