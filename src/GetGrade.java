import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class GetGrade {

    public int getGrade(List<CardData> player){

        int grade=0;
        int pairCheck;
        StraightFlush straightFlush = new StraightFlush();
        Flush flush = new Flush();
        FourCard fourCard = new FourCard();
        Pair pair = new Pair();



        if(straightFlush.StraightFlush(player))
            return 10;
        else if(fourCard.FourCard(player))
            return 9;
        else if(flush.Flush(player))
            return 7;
        else {
            pairCheck = pair.Pair(player);
            return pairCheck;
        }




    }




}


