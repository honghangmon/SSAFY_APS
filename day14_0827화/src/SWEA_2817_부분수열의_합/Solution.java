package SWEA_2817_부분수열의_합;

import java.util.Scanner;

public class Solution {	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <=T; t++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int[] tree = new int[N];
			
			for(int i = 0; i < N; i++) {
				tree[i] = sc.nextInt();
			}
			int count = 0;
			
			
			for(int i = 0; i<(1<<N); i++) {
				int sum = 0;
				for(int j = 0; j < N; j++) {
					if((i & (1<<j)) > 0) {
						sum += tree[j]; 
					}
				}
				if(sum == K) {
					count++;
				}
			}
			System.out.println("#"+t+" "+count);
		}
		
}
}