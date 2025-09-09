package HashMap;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum two=new TwoSum();
        int []arr={2,7,11,15};
        int target=17;
        System.out.println(Arrays.toString(two.twoSum(arr,target)));

        LongestSub1 longest=new LongestSub1();
        String str="abcabcbb";
        System.out.println(longest.lengthOfLongestSubstring(str));

        IntegerToR integerToR=new IntegerToR();
        int num=4325;
        System.out.println(integerToR.integerToRoman(num));

        RomanToI romanToI=new RomanToI();
        String roman="X";
        System.out.println(romanToI.romanToInteger(roman));

        GroupAnagram groupAnagram=new GroupAnagram();
        String [] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagram.groupAnagram(strs));

        HappyNumber happyNumber=new HappyNumber();
        System.out.println(happyNumber.isHappy(19));

        ContainDuplicate containDuplicate=new ContainDuplicate();
        int []dup={1,2,3,4,5,6,7,7,8,9};
        System.out.println(containDuplicate.containDuplicate(dup));

        ValidAnagram validAnagram=new ValidAnagram();
        System.out.println(validAnagram.validAnagram("siddhant","disdhtna"));

        FindTheDifference findTheDifference=new FindTheDifference();
        System.out.println(findTheDifference.findDifference("siddhant","sidd"));
    }
}
