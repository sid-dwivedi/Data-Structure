package Math;
//https://leetcode.com/problems/excel-sheet-column-number/description/?envType=problem-list-v2&envId=math
//Leetcode-171
public class ExcelSheetColumn2 {
    public static int sheet(String alp){
        int sum=0;
        int p=0;
        for (int i = alp.length()-1; i >=0 ; i--) {
            int temp=alp.charAt(i)-64;
            sum+=(int)Math.pow(26,p++)*temp;
        }
        return sum;
    }
}
