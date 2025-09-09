package HashMap;

import java.util.HashMap;
import java.util.Map;

public class RomanToI {
    public int romanToInteger(String str){
        Map<Character,Integer>map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total=0;
        int preval=0;

        for (int i = str.length()-1; i >=0 ; i--) {
            int currentVal=map.get(str.charAt(i));
            if(currentVal<preval){
                total-=currentVal;
            }else {
                total+=currentVal;
            }
            preval=currentVal;
        }
        return total;
    }
}
