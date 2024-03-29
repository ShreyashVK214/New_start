import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class piggybank {


    public double calculateMoneyAvailable(){
        double   totalAmount=0.0     ;
        // standard syntax is like --------Map.Entry<Integer,Integer> e:Map.entrySet()
        for (Map.Entry<Integer,Integer>entry  :moneyMap.entrySet()){
            int denomination=entry.getKey();
            int count =entry.getValue();
            totalAmount=totalAmount+(denomination*count);

        }
        if(totalAmount==0){
            return -1;
        }
        return totalAmount;
    }


    public List<Integer> retriveCurrencyDenomination(){
        List <Integer>denomination=new ArrayList<>(moneyMap.keySet());
        Collections.sort(denomination);
        return denomination;
    }


    public double calculateMoneyBasedOnDenomination(int denomination){
        if(moneyMap.containsKey(denomination)){
            int count =moneyMap.get(denomination);
            return denomination*count;

        }
        else {
            return -1;
        }
    }
}