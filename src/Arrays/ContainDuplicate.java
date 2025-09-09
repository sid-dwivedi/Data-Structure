package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {
    public static boolean containsDuplicate(int []arr){
        Set<Integer> set=new HashSet<>();
        for (int val:arr){
            if (set.contains(val)) return true;
            set.add(val);
        }
        return false;
    }
}
