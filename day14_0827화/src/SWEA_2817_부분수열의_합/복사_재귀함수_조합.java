package SWEA_2817_부분수열의_합;

import java.util.Arrays;

public class 복사_재귀함수_조합 {

	static String[] 재료 = {"상추","패티","토마토","치즈"};
	static int N, R;
	static String[] sel;
	
	public static void main(String[] args) {
		N = 4;
		R = 2;
		sel = new String[R];
		
		com(0 , 0); 
	}
	
	
	public static void com(int idx, int sidx) {
		
		if(sidx == R) {
			
			System.out.println(Arrays.toString(sel));
			return;
		}
		if(idx == N) {
			return;
		}
		
		sel[sidx] = 재료[idx];
		com(idx+1, sidx+1);
		com(idx+1, sidx);
		}

}
