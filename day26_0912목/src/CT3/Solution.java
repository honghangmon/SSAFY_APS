package CT3;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	static int[] money = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
	static int N;
	static int[] count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
				N = sc.nextInt();
				
			count = new int [8];
			
			for(int i = 0; i < 8; i++) {
				while( N >= money[i]) {
					N = N - money[i];
					count[i]++;
				}
			}
			
			System.out.println("#" + t);
			for(int i = 0; i < 8; i++) {
				System.out.print(count[i]+" ");
							}
			System.out.println();
			
		}
	}
	

}