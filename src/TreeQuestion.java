import  java.util.*;

class TreeQuestion{

    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>>result=new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode>queue=new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int levelSize= queue.size();
            List<Integer>level=new ArrayList<>(levelSize);
            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode= queue.poll();
                level.add(currentNode.value);
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if (currentNode.right!=null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(level);
        }
        return result;
    }

    public TreeNode connect(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode leftMost=root;
        while (leftMost.left!=null){
            TreeNode current=leftMost;
            while (current!=null){
                current.left.next=current.right;
                if(current.next!=null){
                    current.right.next=current.next.left;
                }
                current=current.next;
            }
            leftMost=leftMost.left;
        }
        return root;
    }

    public static boolean isSymtric(TreeNode root){
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()){
            TreeNode left=queue.poll();
            TreeNode right=queue.poll();
            if(left==null&&right==null){
                continue;
            }
            if(left==null||right==null){
                return false;
            }
            if(left.value!=right.value){
                return false;
            }
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

     static int diameter=0;
    public static int getDiameter(TreeNode root){
        helper(root);
        return diameter-1;
    }
    private static int helper(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=helper(root.left);
        int right=helper(root.right);
        int dia=left+right+1;
        diameter=Math.max(dia,diameter);
        return Math.max(left,right)+1;
    }
    public static TreeNode inverse(TreeNode root){
        if(root==null){
             return null;
        }
        TreeNode left=inverse(root.left);
        TreeNode right=inverse(root.right);

        root.left=right;
        root.right=left;

        return root;
    }

    
     static class TreeNode{
        TreeNode left;
        TreeNode right;
        int value;
        TreeNode next;

        public TreeNode(int value){
            this.value=value;
        }
    }

}