package SWEA_5215_햄버거_다이어트;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
	static int max;
	static boolean[] sel;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			
			max = 0;
			int N = sc.nextInt();
			int L = sc.nextInt();
			sel = new boolean[N];
			int[][] hamburger = new int[N][2];
			
			for(int i = 0; i < N; i++) {
					hamburger[i][0] = sc.nextInt();
					hamburger[i][1] = sc.nextInt();
				}
			
			 johab(t,0,N,L,hamburger);
			 System.out.println("#"+t+" "+max);
			}
		}
	
	public static void johab (int t, int idx, int N , int L , int[][] hamburger) {
		if(idx == N) {
			int cal = 0;
			int score = 0;
			for(int i = 0; i < N; i++) {
				if(sel[i]) {
				 score += hamburger[i][0];
				 cal  += hamburger[i][1];
			}
			if(cal <= L) {
					if(max < score) {
						max = score;
					}
				}
			}
			return;
			}
		sel[idx] = true;
		johab(t,idx+1,N,L,hamburger);
		
		sel[idx] = false;
		johab(t,idx+1,N,L,hamburger);
	}
}