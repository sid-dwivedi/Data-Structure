package HashMap;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public boolean isHappy(int num){
       Set<Integer>set=new HashSet<>();
       while (true){
           int sum=0;
           while (num!=0){
               sum+=Math.pow(num%10,2.0);
               num/=10;
           }
           if (sum==1) return true;
           num=sum;
           if (set.contains(num)) return false;
           set.add(num);
       }
    }
}
