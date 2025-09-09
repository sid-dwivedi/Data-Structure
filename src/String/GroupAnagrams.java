package String;

import com.sun.jdi.event.StepEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/group-anagrams/description/?envType=problem-list-v2&envId=string
//LEETCODE-49
public class GroupAnagrams {
    public static List<List<String>>groupAnagrams(String []arr){
        if (arr==null&&arr.length==0) return new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        for (String current:arr){
            String freq=frequency(current);
            if (map.containsKey(freq)){
                map.get(freq).add(current);
            }else {
                List<String>list=new ArrayList<>();
                list.add(current);
                map.put(freq,list);
            }
        }
        return new ArrayList<>(map.values());
    }
    public static String frequency(String str){
        int [] freq=new int[26];
        for(char ch:str.toCharArray())
            freq[ch-'a']++;
        StringBuilder result=new StringBuilder();
        char alpha='a';
        for (int val:freq){
            result.append(alpha);
            result.append(val);
            alpha++;
        }
            return result.toString();
    }
}
