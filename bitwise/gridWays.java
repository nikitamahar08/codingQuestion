package bitwise;

import java.util.*;

public class gridWays {
    public static int gridWay(int i, int j, int n, int m) {
        // base case
        if (i == n - 1 && j == m - 1) {
            return 1;
        } else if (i == n || j == m) {
            return 0;
        }
        int w1 = gridWay(i + 1, j, n, m);
        int w2 = gridWay(i, j + 1, n, m);
        return w1 + w2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of ways ....");
        int n = sc.nextInt();
        System.out.println("Enter the no. of column ......");
        int m = sc.nextInt();

        System.out.println("the no. of ways " + gridWay(0, 0, n - 1, m - 1));
        sc.close();
    }

}
