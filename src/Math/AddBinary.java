package Math;
//https://leetcode.com/problems/add-binary/?envType=problem-list-v2&envId=math
//Leetcode-67
public class AddBinary {
    public static String addBinary(String str1,String str2){
        int n=str1.length()-1;
        int m=str2.length()-1;
        int base=2;
        int c=0;
        StringBuilder result=new StringBuilder();
        while (n>=0||m>=0){
            int t1=0;
            int t2=0;
            int sum;
            if (n>=0) t1=str1.charAt(n--)-'0';
            if (m>=0) t2=str2.charAt(m--)-'0';
            sum=t1+t2+c;
            if (sum>=2){
                c=1;
                sum-=base;
            }
            else c=0;
            result.append(sum);
        }

        if (c==1) result.append(1);
        return result.reverse().toString();
    }
}
