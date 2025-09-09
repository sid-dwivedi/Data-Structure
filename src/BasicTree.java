class BasicTree{

    class Node{
        private Node left;
        private Node right;
        private int value;
        private int height;

        public Node(int  value){
            this.value=value;
        }
    }
    private Node root;

    public int Height(){
        return Height(root);
    }
    private int Height(Node node){
        if(node==null){
            return -1;
        }
        return node.height;
    }
    public void insert(int value){
        root=insert(root,value);
    }
    private Node insert(Node node,int value){
        if(node==null){
            node=new Node(value);
            return node;
        }
        if(value<node.value){
            node.left=insert(node.left,value);
        }
        if(node.value<value){
            node.right=insert(node.right,value);
        }
        node.height=Math.max(Height(node.left),Height(node.right))+1;
        return rotate(node);
    }
    private Node rotate(Node node){
        if(Height(node.left)-Height(node.right)>1){
            if(Height(node.left.left)-Height(node.left.right)>0){
                    return rightRotate(node);
            }
            if(Height(node.left.left)-Height(node.left.right)<0){
                node.left=leftRotate(node.left);
                return rightRotate(node);
            }
        }
        if(Height(node.left)-Height(node.right)<-1){
                if(Height(node.right.left)-Height(node.right.right)<0){
                    return leftRotate(node);
                }
                if(Height(node.right.left)-Height(node.right.right)>0){
                    node.right=rightRotate(node.right);
                    return leftRotate(node);
                }
        }
        return node;
    }

    public Node leftRotate(Node p){
        Node c=p.left;
        Node t=c.right;

        c.right=p;
        p.left=t;

        p.height=Math.max(Height(p.left),Height(p.right))+1;
        c.height=Math.max(Height(c.left),Height(c.right))+1;

        return c;
    }

    public Node rightRotate(Node c){
        Node p=c.right;
        Node t=p.left;

        p.left=c;
        c.right=t;

        p.height=Math.max(Height(p.left),Height(p.right))+1;
        c.height=Math.max(Height(c.left),Height(c.right))+1;

        return p;
    }


}