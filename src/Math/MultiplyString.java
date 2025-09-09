package Math;
//https://leetcode.com/problems/multiply-strings/description/?envType=problem-list-v2&envId=math
//Leetcode-43
public class MultiplyString {

    public static String multiplay(String str1,String str2){
        if (str1.equals("0")||str2.equals("0")) return "0";
        int []result=new int[str1.length()+str2.length()];
        for (int i = str1.length()-1; i >=0 ; i--) {
            for (int j = str2.length()-1; j >=0 ; j--) {
                int num1=str1.charAt(i)-'0';
                int num2=str2.charAt(j)-'0';
                int mul=num1*num2;
                int low=i+j+1;
                int high=i+j;
                int sum=mul+result[low];
                result[low]=sum%10;
                result[high]=sum/10;
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int num:result){
            if (!(ans.length()==0&&num==0)) {
                ans.append(num);
            }
        }
        return ans.length()==0?"0":ans.toString();
    }
}
