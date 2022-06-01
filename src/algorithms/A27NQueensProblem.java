package algorithms;

import java.util.Scanner;

public class A27NQueensProblem {
    final int N = 4;

    /* A utility function to print solution */
    void printSolution(int board[][]) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }

    /* A utility function to check if a queen can
       be placed on board[row][col]. Note that this
       function is called when "col" queens are already
       placeed in columns from 0 to col -1. So we need
       to check only left side for attacking queens */
    boolean isSafe(int board[][], int row, int col) {
        int i, j;

        /* Check this row on left side */
        for (i = 0; i < col; i++)
            if (board[row][i] == 1)
                return false;

        /* Check upper diagonal on left side */
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 1)
                return false;

        /* Check lower diagonal on left side */
        for (i = row, j = col; j >= 0 && i < N; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }

    /* A recursive utility function to solve N
       Queen problem */
    boolean solveNQUtil(int board[][], int col) {
        /* base case: If all queens are placed
           then return true */
        if (col >= N)
            return true;

        /* Consider this column and try placing
           this queen in all rows one by one */
        for (int i = 0; i < N; i++) {
            /* Check if the queen can be placed on
               board[i][col] */
            if (isSafe(board, i, col)) {
                /* Place this queen in board[i][col] */
                board[i][col] = 1;

                /* recur to place rest of the queens */
                if (solveNQUtil(board, col + 1) == true)
                    return true;

                /* If placing queen in board[i][col]
                   doesn't lead to a solution then
                   remove queen from board[i][col] */
                board[i][col] = 0; // BACKTRACK
            }
        }

        /* If the queen can not be placed in any row in
           this column col, then return false */
        return false;
    }

    /* This function solves the N Queen problem using
       Backtracking.  It mainly uses solveNQUtil () to
       solve the problem. It returns false if queens
       cannot be placed, otherwise, return true and
       prints placement of queens in the form of 1s.
       Please note that there may be more than one
       solutions, this function prints one of the
       feasible solutions.*/
    boolean solveNQ() {
        int board[][] = {{0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0}};

        if (solveNQUtil(board, 0) == false) {
            System.out.print("Solution does not exist");
            return false;
        }

        printSolution(board);
        return true;
    }

    // driver program to test above function
    public static void main(String args[]) {
        A27NQueensProblem Queen = new A27NQueensProblem();
        Queen.solveNQ();
    }
}


// Trying to solve it by below code

/*public class A27NQueensProblem {


    public static void display(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    public static boolean place_queen(int board[][], int size) {

        int place_where_i = 0;
        int place_where_j = 0;
        boolean break_flag = false;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    place_where_i = i;
                    place_where_j = j;
                    break_flag = true;
                    break;
                }
            }
            if (break_flag) {
                break;
            }
        }

        if (break_flag == false) {
            return true;
        }

        board[place_where_i][place_where_j] = 3;

        for (int i = 0; i < size; i++) {
            board[i][place_where_j] = 1;
        }
        for (int j = 0; j < size; j++) {
            board[place_where_i][j] = 1;
        }


        for (int k = 0; k < size; k++) {
            if (place_where_i - k >= 0 && place_where_i - k < size && place_where_j - k >= 0 && place_where_j - k < size) {
                if (board[place_where_i - k][place_where_j - k] == 0) {
                    board[place_where_i - k][place_where_j - k] = 1;
                }
            }
        }
        for (int k = 0; k < size; k++) {
            if (place_where_i + k >= 0 && place_where_i + k < size && place_where_j + k >= 0 && place_where_j + k < size) {
                if (board[place_where_i + k][place_where_j + k] == 0) {
                    board[place_where_i + k][place_where_j + k] = 1;
                }
            }
        }
        for (int k = 0; k < size; k++) {
            if (place_where_i + k >= 0 && place_where_i + k < size && place_where_j - k >= 0 && place_where_j - k < size) {
                if (board[place_where_i + k][place_where_j - k] == 0) {
                    board[place_where_i + k][place_where_j - k] = 1;
                }
            }
        }
        for (int k = 0; k < size; k++) {
            if (place_where_i - k >= 0 && place_where_i - k < size && place_where_j + k >= 0 && place_where_j + k < size) {
                if (board[place_where_i - k][place_where_j + k] == 0) {
                    board[place_where_i - k][place_where_j + k] = 1;
                }
            }
        }

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++) {
                if (board[i][j] == 0) {
                    board[i][j] = 2;
                }
            }
        return false;

    }



    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        int n = in.nextInt();

        int board[][] = new int[n][n];
        int r_board[][];

        // safe position --> 0
        // options for placing queen --> 2
        // placed queen at --> 3
        // unsafe positions --> 1

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = 0;

        r_board = board;

        place_queen(r_board, n);
        display(r_board);
    }
}*/