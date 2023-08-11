import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        mergerSort(0,n-1,arr);

        for(int i =0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergerSort(int start, int end, int[] arr) {
        if(start >= end){
            return;
        }

        int pivotIndex = partitions(start,end,arr);

        mergerSort(start,pivotIndex-1,arr);
        mergerSort(pivotIndex+1,end,arr);
    }

    private static int partitions(int start, int end, int[] arr) {

        int pivot = arr[end];
        int i = start;

        for(int j=start;j<=end-1;j++){
            if(arr[j]<pivot){
                int tmp = arr[j];
                arr[j] = arr[i];
                arr[i] = tmp;

                i++;
            }
        }

//        pivot at the ith position
        int tmp = arr[end];
        arr[end] = arr[i];
        arr[i] = tmp;

        return i;
    }
}
