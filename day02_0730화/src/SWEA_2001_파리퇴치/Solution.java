package SWEA_2001_파리퇴치;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int t = 1; t <= T; t++) {

            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] pari = new int[N][N];

            for(int i = 0; i < N; i++) {
                for(int j = 0; j < N; j++) {
                    pari[i][j] = sc.nextInt(); 
                }
            }

            int max = 0;
            for(int di = 0; di < N - M; di++) {
                for(int dj = 0; dj < N - M; dj++) {
                    int job = 0;
                    for(int i = di; i < M + di; i++) {
                        for(int j = dj; j < M + dj; j++) {
                            job = job + pari[i][j]; 
                        }
                    }
                    if(job > max) {
                        max = job;
                    }
                }
            }
            System.out.println("#"+ t + " "+ max);

        }
            sc.close();
    }
}