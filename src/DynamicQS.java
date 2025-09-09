public class DynamicQS extends Stack {
    public DynamicQS(){
        super();
    }
    public DynamicQS(int size){
        super(size);
    }
    public void push(int item){
        if (this.isFull()){
            int []temp=new int[arr.length*2];
            for (int i = 0; i <arr.length ; i++) {
                temp[i]=arr[i];
            }
            arr=temp;
        }

    }
}
