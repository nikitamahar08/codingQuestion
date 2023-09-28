package bitwise;
import java.util.*;
public class permutation {
    public static void printPermutation(String str , String ans){
    //base case
     if(str.length() == 0){
        System.out.println(ans);
        return;
     }
    //recursion
    for(int i = 0; i<str.length();i++){
        char curr = str.charAt(i);
        String newstr = str.substring(0, i) + str.substring( i+1);
        printPermutation(newstr, ans+curr);
    }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

   printPermutation(str, "");
    sc.close();
}


}