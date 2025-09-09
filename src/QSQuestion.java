import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class QSQuestion {
    private Stack<Integer>first;
    private Stack<Integer> second;

    public QSQuestion(){
        first=new Stack<>();
        second=new Stack<>();
    }
    public void add(int item){
        first.push(item);
    }

    public int removed(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }
        int temp=second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return temp;
    }

    static int twoStack(int x ,int a[],int []b){
        return twoStack(x,a,b,0,0)-1;
    }
    private static int twoStack(int x,int [] a,int [] b, int sum,int count){
        if (sum>x){
            return count;
        }
        if (a.length==0||b.length==0){
            return count;
        }
        int ans1=twoStack(x, Arrays.copyOfRange(a,1,a.length),b,sum+a[0],count++);
        int ans2=twoStack(x,a,Arrays.copyOfRange(b,1,b.length),sum+b[0],count++);
        return Math.max(ans1,ans2);
    }




}
