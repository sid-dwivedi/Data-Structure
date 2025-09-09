package Arrays;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=problem-list-v2&envId=array
//Leetcode-34
public class FirstLastPosition {
    public static int []firstLastPosition(int []arr,int target){
       int left=leftPortion(arr,target);
       int right=rightPortion(arr,target);
       return new int[]{left,right};
    }
    public static int leftPortion(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target){
                index=mid;
                right=mid-1;
            }else if(target<=arr[mid])
                left=mid-1;
            else right=mid-1;
        }
        return index;
    }
    public static int rightPortion(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        int index=-1;
        while (left<=right){
            int mid=left+(right-left)/2;
            if (arr[mid]==target) {
                index=mid;
                left=mid+1;
        } else if (target<=arr[mid]);
        }
        return index;
    }
}
