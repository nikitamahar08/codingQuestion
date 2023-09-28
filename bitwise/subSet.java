package bitwise;
import java.util.*;
public class subSet {
    public static void printSubset(String str , String ans , int i){
        if(i == str.length()){
            if(ans == ""){
                System.out.println("null");
            }else{
            System.out.println(ans);
            return;
            }
        }
        printSubset(str, ans+str.charAt(i), i+1);
        printSubset(str, ans, i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

         printSubset(str, " ", 0);
         sc.close();     


    }
}
