import java.util.List;

public class FourCard {

    public boolean FourCard(List<CardData> player){

        int check=0;
        int checkNumber = player.get(0).getCardNumber();

        if(checkNumber!=player.get(2).getCardNumber()){
            checkNumber = player.get(1).getCardNumber();
        }

        for(int i=0;i<player.size();i++){
            if(checkNumber==player.get(i).getCardNumber())
                check++;
        }

        if(check >= 4)
            return true;
        else
            return false;


    }
}
