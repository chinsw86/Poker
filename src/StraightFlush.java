import java.util.List;

public class StraightFlush {

    public boolean StraightFlush(List<CardData> player){
        if(CheckingMark(player) && SerialNumberChecking(player))
            return true;
        else
            return false;

    }

    public boolean CheckingMark(List<CardData> player){

        String checkMark = player.get(0).getCardMark();
        int sameMarkNumber=0;

        for (CardData card:player) {
            if(card.getCardMark()==checkMark)
                sameMarkNumber++;
        }

        if(sameMarkNumber==5)
            return true;
        else
            return false;
    }

    public boolean SerialNumberChecking(List<CardData> player){

        int serialCheck=0;

        for(int i=0;i<player.size()-1;i++){
            if((player.get(i+1).getCardNumber() - player.get(i).getCardNumber())==1)
                serialCheck++;

        }

        if(serialCheck==4)
            return true;
        else
            return false;
    }


}
