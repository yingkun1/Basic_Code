package landlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class LandlordsEnhance {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();
        HashMap<Integer, String> pokerWrap = new HashMap<>();
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        String[] colors = {"♠","♥","♣","♦"};
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color+number);
            }
        }
        for (int i = 0; i < poker.size(); i++) {
            pokerIndex.add(i);
            pokerWrap.put(pokerIndex.get(i),poker.get(i));
        }

        //洗牌
        Collections.shuffle(pokerIndex);
        
        //发牌
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> aceInTheHole = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            Integer pokerPerIndex = pokerIndex.get(i);
            if (i>=51){
                aceInTheHole.add(pokerPerIndex);
            }else if (i%3==0){
                player1.add(pokerPerIndex);
            }else if (i%3==1){
                player2.add(pokerPerIndex);
            }else if (i%3==2){
                player3.add(pokerPerIndex);
            }
        }

        //排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(aceInTheHole);

        ArrayList<String> pokerPlayer1 = showPoker(player1, pokerWrap);
        ArrayList<String> pokerPlayer2 = showPoker(player2, pokerWrap);
        ArrayList<String> pokerPlayer3 = showPoker(player3, pokerWrap);
        ArrayList<String> pokerAce = showPoker(aceInTheHole, pokerWrap);
        System.out.println("玩家1的牌是:"+pokerPlayer1);
        System.out.println("玩家2的牌是:"+pokerPlayer2);
        System.out.println("玩家3的牌是:"+pokerPlayer3);
        System.out.println("底牌是:"+pokerAce);

    }

    private static ArrayList<String> showPoker(ArrayList<Integer> list, HashMap<Integer,String> pokerWrap) {
        ArrayList<String> poker = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer pokerIndex = list.get(i);
            poker.add(pokerWrap.get(pokerIndex));
        }
        return poker;
    }
}
