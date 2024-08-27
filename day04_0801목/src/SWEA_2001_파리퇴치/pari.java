package SWEA_2001_파리퇴치;

import java.util.Scanner;

public class pari {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
			
			int T = sc.nextInt();
			
			for(int t = 1; t <= T; t++) {
				int N = sc.nextInt();
				int M = sc.nextInt();
				
				int[][] pari = new int[N][N];
				
				int[] dx = {-1,1,0,0};
				int[] dy = {0,0,1,-1};
				int[] lx = {-1,-1,1,1};
				int[] ly = {1,-1,-1,1};
				int max = 0;
				
				for(int i = 0; i < N; i++) {
					for(int j =0; j < N; j++) {
						pari[i][j] = sc.nextInt();
					}
				}
						for(int i = 0; i < N; i++) {
							for(int j =0; j < N; j++) {
								
								int	hab = pari[i][j];
							for(int k = 1; k < M; k++) {
								for(int n = 0; n < 4; n++) {
									
									int nx = i + dx[n] * k;  
									int ny = j + dy[n] * k;    
									if(nx>=0 && nx < N && ny >=0 && ny < N) {
										hab += pari[nx][ny];
									}
									if(max < hab) {
										max = hab;
									}
								}
							}
								
							}
							}
						for(int i = 0; i < N; i++) {
							for(int j =0; j < N; j++) {
								
								int	hub = pari[i][j];
							for(int k = 1; k < M; k++) {
								for(int n = 0; n < 4; n++) {
									
									int mx = i + lx[n] * k;  
									int my = j + ly[n] * k;    
									if(mx>=0 && mx < N && my >=0 && my < N) {
										hub += pari[mx][my];
									}
									if(max < hub) {
										max = hub;
									}
								}
							}
								
							}
							}
						System.out.println("#"+t+" "+max);
			}
	}
}
