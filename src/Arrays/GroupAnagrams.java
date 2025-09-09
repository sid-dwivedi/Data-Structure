package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://leetcode.com/problems/group-anagrams/description/?envType=problem-list-v2&envId=array
//Leetcode-49
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String []strs) {
        if (strs == null && strs.length == 0) return new ArrayList<>();
        Map<String,List<String>>map=new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String freq=freqChar(strs[i]);
            if (map.containsKey(freq)){
                    map.get(freq).add(strs[i]);
            }else {
                List<String>list=new ArrayList<>();
                list.add(strs[i]);
                map.put(freq,list);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static String freqChar(String str){
        int []arr=new int[26];
        for(char ch:str.toCharArray())
            arr[ch-'a']++;
        StringBuilder freqStr=new StringBuilder();
        char ch='a';
        for (int num:arr){
            freqStr.append(ch);
            freqStr.append(num);
            ch++;
        }
        return freqStr.toString();
    }
}
