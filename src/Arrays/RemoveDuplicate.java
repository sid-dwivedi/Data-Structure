package Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static int removeDuplicate(int []arr){
       if(arr.length==0) return 0;
       int count=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]!=arr[i]){
                arr[count]=arr[i];
                count+=1;
            }
        }
        return count;
    }
}
