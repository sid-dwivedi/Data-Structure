package Math;
//https://leetcode.com/problems/roman-to-integer/description/?envType=problem-list-v2&envId=math
//Leetcode-13
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInteger(String s){
        Map<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('x',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total=0;
        int preval=0;
        for (int i = s.length()-1; i >=0 ; i--) {
            int currentValue=map.get(s.charAt(i));
            if (currentValue<preval) total-=currentValue;
            else total+=currentValue;
            preval=currentValue;
        }
        return total;
    }
}
