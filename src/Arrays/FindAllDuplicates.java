package Arrays;
import java.util.ArrayList;
import java.util.List;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/?envType=problem-list-v2&envId=array
//Leetcode-442
public class FindAllDuplicates {
public static List<Integer> findDuplicate(int []arr){
    List<Integer> result=new ArrayList<>();
    for (int i = 0; i < arr.length; i++) {
        int index=Math.abs(arr[i])-1;
        if (arr[index]<0) result.add(index+1);
        arr[index]=arr[index]*-1;
    }
    return result;
}
}
