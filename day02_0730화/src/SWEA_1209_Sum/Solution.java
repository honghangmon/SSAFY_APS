package SWEA_1209_Sum;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] num = new int[100][100];

		
		for(int r = 1; r <= 10; r++) {
			
			int t = sc.nextInt();
			
			int max = 0;
			
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j <100; j++) {
				num[i][j] = sc.nextInt();
			}
		}
			
			
		
		
		for(int i = 0; i < 100; i++) {
			int A = 0;
			for(int j = 0; j <100; j++) {
				A = A + num[i][j];
			
			}
			if( A > max ) {
				max = A;
			}
		}
			
		
			
		for(int j = 0; j < 100; j++) {
			int B = 0;
			for(int i = 0; i <100; i++) {
				B = B + num[i][j];
			
			}
			if( B > max ) {
				max = B;
			}
		}
			
			int C = 0;
			for(int i = 0; i <100; i++) {
					C = C + num[i][i];
			}
			if(C > max) {
				max = C;
		}
		
			int D = 0;
			for(int i = 0; i < 100; i++) {
				D = D + num[i][99 - i];
			}
		if(D > max) {
			max = D;
	}
		System.out.println("#" + t + " " + max);
		

	}
		sc.close();
	}

}