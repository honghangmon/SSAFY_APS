package 순열구현실습;

import java.util.Arrays;
import java.util.Scanner;

public class 마라톤 {
	
	static int N;
	static int M;
	static int K;
	static int[] sel;
	static int[] runner;
	static int count;
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			
			N = sc.nextInt();
			M = sc.nextInt();
			K = sc.nextInt();
			
			count = 0;
			sel = new int[M];
			runner = new int[N+1];
			
			for(int i = 0; i < N; i ++) {
				runner[i] = sc.nextInt();
			}
			
			win(0 , 0);
			
			if(count == 0) {
				System.out.println("#"+t+" "+"-1");
			}else {
				System.out.println("#"+t+" "+count);
				
			}
		}

	}
	
	static void win (int idx , int sidx) {
		if(sidx == M) {
			int hab = 0;
			for(int i = 0; i < M; i++) {
				hab += sel[i];
			}
			if(hab == K) {
				perm(0);
			}
			return;
		}
		if(idx == N) {
			return;
		}
		
		sel[sidx] = runner[idx];
		win(idx + 1, sidx + 1);
		win(idx +1, sidx);
	}
	
	static void perm(int idx) {
		
		if(idx == M) {
			count++;
			return;
		}
		
		for(int i = idx; i < M; i++) {
			swap(i , idx);
			perm(idx+1);
			swap(i , idx);
		}
	}
	
	static void swap(int a, int b) {
		int tmp = sel[a];
		sel[a] = sel[b];
		sel[b] = tmp;
	}

}
