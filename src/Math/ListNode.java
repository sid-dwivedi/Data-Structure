package Math;

public class ListNode {
     ListNode next;
     int val;
    ListNode (){};
     public ListNode(int value){
        this.val=value;
    }
     public ListNode(int value,ListNode next){
        this.val=value;
        this.next=next;
    }
}
