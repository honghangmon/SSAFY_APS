package 순열구현실습;

import java.util.Arrays;
import java.util.Scanner;

public class N앤M {

		static int N;
		static int M;
		static int[] num;
		static int[] iop;
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		num = new int[N];
		iop = new int[M];
		
		for(int i = 0; i < N; i++) {
			num[i] = i+1;
		}
		
		sel(0);
	}
	
	static void sel(int idx) {
		if(idx == N) {
			System.out.println(Arrays.toString(num));
			return;
		}
		
		for(int i = idx; i < N; i++) {
			swap(i , idx);
			sel(idx + 1);
			swap(i , idx);
		}
		
	}
	static void swap(int a , int b) {
		int tmp = num[a];
		num[a] = num[b];
		num[b] = tmp;
	}

}
