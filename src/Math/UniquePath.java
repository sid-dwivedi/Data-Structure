package Math;
//https://leetcode.com/problems/unique-paths/submissions/1744645426/?envType=problem-list-v2&envId=math
//Leetcode-62
public class UniquePath {
    public static int path(int m,int n){
        int [][]maze=new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i==0||j==0) maze[i][j]=1;
                else maze[i][j]=maze[i][j-1]+maze[i-1][j];
            }
        }
        return maze[m-1][n-1];
    }
}
