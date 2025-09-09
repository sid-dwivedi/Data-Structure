package Arrays;
//https://leetcode.com/problems/rotate-image/?envType=problem-list-v2&envId=array
//Leetcode-48
public class RotateImage {
    public static void rotateImage(int [][] image){
       int n=image.length;
        for (int i = 0; i <(n+1)/2; i++) {
            for (int j = 0; j <n/2; j++) {
                int temp=image[n-1-j][i];
                image[n-1-j][i]=image[n-1-i][n-1-j];
                image[n-1-i][n-1-j]=image[j][n-1-i];
                image[j][n-1-i]=temp;
            }
        }
    }
}
