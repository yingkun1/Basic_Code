package exam;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class Question {
    private String question;    //题目题干
    private String answer;      //真实答案

    public Question() {
    }

    public Question(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Question){
            Question anotherObj = (Question) obj;
            if (this.question.equals(anotherObj.question)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.question.hashCode();
    }
}
