package Arrays;
//https://leetcode.com/problems/search-insert-position/?envType=problem-list-v2&envId=array
//Leetcode-35
public class SearchInsertPosition {
    public static int searchInsertPosition(int []arr,int target){
       int left=0;
       int right=arr.length-1;
       while (left<=right) {
           int mid = left + (right - left) / 2;
           if (arr[mid] == target) return mid;
           else if (target < arr[mid]) right = mid - 1;
           else left = mid + 1;
       }
       return left;
    }
}
