package String;
//https://leetcode.com/problems/multiply-strings/description/?envType=problem-list-v2&envId=string
//Leetcode-43
public class MultiPlyString {
    public static  String multi(String str1,String str2){
        if (str1.equals("0")||str2.equals("0")) return "0";
        int []result=new int[str1.length()+str2.length()];
        for (int i =str2.length()-1; i>=0; i--) {
            for (int j = str1.length()-1; j >=0 ; j--) {
                int first=str2.charAt(i)-'0';
                int second=str1.charAt(j)-'0';
                int mul=first*second;
                int low=i+j+1;
                int high=i+j;
                int sum=mul+result[low];
                result[low]=sum%10;
                result[high]=sum/10;
            }
        }
        StringBuilder str=new StringBuilder();
        for (int val:result){
            if (!(str.length()==0&&val==0))
                str.append(val);
        }
        return str.length()==0?"0":str.toString();
    }
}
