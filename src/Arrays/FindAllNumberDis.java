package Arrays;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/?envType=problem-list-v2&envId=array
//Leetcode-448
import java.util.ArrayList;
import java.util.List;

public class FindAllNumberDis {
    public static List<Integer> findAllDis(int []arr){
        List<Integer>result=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            int index=Math.abs(arr[i])-1;
            if (arr[index]<0) continue;
            arr[index]=arr[index]*-1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0) result.add(i+1);
        }
        return result;
    }
}
