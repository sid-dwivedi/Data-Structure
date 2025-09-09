package Arrays;
//https://leetcode.com/problems/find-the-duplicate-number/?envType=problem-list-v2&envId=array
public class FindDuplicate {
    public static int findDuplicate(int []arr){
        int slow=0;
        int fast=0;
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while (slow!=fast);
        slow=0;
        while (slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
}
