import java.util.ArrayList;

public class Heap <T extends Comparable<T>>{
    private ArrayList<T> list;
    public Heap(){
        list=new ArrayList<T>();
    }
    public void swap(int first,int second){
        T temp=list.get(first);
        list.set(first,list.get(second));
        list.set(second,temp);
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index) {
        return (index * 2) + 1;
    }
    private int right(int index){
        return (index*2)+2;
    }

    public void insert(T value){
        list.add(value);
        upHeap(list.size()-1);
    }
    private void  upHeap(int index){
        if (index==0){
            return;
        }
        int p=parent(index);
        if (list.get(index).compareTo(list.get(p))>0){
            swap(index,p);
            upHeap(p);
        }
    }
    private void remove() throws Exception{
        if (list.isEmpty()){
            throw new Exception("List is Empty");
        }
        T temp= list.get(0);
        T last=list.remove(list.size()-1);
        if (!list.isEmpty()){
            list.set(0,last);
            downHeap(0);
        }
    }
    private void downHeap(int index){
        int min=index;
        int left=left(index);
        int right=right(index);

        if (left<list.size()&&list.get(left).compareTo(list.get(index))<0){
            min=left;
        }
        if (right<list.size()&&list.get(right).compareTo(list.get(index))<0){
            min=right;
        }
    }

}
