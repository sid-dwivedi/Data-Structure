package Arrays;
//https://leetcode.com/problems/squares-of-a-sorted-array/description/?envType=problem-list-v2&envId=array
//Leetcode-977
public class SquaresOfSortedArray {
    public static int []sortedArray(int []arr){
        int []result=new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            arr[i]=arr[i]*arr[i];
        int head=0;
        int tail=arr.length-1;
        for (int i = arr.length-1; i >=0; i--) {
            if (arr[head]>arr[tail]) result[i]=arr[head++];
            else result[i]=arr[tail--];
        }
        return result;
    }
}
