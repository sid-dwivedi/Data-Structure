package Arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalTringle {
    public static List<List<Integer>> pascalTringle(int row){
        List<List<Integer>>result=new ArrayList<>();
        if(row==0) return result;
        List<Integer>firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if(row==1) return result;
        for(int i=1;i<row;i++){
            List<Integer>prevRow=result.get(i-1);
            ArrayList<Integer>currentRow=new ArrayList<>();
            currentRow.add(1);
            for(int j=0;j<i-1;j++){
                currentRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            currentRow.add(1);
            result.add(currentRow);
        }
        return result;
    }
}
