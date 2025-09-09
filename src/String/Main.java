package String;

public class Main {
    public static void main(String[] args) {
//12
        System.out.println("FIND DIFFERENCES LEETCODE 389-");
        System.out.println(FindTheDifference.findTheDifference("abcd","abcde"));
        System.out.println();
//11
        System.out.println("EXCEL SHEET TO TITLE LEETCODE 167-");
        System.out.println(ExcelSheetColumnTitle.convertToTitle(28));
        System.out.println();
//10
        System.out.println("ADD BINARY LEETCODE 67-");
        System.out.println(AddBinary.addBinary("111","11"));
        System.out.println();
//9
        System.out.println("GROUP OF ANAGRAM LEETCODE 49-");
        String []groupAnagrams={"eat","tea","tan","ate","nat","bat"};
        System.out.println(GroupAnagrams.groupAnagrams(groupAnagrams));
        System.out.println();
//8
        System.out.println("MULTIPLY STRING LEETCODE 43-");
        System.out.println(MultiPlyString.multi("12","12"));
        System.out.println();
//7
        System.out.println("FIND THE FIRST OCCURRENCE IN A STRING LEETCODE 28-");
        System.out.println(FirstOccurrenceInString.strStr("sadbutsad","sad"));
        System.out.println();
//6
        System.out.println(GenerateParentheses.generate(3));
//5
        System.out.println(ValidParenthesis.valid("({[]})"));
//4
        String []longest = {"flower","flow","flight"};
        System.out.println(LongestCommonPrefix.longestString(longest));
//3
        System.out.println(IntegerToRoman.intToRoman(1234));
//2
        System.out.println(LongestSubstringWithoutRepeating.longest("abcabcbb"));
//1
        ZigZagConversion zigZagConversion=new ZigZagConversion();
        System.out.println(zigZagConversion.zigZagConversion("PAYPALISHIRING",3));
    }
}
