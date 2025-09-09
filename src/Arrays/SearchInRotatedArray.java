package Arrays;

public class SearchInRotatedArray {
    public static int search(int []nums,int target){
        return helper(nums,target,0,nums.length-1);
    }
    public static int helper(int []arr,int target,int start,int end){
        if(start>end) return -1;
        int mid=start+(end-start)/2;

        if (target==arr[mid]) return mid;
        if (arr[start]<=arr[mid]){
                if(arr[start]<=target&&target<=arr[mid])
                    return helper(arr,target,start,mid-1);
                else
                    return helper(arr,target,mid+1,end);
        }else{
                if (arr[mid]<=target&&target<=arr[end])
                    return helper(arr,target,mid+1,end);
                else
                    return helper(arr,target,start,mid-1);
        }
    }
}
