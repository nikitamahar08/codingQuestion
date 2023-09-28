package bitwise;
import java.util.*;
public class nQueens {
    public static boolean isSafe(char[][]board,int row,  int col){
        //vertically
        for(int i = row-1;i>= 0;i--){
            if(board[i][col] == 'Q')
            return false;
        }
        //left
         for(int i = row-1,j=col-1; i>= 0&&j>=0;i--,j--){
            if(board[i][j] == 'Q')
            return false;
         }

        //right
        for(int i = row-1,j=col+1;i>=0&&j<board.length;i--,j++){
          if(board[i][j] == 'Q')
          return false;
}
         return true;
    }
    public static void nQueen(char [][] board , int row){
        //base case
        if(row == board.length){//agar row  board ki length tak ho jayga toh print kar do uska baad
           printBoard(board);
           return;
        }
        //recurssion 
        for(int j = 0; j<board.length;j++){
              if(isSafe(board, row,j)){
                board[row][j] = 'Q';//if space found then fill it as a 'Q' where Q for queen
                nQueen(board, row+1);//function call
                board[row][j] = 'X';//then backtrackking....
            }
        }
    }

        public static void printBoard(char board[][]){
            System.out.println("--------Chess Board-----------");
          
             for(int i = 0; i<board.length;i++){
            for(int j = 0; j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }    
    
           
        }
        

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char board[][] = new char[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board,0);
        sc.close();

    }
}
