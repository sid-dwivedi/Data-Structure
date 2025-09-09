package String;
//https://leetcode.com/problems/add-binary/description/?envType=problem-list-v2&envId=string
//Leetcode-67
public class AddBinary {
    public static String addBinary(String a, String b) {
    int n=a.length()-1;
    int m=b.length()-1;
    int c=0;
    int base=2;
    StringBuilder result=new StringBuilder();
    while (n>=0||m>=0){
        int first=0,second=0,sum;
        if (n>=0)
            first=a.charAt(n--)-'0';
        if (m>=0)
            second=a.charAt(m--)-'0';
        sum=first+second+c;
        if (sum>=base){
            c=1;
            sum=sum-base;
        }
        else c=0;
        result.append(sum);
    }
    if (c==1) result.append(c);
    return result.toString();
    }
}
