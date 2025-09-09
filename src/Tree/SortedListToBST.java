package Tree;
//https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/description/?envType=problem-list-v2&envId=tree
//Leetcode-109
public class SortedListToBST {
    public static TreeNode sortedListToBST(ListNode head){
        if (head==null) return null;
        return helper(head,null);
    }
    public static TreeNode helper(ListNode head,ListNode tail){
        ListNode fast=head;
        ListNode slow=head;
        if (head==tail) return null;
        while (fast!=tail&&fast.next!=tail){
            fast=fast.next.next;
            slow=slow.next;
        }
        TreeNode root=new TreeNode(slow.val);
        root.left=helper(head,slow);
        root.right=helper(slow.next,tail);
        return root;
    }
}
