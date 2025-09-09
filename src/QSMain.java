import java.util.Scanner;

public class QSMain {
    public static void main(String[] args) {
        DynamicQS stack=new DynamicQS();
        stack.push(42);
        stack.push(432);
        stack.push(87);
        stack.push(21);
        stack.push(321);
        stack.push(12);
        stack.push(12);
        stack.push(12);stack.push(12);
        stack.push(12);stack.push(12);stack.push(12);stack.push(12);
        stack.push(12);stack.push(12);stack.push(12);stack.push(12);stack.push(12);stack.push(12);

//        stack.peek();
//        System.out.println(stack.pop());
        QSQuestion use=new QSQuestion();
        use.add(32);
        use.add(90);
        use.add(12);
        use.add(97);

        System.out.println(use.removed());

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int x=sc.nextInt();
            int []a=new int[n];
            int []b=new int[m];
            for (int j = 0; j <n ; j++) {
                a[j]= sc.nextInt();
            }
            System.out.println("second arr");
            for (int j = 0; j < m; j++) {
                b[j]=sc.nextInt();
            }
            System.out.println(QSQuestion.twoStack(x,a,b));
        }


    }
}
