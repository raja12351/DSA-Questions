import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//        Insertion Sort
        for(int i=1;i<n;i++){
            int currEle = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>currEle){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currEle;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
