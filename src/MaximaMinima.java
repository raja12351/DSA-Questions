import java.util.Scanner;

public class MaximaMinima {
    public static int maximaMinima(int[][] mat) {
        int n = mat.length;
        int min = Integer.MAX_VALUE;
        int col = -1;
        for(int i=0;i<n;i++){
            min = Integer.MAX_VALUE;
            for(int j=0;j<n;j++){
                if(mat[i][j]<min){
                    min = mat[i][j];
                    col = j;
                }
            }
//            System.out.println(min);
            boolean check = checkLargest(min,col,mat);
            if(check){
                return min;
            }
        }
        return -1;
    }

    private static boolean checkLargest(int min, int col, int[][] mat) {
        int n = mat.length;
        for(int i=0;i<n;i++){
            if(mat[i][col] > min){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();
        int result = maximaMinima(matrix);
        System.out.println(result);
        sc.close();
    }
}
