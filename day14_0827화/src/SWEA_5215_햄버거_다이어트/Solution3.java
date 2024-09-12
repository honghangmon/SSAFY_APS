package SWEA_5215_햄버거_다이어트;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution3 {
	static int N;
	static int L;
	static int[][] ham;
	static boolean[] sel;
	static int[] tmp;
	static int max;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			 N = sc.nextInt();
			 L = sc.nextInt();
			
			ham = new int [N][2];
			sel = new boolean [N];
			max = 0;
			
			for(int i = 0; i < N; i++) {
				ham[i][0] = sc.nextInt();
				ham[i][1] = sc.nextInt();
				
			}
			cal(0);
			System.out.println("#"+t+" "+max);
		}
	}
	
	static void cal(int idx) {
		if(idx == N) {
			int hab = 0;
			int jum = 0;
			for(int i = 0; i < N; i++) {
				if(sel[i]) {
				hab += ham[i][1];
				jum += ham[i][0];
				}
				if(hab <= L) {
					if(max < jum) {
						max = jum;
					}
				}
			}
			return;
		}
		
		
		sel[idx] = true;
		cal(idx+1);
		sel[idx] = false;
		cal(idx+1);
	}
	
}