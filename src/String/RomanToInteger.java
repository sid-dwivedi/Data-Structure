package String;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/description/?envType=problem-list-v2&envId=string
//Leetcode-13
public class RomanToInteger {
        public static int romanToInteger(String str){
            Map<Character,Integer>map=new HashMap<>();
            map.put('I',1);
            map.put('V',5);
            map.put('X',10);
            map.put('L',50);
            map.put('C',100);
            map.put('D',500);
            map.put('M',1000);

            int total=0;
            int prev=0;
            for (int i = str.length()-1; i>=0 ; i--) {
                int currentValue=map.get(str.charAt(i));
                if (currentValue<prev) total-=currentValue;
                else total+=currentValue;
                prev=currentValue;
            }
            return total;
        }
}
