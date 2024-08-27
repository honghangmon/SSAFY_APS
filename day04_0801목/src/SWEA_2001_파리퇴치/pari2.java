package SWEA_2001_파리퇴치;

import java.util.Scanner;

public class pari2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t =1; t<=T; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			int max = 0;
			
			int[][] pari = new int[N+2*(M-1)][N+2*(M-1)];
			
			for(int i = M-1; i < N+ M-1; i++) {
				for(int j = M-1; j < N+ M-1; j++) {
					pari[i][j] = sc.nextInt();
				}
				}
			for(int i = M-1; i < N+M-1; i++) {
				for(int j = M-1; j < N+M-1; j++) {
					int hab = pari[i][j];
					for(int k= 1; k < M; k++) {
						hab += pari[i+k][j] + pari[i-k][j] + pari[i][j+k] + pari[i][j-k];
					}
					if(max < hab) {
						max = hab;
					}
				}
			}
			for(int i = M-1; i < N+M-1; i++) {
				for(int j = M-1; j < N+M-1; j++) {
					int hub = pari[i][j];
					for(int k= 1; k < M; k++) {
						hub += pari[i-k][j+k] + pari[i-k][j-k] + pari[i+k][j+k] + pari[i+k][j-k];
					}
					if(max < hub) {
						max = hub;
					}
				}
			}
			System.out.println("#"+t+" "+max);
		}
	}

}
