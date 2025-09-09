package HashMap;

import java.util.HashSet;
import java.util.Set;

public class ContainDuplicate {

    public int containDuplicate(int []num){
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<num.length;i++){
            if (set.contains(num[i]))
                return num[i];
            set.add(num[i]);
        }
        return -1;
    }
}

