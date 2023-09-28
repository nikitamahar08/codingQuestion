package bitwise;
import java.util.*;
public class ithbits {
    public static int getithbit(int n,int i){
        if((n & 1<<i) == 0){
            return 0;
        }
        return 1;

    }
    public static int setithbit(int n , int i){
       int bitwise = 1<<i;
      
        return (n | bitwise);
       }

       public static int clearithbit(int n,int i){
        int bitwise = ~(1<<i);
        return n & bitwise;
       }
       public static int updateIthBit(int n, int i,int newBit){
        if(newBit == 0){
            return clearithbit(n, i);
        }else{
            return setithbit(n, i);
        }
       }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
    // System.out.println(getithbit(n, 2));
    // System.out.println(setithbit(n, 3));
    // System.out.println(clearithbit(n, 1));
    System.out.println(updateIthBit(n,2,1));
    sc.close();
    
    
    }
}
