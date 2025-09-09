package String;
//https://leetcode.com/problems/integer-to-roman/description/?envType=problem-list-v2&envId=string
//Leetcode-12
public class IntegerToRoman {
    public static String intToRoman(int num){
        int []val={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String []roman={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < val.length&&num>0; i++) {
            while (num>=val[i]){
                str.append(roman[i]);
                num-=val[i];
            }
        }
        return str.toString();
    }
}
