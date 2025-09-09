package Math;
//https://leetcode.com/problems/add-two-numbers/description/?envType=problem-list-v2&envId=math
//Leetcode_2
public class AddTwoNumber {

    public static ListNode addTwoNode(ListNode l1,ListNode l2){
        ListNode result=new ListNode(-1);
        ListNode ptr=result;
        int carry=0;
        while (l1!=null||l2!=null){
            int sum=0+carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if (l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
            sum=sum%10;
            ptr.next=new ListNode(sum);
            ptr=ptr.next;
        }
        if (carry==1) ptr=new ListNode(carry);
        return result.next;
    }
}
