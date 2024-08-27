package SWEA_4613_러시아_국기_같은_깃발;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			
				int N = sc.nextInt();
				int M = sc.nextInt();
				
				char[][] Rusia = new char[N][M];
				
				for(int i = 0 ; i < N; i++) {
					String str = sc.next();
					for(int j = 0; j < M; j++) {
						Rusia[i][j] = str.charAt(j);
					}
				}
				
				int min = Integer.MAX_VALUE;
			
			for(int w = 0; w <= N-3; w++) {
				for(int b = w+1; b <= N -2; b++) {
										
					int count = 0;
					
					for(int r = 0; r<=w; r++) {
						for(int c= 0; c<M; c++) {
							if(Rusia[r][c] != 'W') count++;
						}
					}
					for(int r= w+1; r<=b; r++) {
						for(int c= 0; c<M; c++) {
							if(Rusia[r][c] != 'B') count++;
						}
					}
					for(int r = b+1; r < N; r++) {
						for(int c = 0; c < M; c++) {
							if(Rusia[r][c] != 'R') count++;
						}
					}
					
					if(min > count) min = count;
			}
		}
			System.out.println("#"+t+" "+min);
	}

}
}