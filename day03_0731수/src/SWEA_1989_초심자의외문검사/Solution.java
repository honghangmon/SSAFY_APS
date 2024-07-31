package SWEA_1989_초심자의외문검사;


import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			
		String str = sc.next();
		
		int S = str.length();
		int O = 1;
		
		for(int i = 0; i < S/2; i++ ) {
			if(str.charAt(i) != str.charAt(S-i-1)){
				O = 0;
				break;
			}
		}
		System.out.println("#"+ t+" "+O);
	}
		
		
}
}

