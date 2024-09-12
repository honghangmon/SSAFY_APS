package SWEA_4012_모의_SW_역량테스트_요리사;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	static int[] tmp;
	static int[] sel;
	static int[] sel2;
	static int[] cook = new int[2]; 
	static int[] cook2 = new int[2]; 
	static int[][] com;
	static int N;
	static int R;
	static int ans1;
	static int ans2;
	static int min;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for(int t =1; t<=T; t++) {

			N = sc.nextInt();
			R = N/2;
			com = new int[N][N];
			tmp = new int[N];

			int A = 0;
			int B = 0;

			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					com[i][j] = sc.nextInt();
				}
			}
			for(int i = 0; i < N; i++) {
				tmp[i] = i;
			}
//			System.out.println(Arrays.toString(tmp));
			sel = new int[R];
			sel2 = new int[R];
			
			min = Integer.MAX_VALUE;
			johab(0 , 0);

			System.out.println("#"+t+" "+min);


		}
	}

	public static void johab (int idx , int sidx) {

		if(sidx == R) {
			int mo = 0;
			out :for(int i = 0; i < N; i++) {
				for(int j =0; j < R; j++) {
					if(tmp[i] == sel[j]) {
						continue out;
					}
				}
//				System.out.println(tmp[i]);
				sel2[mo++] = tmp[i];
			}
//			System.out.println("1"+Arrays.toString(sel));
//			System.out.println("2"+Arrays.toString(sel2));
			ans1 = 0;
			ans2 = 0;
			johab2(0 , 0);
			johab3(0 , 0);
			
			min = Math.min(Math.abs(ans1-ans2), min);
			return;
		}

		if(idx == N) {
			return;
		}

		sel[sidx] = tmp[idx];
		johab(idx+1, sidx + 1);
		johab(idx+1, sidx);


	}

	public static void johab2 (int idx , int sidx) {

		if(sidx == 2) {
//			System.out.println(Arrays.toString(cook));
			ans1+=com[cook[0]][cook[1]]+com[cook[1]][cook[0]];
			return;
		}
		if(idx == R) {
			return;
		}

		cook[sidx] = sel[idx];
		johab2(idx+1, sidx +1);
		johab2(idx+1, sidx);
	}

	public static void johab3 (int idx , int sidx) {

		if(sidx == 2) {
//			System.out.println(Arrays.toString(cook2));
			ans2+=com[cook2[0]][cook2[1]]+com[cook2[1]][cook2[0]];
			return;
		}
		if(idx == R) {
			return;
		}

		cook2[sidx] = sel2[idx];
		johab3(idx+1, sidx +1);
		johab3(idx+1, sidx);
	}

}