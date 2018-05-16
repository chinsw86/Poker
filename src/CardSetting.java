import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CardSetting {


    public List<CardData> cardSetting(){

        List<CardData> settedCard = new ArrayList<>();
        List<String> Mark = new ArrayList<>();


        CardData tempCard = new CardData();

        Collections.addAll(Mark, "SPADE", "CLOVER", "HEART", "DIAMOND");

        for(int i=0;i<4;i++){

            for(int j=0;j<13;j++){

                tempCard.setCardMark(Mark.get(i));
                tempCard.setCardNumber(j+1);

                settedCard.add(tempCard);
                tempCard = new CardData();
                }

        }

//        Collections.sort(settedCard, acendingCard);

        return settedCard;


    }
}

class Acending implements Comparator<CardData>{

    @Override
    public int compare(CardData o1, CardData o2) {
        return o1.getCardNumber().compareTo(o2.getCardNumber());

    }
}



