package Arrays;
//https://leetcode.com/problems/remove-element/?envType=problem-list-v2&envId=array
public class RemoveElement {
    public static int removeElement(int []arr,int val){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if (arr[i]!=val) arr[count++]=arr[i];
        }
        return count;
    }
}
