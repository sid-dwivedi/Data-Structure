public class LL_Main {

    public static void main(String[] args) {
        LinkList ll=new LinkList();
        ll.insertFirst(23);
        ll.insertFirst(3);
        ll.insertFirst(63);
        ll.insertFirst(93);
        ll.insertFirst(33);
        ll.display();

        ll.insertLast(100);
        ll.insertLast(200);
        ll.display();

        ll.insert(110,2);
        ll.display();

        ll.deleteFirst();
        ll.display();

        ll.deleteLast();
        ll.display();

        ll.delete(2);
        ll.display();

        ll.find(100);

        ll.duplicate();
        ll.display();

        LinkList first=new LinkList();
        LinkList second=new LinkList();
        first.insertLast(20);
        first.insertLast(30);
        first.insertLast(40);
        first.insertLast(50);
        first.insertLast(60);

        second.insertLast(15);
        second.insertLast(25);
        second.insertLast(35);
        second.insertLast(45);
        second.insertLast(55);

        LinkList ans= LinkList.merge(first,second);
        ans.display();

    }
}
