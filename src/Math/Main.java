package Math;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//20
        System.out.println(PowerOfFour.pow(64));

//19
        System.out.println(PowerOfThree.pow(27));

//18
        System.out.println(PowerOfTwo.pow(32));

//17
        System.out.println(HappyNumber.happyNumber(19));

//16
        System.out.println(ExcelSheetColumn2.sheet("ZY"));

//15
        System.out.println(ExcelSheetColumn.sheet(701));

//14
        String []tokens={"2","1","+","3","*"};
        System.out.println(ReversePolishNotation.reverse(tokens));

//13
        System.out.println(ClimbingStairs.climbing(7));

//12
        System.out.println(SqrtX.sqrt(36));

//11
        System.out.println(AddBinary.addBinary("11","1"));

//10
        int[]plus={9,9,9};
        System.out.println(Arrays.toString(PlusOne.plusOne(plus)));

//9
         System.out.println(UniquePath.path(3,3));

//8
        System.out.println(Pow.pow(2,10));

//7
        int [][]image={{1,2,3},{4,5,6},{7,8,9}};
        RotateImage.rotate(image);
        System.out.println(Arrays.deepToString(image));

//6
        System.out.println(MultiplyString.multiplay("12","12"));

//5
        System.out.println(DivideTwoInteger.divide(100,2));

//4
        System.out.println(RomanToInteger.romanToInteger("MI"));

//3
        System.out.println(IntegerToRoman.integerToRoman(1001));

//2
        System.out.println(Palindrome.isPalindrome(121));

//1
     ListNode node1=new ListNode(2);
     ListNode node2=new ListNode(4);
     ListNode node3=new ListNode(3);
     ListNode node4=new ListNode(5);
     ListNode node5=new ListNode(6);
     ListNode node6=new ListNode(4);

     node1.next=node2;
     node2.next=node3;
     node3.next=null;
     node4.next=node5;
     node5.next=node6;
     node6.next=null;

     ListNode node7=AddTwoNumber.addTwoNode(node1,node4);
     LinkedListDisplay.display(node7);


    }
}
