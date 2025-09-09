package HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    public String stringFrequency(String str){
            int []arr=new int[26];
            for (char ch:str.toCharArray())
                arr[ch-'a']++;
            StringBuilder freq=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            freq.append('a'+i);
            freq.append(i);
        }
        return freq.toString();
    }

    public List<List<String>> groupAnagram(String []arr){
       if(arr==null&&arr.length==0) return new ArrayList<>();
       Map<String ,List<String>> map=new HashMap<>();
       for(String str:arr){
           String freq=stringFrequency(str);
           if (map.containsKey(freq))
               map.get(freq).add(str);
           else{
               ArrayList list=new ArrayList<>();
               list.add(str);
               map.put(freq,list);
           }
       }
       return new ArrayList<>(map.values());
    }
}










//if(arr==null&&arr.length==0){
//        return new ArrayList<>();
//        }
//Map<String,List<String>> map=new HashMap<>();
//        for(String str:arr){
//String frequency=stringFrequency(str);
//            if(map.containsKey(frequency)){
//        map.get(frequency).add(str);
//            }else {
//ArrayList<String>list=new ArrayList<>();
//                list.add(str);
//                map.put(frequency,list);
//            }
//                    }
//                    return new ArrayList<>(map.values());
//        if(arr==null&&arr.length==0){
//        return new ArrayList<>();
//        }
//Map<String,List<String>> map=new HashMap<>();
//        for(String str:arr){
//String frequency=stringFrequency(str);
//            if(map.containsKey(frequency)){
//        map.get(frequency).add(str);
//            }else {
//ArrayList<String>list=new ArrayList<>();
//                list.add(str);
//                map.put(frequency,list);
//            }
//                    }
//                    return new ArrayList<>(map.values());