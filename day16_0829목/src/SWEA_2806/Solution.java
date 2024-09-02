package SWEA_2806;

import java.util.Scanner;

public class Solution {

    private static int count;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            count = 0;
            int[] board = new int[N];
            solveNQueens(board, 0, N);
            System.out.println("#" + t + " " + count);
        }
    }
    
    private static void solveNQueens(int[] board, int row, int N) {
        if (row == N) {
            count++;
            return;
        }
        
        for (int col = 0; col < N; col++) {
            board[row] = col;
            if (isValid(board, row)) {
                solveNQueens(board, row + 1, N);
            }
        }
    }
    
    private static boolean isValid(int[] board, int row) {
        for (int i = 0; i < row; i++) {
            // 같은 열에 있거나, 대각선에 위치한 경우
            if (board[i] == board[row] || Math.abs(board[i] - board[row]) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}