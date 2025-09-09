package String;
//https://leetcode.com/problems/excel-sheet-column-title/description/?envType=problem-list-v2&envId=string
//Leetoce-167
public class ExcelSheetColumnTitle {
    public static String convertToTitle(int val){
        StringBuilder stringBuilder=new StringBuilder();
        while (val>0){
            int row=(val-1)%26;
            stringBuilder.append((char)(row+'A'));
            val=(val-1)/26;
        }
        return stringBuilder.reverse().toString();
    }
}
