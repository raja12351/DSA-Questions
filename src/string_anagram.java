import java.util.*;
public class string_anagram {
    public static boolean checkWord(String word , String anagram){
        if(word.length() != anagram.length()){
            return false;
        }
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            int index = anagram.indexOf(c);

            if(index != -1){
                anagram = anagram.substring(0,index)+anagram.substring(index+1);
            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String anagram = sc.next();
        boolean check = checkWord(word,anagram);
        if(check){
            System.out.println("It is anagram");
        }else{
            System.out.println("It is not anagram");
        }
    }
}
