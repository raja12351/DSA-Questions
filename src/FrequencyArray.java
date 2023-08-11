import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int max= 0;
        for(int i=0;i<n;i++){
            max = Math.max(max,arr[i]);
        }

        int[] freq = new int[max+1];

        for(int i=0;i<n;i++){
            freq[arr[i]]++;
        }

        for(int i=0;i<max+1;i++){
            System.out.println(i+" "+freq[i]);
        }
    }
}
