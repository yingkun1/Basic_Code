package landlords;

import java.util.ArrayList;
import java.util.Collections;

public class Landlords {
    public static void main(String[] args) {
        //1.准备54张牌
        ArrayList<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] color = {"♠","♥","♣","♦"};
        String[] number = {"2","A","k","Q","J","10","9","8","7","6","5","4","3"};
        for (int i = 0; i < color.length; i++) {
            for (int i1 = 0; i1 < number.length; i1++) {
                poker.add(color[i]+number[i1]);
            }
        }

        //2.洗牌
        Collections.shuffle(poker);

        //3.发牌
        ArrayList<String> people1 = new ArrayList<>();
        ArrayList<String> people2 = new ArrayList<>();
        ArrayList<String> people3 = new ArrayList<>();
        ArrayList<String> ace_in_the_hole = new ArrayList<>();
        for (int i = 0; i < 54; i++) {
            String one_poker = poker.get(i);
            if (i>=51){
                 ace_in_the_hole.add(one_poker);
            }else if (i%3==0){
                people1.add(one_poker);
            }else if (i%3==1){
                people2.add(one_poker);
            }else {
                people3.add(one_poker);
            }
        }

        //4.看牌
        System.out.println("一号玩家的牌是:"+people1);
        System.out.println("二号玩家的牌是:"+people2);
        System.out.println("三号玩家的牌是:"+people3);
        System.out.println("剩余的三张底牌是:"+ace_in_the_hole);
    }
}
