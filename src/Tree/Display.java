package Tree;

public class Display {
    public static void display(TreeNode root){
        display(root," Root Node ");
    }
    private static void display(TreeNode root,String str){
        if (root==null)
            return;
        System.out.println(str+root.value);
        display(root.left, " Left Child Of "+root.value+" : ");
        display(root.right," Right Child Of "+root.value+" : ");
    }
}
