import java.util.*;


class Node{
    int data;
    Node next;

}
public class applyingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Node root = createLL(arr,n);
        display(root);
    }

    private static void display(Node root) {
        Node curr = root;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    private static Node createLL(int[] arr, int n) {
        Node root = null;
        for(int i=0;i<n;i++){
            root = arrayToList(root,arr[i]);
        }
        return root;
    }

    private static Node arrayToList(Node root, int i) {
        Node temp = new Node();
        Node ptr;
        temp.data = i;
        temp.next = null;
        if(root == null){
            root = temp;
        }
        else{
            ptr = root;
            while(ptr.next != null){
                ptr = ptr.next;
            }
            ptr.next = temp;
        }
        return root;
    }
}
