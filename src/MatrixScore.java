import java.util.*;

class Solution {
    public int score(int n,int m, int[][] A) {
        // Toggle all rows starting with 0
        for(int i=0;i<n;i++){
            if(A[i][0]==0){
                toggleRow(A,i,m);
            }
        }
        // Toggle columns starting from 2nd columns,if no. of 1 are less than half of row
        for(int j=1;j<m;j++){
            int onesCount = 0;
            for(int i=0;i<n;i++){
                if(A[i][j]==1){
                    onesCount++;
                }
            }
            if(onesCount < (n+1)/2){
                toggleCol(A,n,j);
            }
        }
        int score = 0;
        for(int i=0;i<n;i++){
            int rowValue = 0;
            for(int j=0;j<m;j++){
                rowValue = rowValue*2 + A[i][j];
            }
            score += rowValue;
        }
        return score;
    }
    public void toggleRow(int[][] A, int row, int col){
        for(int j=0;j<col;j++){
            A[row][j] = 1 - A[row][j];
        }
    }
    public void toggleCol(int[][] A, int row, int col){
        for(int i=0;i<row;i++){
            A[i][col] = 1 - A[i][col];
        }
    }
}

public class MatrixScore {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        sc.close();
        System.out.println(Obj.score(n, m, arr));
    }
}   