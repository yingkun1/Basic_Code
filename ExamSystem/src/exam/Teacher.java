package exam;

import java.util.ArrayList;

public class Teacher {
    private String username;

    public Teacher() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int giveAScore(ArrayList<Question> paper,String[] answers){
        System.out.println("老师正在批改你的试卷，请耐心等待");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int score = 0;
        for (int i = 0; i < paper.size(); i++) {
            Question question = paper.get(i);
            if (question.getAnswer().equalsIgnoreCase(answers[i])){
                score += 100/paper.size();
            }
        }
        return score;
    }
}
