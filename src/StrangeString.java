import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class StrangeString {
    static String strangeString(int n) {
        Deque<Character> dq = new ArrayDeque<>();
        char ch = 'a';
        for(int i=1;i<=n;i++){
            if(i%2 != 0){
                dq.addFirst(ch);
                ch++;
            }else{
                dq.addLast(ch);
                ch++;
            }
            if(ch>'z'){
                ch = 'a';
            }
        }
        String ans = "";
        while(dq.size()>0){
            char c = dq.pollFirst();
            ans = ans + c;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}
