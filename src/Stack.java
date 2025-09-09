public class Stack {

    public int[]arr;
    private static final int defaultsize=10;
    int ptr=-1;
    public Stack(){
        this(defaultsize);
    }
    public Stack(int size){
        this.arr=new int[size];
    }
    public boolean isFull(){
        return ptr==arr.length-1;
    }
    public boolean isEmpty(){
        return ptr==-1;
    }
    public void push(int value){
        if (isFull()){
            System.out.println("stack is full ");
        }
        arr[++ptr]=value;
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
        }
        return arr[ptr--];
    }

    public void peek(){
        if (isEmpty()){
            System.out.println("is Empty");
        }
        System.out.println(arr[ptr]);
    }

}
