package bitwise;
import java.util.*;
public class checkEvenOrOdd{
    public static void evenOrOdd(int n){
        for(int i = 1; i<n;i++){
        if((i & 1 )== 0){
            System.out.println(i+" = Even number");
        }else{
            System.out.println(i+ " = Odd number");
        }
    }
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        evenOrOdd(n);
        sc.close();
     }
}