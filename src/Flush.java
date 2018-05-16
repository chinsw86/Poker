import java.util.List;

public class Flush {

    public boolean Flush(List<CardData> player){

        String checkMark = player.get(0).getCardMark();
        int check=0;

        for (CardData card:player) {
            if(checkMark==card.getCardMark())
                check++;
        }

        if(check==5)
            return true;
        else
            return false;
    }
}
