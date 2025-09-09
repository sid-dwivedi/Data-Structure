package Math;
//https://leetcode.com/problems/excel-sheet-column-title/description/?envType=problem-list-v2&envId=math
//Leetcode-168
public class ExcelSheetColumn {
    public static String sheet(int col){
        StringBuilder result=new StringBuilder();
        while (col>0){
            int row=(col-1)%26;
            result.append((char)(row+'A'));
            col=(col-1)/26;
        }
        return result.reverse().toString();
    }
}
