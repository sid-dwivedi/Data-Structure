public class LinkList {

    private Node head;
    private Node tail;
    private int size=0;
    public void insertFirst(int value){

        Node node=new Node(value);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }
    public void insertLast(int value){
        if (tail==null){
            insertFirst(value);
            return;
    }
    Node node=new Node(value);
        tail.next=node;
        tail=node;
        size++;
}
public void insert(int value,int index){
        if (index==0){
            insertFirst(value);
            return;
        }
        if (index==size){
            insertLast(value);
            return;
        }
        Node temp=head;
    for (int i = 1; i < index; i++) {
        temp=temp.next;
    }
    Node node=new Node(value,temp.next);
    temp.next=node;
    size++;
}

public void display(){
        Node temp=head;
    while (temp!=null){
        System.out.print(temp.value+" - ");
        temp=temp.next;
    }
    System.out.println("END");
}
public void deleteFirst(){
        if (head==null){
            tail=null;
        }
        head=head.next;
        size--;
}

public void deleteLast(){
        if (size<=1){
            deleteFirst();
            return;
        }
        Node secondLast=get(size-2);
        tail=secondLast;
        tail.next=null;
        size--;
}
public void delete(int index){
        if (index==0){
            deleteFirst();
            return;
        }
        if (index==size-1){
            deleteLast();
            return;
        }
        Node prev=get(index-1);
        prev.next=prev.next.next;
        size--;
}

public Node get(int index){
        Node node=head;
    for (int i = 0; i < index; i++) {
        node=node.next;
    }
    return node;
}
public void find(int value){
        Node temp=head;
        while (temp!=null){
            if (temp.value==value){
                System.out.printf("YES - "+temp.value);
            }
            temp=temp.next;
        }
}

public void duplicate(){
        Node node=head;
        while (node.next!=null){
            if (node.value==node.next.value){
                node.next=node.next.next;
                size--;
            }else {
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
}


    class Node{
        Node next;
        int value;
        public Node(int value){
            this.value=value;
        }
        public Node(int val,Node nex){
            value=val;
            next=nex;
        }
    }

    public static LinkList merge(LinkList first,LinkList second){
        Node f=first.head;
        Node s=second.head;
        LinkList ans=new LinkList();
        while (f!=null&&s!=null){
            if (f.value<s.value){
                ans.insertLast(f.value);
                f=f.next;
            }else {
                ans.insertLast(s.value);
                s=s.next;
            }
        }
        while (f!=null){
            ans.insertLast(f.value);
            f=f.next;
        }
        while (s!=null){
            ans.insertLast(s.value);
            s=s.next;
        }
        return ans;
    }

}
