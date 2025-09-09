package String;

public class ZigZagConversion {

    public String zigZagConversion(String str,int row){
        if(row==1)
            return str;
        String result="";
        int jump=(row-1)*2;
        for(int i=0;i<row;i++){
            for (int j = i; j <str.length(); j+=jump) {
                result+=str.charAt(j);
                if(i>0&&i<row-1&&(j+jump-2*i)<str.length()){
                    result+=str.charAt(j+jump-2*i);
                }
            }
        }
        return result;
    }
}
