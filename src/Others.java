import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Others {

    public static void bubleSort(int []arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    public static void insertionSort(int []arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }
    public static void selectionSort(int []arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - 1 - i;
            int maxvalinx = max(arr, 0, last);
            swap(arr,last,maxvalinx);
        }
    }
    public static void swap(int [] arr,int last,int max){
        int temp=arr[last];
        arr[last]=arr[max];
        arr[max]=temp;

    }

        public static int max(int []arr,int start,int end) {
            int maxi = start;
            for (int i = 0; i <= end; i++) {
                if (arr[maxi] < arr[i]) {
                    maxi = i;
                }
            }
            return maxi;
        }

//        public static void cyclicSort(int []arr) {
//
//            int i = 0;
//            while (i < arr.length) {
//                int correct = arr[i] - 1;
//                if (i != correct) {
//                    swap(arr, i, correct);
//                } else {
//                    i++;
//                }
//            }
//        }


        public static void countSort(int []arr){
        if (arr==null||arr.length<=1){
            return;
        }
        int max=arr[0];
        for (int num:arr){
            if (num>max){
                max=num;
            }
        }
        int [] countarr=new int[max+1];
        for (int num:arr){
            countarr[num]++;
        }
        int index=0;

            for (int i = 0; i <= max; i++) {
                while (countarr[i]>0){
                    arr[index]=i;
                    index++;
                    countarr[i]--;
                }
            }

    }
    public static void freq(String str){
         char arr[]=new  char [str.length()+1];
        for (int i = 0; i < str.length(); i++) {
           arr[i]=str.charAt(i);
        }
        int coun=0;
        for (int i = 0; i < arr.length-1 ; i++) {
            char ch=arr[i];
        if (arr[i+1]!=arr[i]) {
            for (int j = i; j >= 0; j--) {
                if (ch == arr[j]) {
                    coun++;
                }
            }
            System.out.println(ch + " " + coun);
            coun = 0;
        }
        }
    }

    public static void freqency(String p,String up){
        if (up==null){
            return;
        }

    }

    public static void main(String[] args) {
        boolean [][]maze={{true,true,true},
                         {true,true,true},
                        {true,true,true}
        }              ;
        int []arr={11,5,4,3,2,2,3,3,1,1};
//        cyclicSort(arr);
//        System.out.println(Arrays.toString(arr));
//        countSort(arr);
//        System.out.println(Arrays.toString(arr));
        //allPath("",maze,0,0);
        String  str="soojal";

        freq(str);
    }

}
