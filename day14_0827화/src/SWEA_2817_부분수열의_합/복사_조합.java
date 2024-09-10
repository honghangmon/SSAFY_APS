package SWEA_2817_부분수열의_합;

import java.util.Arrays;

public class 복사_조합 {
	
	static String[] 재료 = {"단무지", "햄", "오이", "시금치"};
	static int N = 4; 
	static int[] sel = new int[N]; 
	public static void main(String[] args) {
		
		for(int i = 0; i <=1 ; i++) {
			sel[0] = i;
			for(int j =0; j <= 1; j++) {
				sel[1] = j;
				for(int K = 0; K <=1; K++) {
					sel[2] = K;
					for(int I = 0; I <= 1; I++) {
						sel[3] = I;
						System.out.println(Arrays.toString(sel));
					}
				}
			}
		}
	}
}
