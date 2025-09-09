package Arrays;

public class WaterContainer {
    public static int waterContainer(int []arr){
        int left=0;
        int right=arr.length-1;
        int max=0;
        while(left<right){
            int area=Math.min(arr[left],arr[right])*(right-left);
            max=Math.max(max,area);
            if(arr[left]<arr[right])
                left++;
            else
                right--;
        }
        return max;
    }
}
