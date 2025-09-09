package Arrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//26
        int []sqrArr={-4,-1,0,3,10};
        System.out.println(Arrays.toString(SquaresOfSortedArray.sortedArray(sqrArr)));
//25
        int []findAllDis={4,3,2,7,8,2,3,1};
        System.out.println(FindAllNumberDis.findAllDis(findAllDis));
//24
        int []findAllDuplicate={4,3,2,7,8,2,3,1};
        System.out.println(FindAllDuplicates.findDuplicate(findAllDuplicate));
//23
        int[]findDuplicate={1,3,4,2,2};
        System.out.println(FindDuplicate.findDuplicate(findDuplicate));
//22
        int []movesZero={0,1,0,3,12};
        System.out.println(Arrays.toString(MoveZero.moveZero(movesZero)));
//21
        int []mising={3,0,1};
        System.out.println(MissingNumber.missingNumber(mising));
//20
        int []product={1,2,3,4};
        System.out.println(Arrays.toString(ProductOfArrayExceptItself.productArray(product)));
//19
        int []containsDuplicate={1,1,1,3,3,4,3,2,4,2};
        System.out.println(ContainDuplicate.containsDuplicate(containsDuplicate));
//18
        int []majority={2,2,1,1,1,2,2};
        System.out.println(MajorityElement.majorityElement(majority));
//17
        String [] polish={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(ReversePolishNotation.reversePolish(polish));
//16
        int[]number={4,1,2,1,2};
        System.out.println(SingleNumber.singleNumber(number));
//15
        int []stock2={7,1,5,3,6,4};
        System.out.println(BuyAndSellStock2.buyAndSell(stock2));
//14
        int []stock={7,1,5,3,6,4};
        System.out.println(BuyAnsSellStock1.buyAndSell(stock));
//13
        int []arr1={1,2,3,0,0,0};
        int []arr2={2,5,6};
        MergeTwoSortedArray.merge(arr1,3,arr2,3);
        System.out.println(Arrays.toString(arr1));
//12
        System.out.println(PascalTringle.pascalTringle(5));
//11
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(TwoSum.twoSum(nums,18)));
//10
        int []height={1,8,6,2,5,4,8,3,7};
        System.out.println(WaterContainer.waterContainer(height));
//9
        String [] LongestStrs={"flower","flow","flight"};
        System.out.println(LongestCommonPrefix.longestCommonPrefix(LongestStrs));
//8
        int []duplicate={0,0,1,1,1,2,2,3,3,4};
        System.out.println(RemoveDuplicate.removeDuplicate(duplicate));
//7
        int[]remove={0,1,2,2,3,0,4,2};
        System.out.println(RemoveElement.removeElement(remove,2));
//6
        int []plusOne={1,2,3};
        System.out.println(Arrays.toString(PlusOne.plusOne(plusOne)));
//5
        int []rotate={4,5,6,7,0,1,2};
        System.out.println(SearchInRotatedArray.search(rotate,0));
//4
        int []firstLast={5,7,7,8,8,10};
        System.out.println(Arrays.toString(FirstLastPosition.firstLastPosition(firstLast,8)));
//3
        int []insert={1,3,5,6};
        System.out.println(SearchInsertPosition.searchInsertPosition(insert,7));
//2
        int [][]image={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(image));
        RotateImage.rotateImage(image);
        System.out.println(Arrays.deepToString(image));
//1
        String []strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(GroupAnagrams.groupAnagrams(strs));


    }
}
