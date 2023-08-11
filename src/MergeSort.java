import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        mergesort(0,n-1,arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergesort(int start, int end, int[] arr) {
        if(start == end){
            return;
        }

        int mid = (start + end) / 2;

        mergesort(start,mid,arr);
        mergesort(mid+1,end,arr);

        merge(start,mid,end,arr);
    }

    private static void merge(int start, int mid, int end, int[] arr) {
        //for start -> mid
        ArrayList<Integer> A = new ArrayList<>();
        for(int i=start;i<=mid;i++){
            A.add(arr[i]);
        }

        //for mid+1 -> end
        ArrayList<Integer> B = new ArrayList<>();
        for(int i=mid+1;i<=end;i++){
            B.add(arr[i]);
        }

        //for sorting
        ArrayList<Integer> C = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<A.size() && j<B.size()){
            if(A.get(i) <= B.get(j)){
                C.add(A.get(i));
                i++;
            }
            else{
                C.add(B.get(j));
                j++;
            }
        }

        while(j<B.size()){
            C.add(B.get(j));
            j++;
        }
        while(i<A.size()){
            C.add(A.get(i));
            i++;
        }

        int v = start; //always keep v = start and not 0 , because start is different from 0 in few cases here
        for(int k=0;k<C.size();k++){
            arr[v] = C.get(k);
            v++;
        }
    }
}
