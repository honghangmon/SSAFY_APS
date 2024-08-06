package SWEA_1217_거듭제곱;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		for(int t = 1; t<=10; t++) {
			
			int T = sc.nextInt();
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int dab = jeje(N, M);
			System.out.println("#"+T+" "+dab);
		}
		
		
				
		
		}

	static int jeje(int N, int M) {
		if(M == 0) {
			return 1;
		}
		else {
			return N*jeje(N,M-1);
		}
	}
}

