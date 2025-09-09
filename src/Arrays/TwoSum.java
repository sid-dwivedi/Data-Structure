package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int []arr,int target){
        Map<Integer,Integer> map=new HashMap();
        for(int i=0;i<arr.length;i++){
            int comp=target-arr[i];
            if(map.containsKey(comp)){
                return new int[]{map.get(comp),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
}
