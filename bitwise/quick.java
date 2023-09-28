package bitwise;
import java.util.*;
public class quick {
    public static void quickSort(int[]arr , int si ,  int ei){
        if(si>= ei){
            return;
        }
        int pid = partition(arr, si, ei);
        quickSort(arr, si, pid-1);
        quickSort(arr, pid+1, ei);
    }
    public static int partition(int[] arr , int si , int ei){
        int pivot = arr[ei];
        int i = si-1;
        for(int j = si;j<ei;j++){
            if(arr[j]<= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int[] arr = new int[n];
    for(int i = 0; i<n;i++){
        arr[i] = sc.nextInt();
    }

quickSort(arr, 0, n-1);
for(int i = 0; i<n;i++){
    System.out.print(arr[i]+" ");
}
System.out.println();
sc.close();
}


}