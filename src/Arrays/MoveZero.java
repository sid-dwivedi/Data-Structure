package Arrays;
//https://leetcode.com/problems/move-zeroes/?envType=problem-list-v2&envId=array
public class MoveZero {
    public static int []moveZero(int []arr){
        int ptr=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0){
            arr[ptr++]=arr[i];
        }
        }
        while (ptr< arr.length){
            arr[ptr++]=0;
        }
        return arr;
    }
}
