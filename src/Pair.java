import java.util.ArrayList;
import java.util.List;

public class Pair {

    public int Pair(List<CardData> player){

        List<PairData> pairCheck = new ArrayList<>();
        PairData pairData = new PairData();
        PairData savePair = new PairData();
        pairData.number = player.get(0).getCardNumber();

        for(int i=0;i<player.size();i++){
            if(pairData.number == player.get(i).getCardNumber())
                pairData.count1++;
            else{
                pairCheck.add(pairData);
                pairData = new PairData();
                pairData.number = player.get(i).getCardNumber();
                pairData.count1++;
            }
        }

        if(pairData.count1 > 1)
            pairCheck.add(pairData);

        for (PairData pairdata:pairCheck) {
            if(pairdata.count1 == 2)
            {
                savePair.pairnumber1 = pairData.number;
                savePair.count1 += 2;
            }
            else if(pairdata.count1 == 2 && pairdata.pairnumber1!=0)
            {
                savePair.pairnumber2 = pairData.number;
                savePair.count1 += 2;
            }
            else if(pairdata.count1==3)
            {
                savePair.pairnumber1 = pairData.number;
                savePair.count1 += 3;

            }

            else if(pairdata.count1==3 && pairdata.pairnumber1!=0){
                savePair.count1 += 5;
            }


        }

        return savePair.count1;
    }
}
