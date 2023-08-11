import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

//        Selection Sort
        for(int i=0;i<n;i++){
            int minEle = arr[i];
            int minEleIndex = i;

            for(int j=i+1;j<n;j++){
                if(arr[j]<minEle){
                    minEle = arr[j];
                    minEleIndex = j;
                }
            }
            if(i != minEleIndex){
                int temp = arr[i];
                arr[i] = arr[minEleIndex];
                arr[minEleIndex] = temp;
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
