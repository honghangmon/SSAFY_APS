package SW역량테스트;

import java.util.Scanner;

public class Solution {

	static int D , M , Three, Y;
	static int[] plan;
	static int min;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			D = sc.nextInt();
			M = sc.nextInt();
			Three = sc.nextInt();
			Y = sc.nextInt();
			
			plan = new int[12];
			for(int i = 0; i < 12; i++) {
				plan[i] = sc.nextInt();
			}
			
			min = Y;
			
			jagui(0, 0);
			
			System.out.println("#"+t+" "+min);
		}
	}
	
	static void jagui(int Midx , int price) {
		 System.out.println("Month: " + Midx + ", Current Cost: " + price);
	
		if(Midx >= 12) {
			if(price < min) {
				min = price;
			}
			return;
		}
		
		if(price >= min) {
			return;
		}
		
		if(plan[Midx] == 0) {
			jagui(Midx+1, price);
		} else {
			
//			int costDay = price + plan[Midx] * D;
			jagui(Midx+1 , price + plan[Midx] * D);
			
//			int costMonth = price + M;
			jagui(Midx+1, price + M);
			
			if(Midx <= 12) {
//				int costThree = price + Three;
			jagui(Midx+3, price + Three);
			
		
	}
}
	}
}
