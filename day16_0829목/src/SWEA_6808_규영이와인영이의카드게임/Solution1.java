package SWEA_6808_규영이와인영이의카드게임;

import java.util.Arrays;
import java.util.Scanner;

public class Solution1 {
	static int[] kyu;
	static int[] in;
	static int kyuwin;
	static int inwin;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			
			kyuwin = 0;
			inwin = 0;
			kyu	= new int[9];
			in	= new int[9];
			boolean[] nums = new boolean [19];
			for(int i = 0; i < 9; i ++) {
				kyu[i] = sc.nextInt();
				nums[kyu[i]] = true;
			}
			
			int idx = 0;
			for(int i = 1; i <= 18; i++) {
				if(!nums[i]) {
					in[idx++] = i;
				}
			}
			
			perm(0);
			
			System.out.println("#"+t+" " + kyuwin+" "+inwin);
		}
	}
	static void dual () {
			int kyuscore = 0;
			int inscore = 0;
			for(int i = 0; i < 9; i++) {
				if(kyu[i] > in[i]) {
					kyuscore += kyu[i] + in[i];
				}else {
					inscore += kyu[i] + in[i];
				}
			}
			if(kyuscore > inscore) {
				kyuwin++;
			}else if(kyuscore < inscore){
				inwin++;
			}
		}
	
	static void perm(int idx) {
		if(idx == 9) {
			dual();
			return;
		}
		
		for(int i = idx; i < 9; i++) {
			swap(i , idx);
			perm(idx + 1);
			swap(i , idx);
		}
	}
	static void swap(int b , int c) {
		int tmp = in[b];
		in[b] = in[c];
		in[c] = tmp;
	}
}
