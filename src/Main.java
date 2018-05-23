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
            if(i<2) {
                cardtest.setCardNumber(3);
                cardtest.setCardMark("test");
            }
            else {
                cardtest.setCardNumber(i+3);
                cardtest.setCardMark("test");
            }

//            cardtest.setCardNumber(i+1);
//            cardtest.setCardMark("test");

            test.add(cardtest);

            cardtest = new CardData();
        }


        Collections.sort(test, cardAcending);

        Pair pair = new Pair();

        List<PairData> pairtest = new ArrayList<>();

        pair.Pair(test);

//        for (PairData pairData:pairtest) {
//            System.out.println("number : " + pairData.number);
//            System.out.println("conunt : " + pairData.count1);
//        }





    }
}
