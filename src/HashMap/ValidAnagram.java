package HashMap;

public class ValidAnagram {
    public boolean validAnagram(String s,String t){
        int []arr=new int[26];
        for (char ch:s.toCharArray())
            arr[ch-97]++;
        for (char ch:t.toCharArray())
            arr[ch-97]--;
        for (int val:arr)
            if (val!=0) return false;
        return true;
    }
}
