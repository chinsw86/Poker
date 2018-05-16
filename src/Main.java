import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CardSetting cardSetting = new CardSetting();
        GetGrade getGrade = new GetGrade();
        Acending cardAcending = new Acending();

        List<CardData> Deck = new ArrayList<>();
        List<CardData> player1 = new ArrayList<>();
        List<CardData> player2 = new ArrayList<>();

        List<CardData> test = new ArrayList<>();
        CardData cardtest = new CardData();

        Boolean markCheck;
        int serialCheck;


        Deck = cardSetting.cardSetting();

        Collections.shuffle(Deck);

//        for(int i=0;i<10;i++){
//            if(i%2==0){
//                player1.add(Deck.get(i));
//            }
//            else
//                player2.add(Deck.get(i));
//        }
//
//
//
//        Collections.sort(player1, cardAcending);
//        Collections.sort(player2, cardAcending);

        for(int i=0;i<5;i++){
//            if(i!=2){
            cardtest.setCardNumber(i);
            cardtest.setCardMark("test");
//            else {
//                cardtest.setCardNumber(1);
//                cardtest.setCardMark("test");
//            }

            test.add(cardtest);

            cardtest = new CardData();
        }

        test.get(2).setCardNumber(10);

        Collections.sort(test, cardAcending);

        int grade;
        grade = getGrade.getGrade(test);

        System.out.println(grade);



    }
}
