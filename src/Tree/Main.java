package Tree;

public class Main {


//    PreOrder preOrder=new PreOrder();
public static void main(String[] args) {


    TreeNode node1=new TreeNode(40);
    TreeNode node2=new TreeNode(30);
    TreeNode node3=new TreeNode(50);
    TreeNode node4=new TreeNode(25);
    TreeNode node5=new TreeNode(35);
    TreeNode node6=new TreeNode(45);
    TreeNode node7=new TreeNode(60);


    node1.left=node2;
    node1.right=node3;
    node2.left=node4;
    node2.right=node5;
    node3.left=node6;
    node3.right=node7;
////26
//    System.out.println("INVERT BINARY TREE LEETCODE 226-");
//    TreeNode node32=InvertBinaryTree.invert(node1);
//    Display.display(node32);
//    System.out.println();
////25
//    System.out.println("COUNT COMPLETE TREE NODE LEETCODE 222- ");
//    System.out.println(CountCompleteTree.countNode(node1));
//    System.out.println();
////24
//    System.out.println("BINARY TREE RIGHT SIDE VIEW LEETCODE 199-");
//    System.out.println(BTRightSideView.rightSide(node1));
//    System.out.println();
////23
//    System.out.println("BINARY TREE POSTORDER TRAVERSAL LEETCODE 145-");
//    System.out.println(PostOrder.postOrder(node1));
//    System.out.println();
////22
//    System.out.println("BINARY TREE PREORDER TRAVERSAL LEETCODE 144-");
//    System.out.println(PreOrder.preOrderTraversal(node1));
//    System.out.println();
////21
//    System.out.println("SUM ROOT TO LEAF NUMBER LEETCODE 129-");
//    System.out.println(SumRootToLeaf.sumNumber(node1));
//    System.out.println();
////20
//    System.out.println("BINARY TREE MAXIMUM PATH SUM LEETCODE 124-");
//    System.out.println(BTMaximumPathSum.helper(node1));
//    System.out.println();
////19
//    System.out.println("POPULATING NEXT RIGHT POINTER EACH NODE 2 LEETCODE 117-");
//    TreeNode node30=PopulatingNextRight2.connect(node1);
//    TreeNode node31=node30.left.next;
//    System.out.println(" VALUE - "+node31.value);
//    System.out.println();
////18
//    System.out.println("POPULATING NEXT RIGHT POINTER EACH NODE LEETCODE 116-");
//    TreeNode node28=PopulatingNextRight.connect(node1);
//    TreeNode node29=node28.left.next;
//    System.out.println(" VALUE "+node29.value);
//    System.out.println();
////17
//    System.out.println("FLATTEN BINARY TREE LEETCODE 114-");
//    TreeNode node27=FlattenTree.flattenTree(node1);
//    Display.display(node27);
//    PostOrder.postOrder(node27);
//    System.out.println();
//
////16
//    System.out.println("PATH SUM 2 LEETCODE 113-");
//    System.out.println(PathSumII.pathSum(node1,95));
//    System.out.println();
////15
//    System.out.println("PATH SUM LEETCODE 112-");
//    System.out.println(PathSum.pathSum(node1,23));
//    System.out.println();
////14
//    System.out.println("MINIMUM DEPTH BINARY TREE LEETCODE 111-");
//    System.out.println(MinDepthBT.minDepthBT(node1));
//    System.out.println();
////13
//    System.out.println("BALANCED BINARY TREE LEETCODE 110-");
//    System.out.println(BalancedBinaryTree.balanced(node1));
//    System.out.println();
////12
//    System.out.println("SORTED LIST TO BST LEETCODE 109-");
//    ListNode l1=new ListNode(-10);
//    ListNode l2=new ListNode(-3);
//    ListNode l3=new ListNode(0);
//    ListNode l4=new ListNode(5);
//    ListNode l5=new ListNode(9);
//    l1.next=l2;
//    l2.next=l3;
//    l3.next=l4;
//    l4.next=l5;
//    l5.next=null;
//    TreeNode node26=SortedListToBST.sortedListToBST(l1);
//    Display.display(node26);
//    System.out.println();
//11
    System.out.println("SORTED ARRAY TO BST LEETCODE 108-");
    int []sortedArrToBST={-10,-3,0,5,9};
    TreeNode node25=SortedArrayToBST.SortedArrayToBT(sortedArrToBST);
    Display.display(node25);
    System.out.println();
//10
    System.out.println("LEVEL ORDER TRAVERSAL DOWN LEETCODE 107-");
    System.out.println(LevelOrder2.reverseBtmOrder(node1));
    System.out.println();

//9
    System.out.println("CONSTRUCT BT FROM PREORDER AND INORDER LEETCODE 105- ");
    int []preorder1 = {3,9,20,15,7};
    int []inorder1 = {9,3,15,20,7};
    TreeNode node24=PreorderAndInorderBT.buildTree(preorder1,inorder1);
    Display.display(node24);
    System.out.println();
//8
    System.out.println("MAXIMUM DEPTH OF BST LEETCODE 104-");
    System.out.println(MaxDepthBT.maximumDepthOfBST(node1));
    System.out.println();
//7
    System.out.println("ZIGZAG TRAVERSAL LEETCODE 103-");
    System.out.println(ZigZagTraversal.zigZagLevelTraversal(node1));
    System.out.println();
//6
    System.out.println("LEVEL ORDER TRAVERSAL LEETCODE 102-");
    System.out.println(LevelOrder1.levelOrderTraversal(node1));
    System.out.println();
//5
    System.out.println("SYMMETRIC TREE LEETCODE 101-");
    System.out.println(SymmetricTree.isSymmetricTree(node1));
    System.out.println();
//4
    System.out.println("SAME TREE LEETCODE 100 -");
    System.out.println(SameTree.sameTree(node1,node2));
    System.out.println();
//3
    System.out.println("RECOVER BST O/P LEETCODE 99 -");
    TreeNode node21=new TreeNode(1);
    TreeNode node22=new TreeNode(3);
    TreeNode node23=new TreeNode(2);
    node21.left=node22;
    node22.right=node23;
    System.out.println(InOrder.inOrder(node21));
    RecoverBST.recoverTree(node21);
    Display.display(node21);
    System.out.println(InOrder.inOrder(node21));
    System.out.println();
//2
    System.out.println("VALIDATE OF BST LEETCODE 98- ");
    System.out.println(ValidateBST.validateBST(node3));
    System.out.println();

//1
    System.out.println("INORDER TRAVERSAL BINARY TREE LEETCODE 94-");
    System.out.println(InOrder.inOrder(node1));
    System.out.println();

//    Display.display(node1);
}
}
