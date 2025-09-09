package Arrays;

public class BuyAnsSellStock1 {
    public static int buyAndSell(int [] arr){
        int buy=arr[0];
        int profit=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<buy)
                buy=arr[i];
            else {
                int current=arr[i]-buy;
                profit=Math.max(profit,current);
            }
        }
        return profit;
    }
}
