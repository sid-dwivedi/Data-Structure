package Math;

public class LinkedListDisplay {
    public static void display(ListNode head){
        ListNode temp=head;
        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("NULL");
    }
}
