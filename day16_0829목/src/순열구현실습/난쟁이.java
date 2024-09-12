package 순열구현실습;

import java.util.Arrays;
import java.util.Scanner;

public class 난쟁이 {

	static int[] nan;
	static int[] real;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		nan = new int[9];
		real = new int[7];

		for(int i = 0; i < 9; i++) {
			nan[i] = sc.nextInt();
		}

		arr(0 , 0);

	}
	static void arr(int idx, int sidx) {
		if(sidx == 7) {
			int hab = 0;
			for(int i = 0; i < 7; i ++) {
				hab += real[i];
			}
				if(hab == 100) {				
					Arrays.sort(real);
					for(int j = 0; j < 7; j++) {
						System.out.println(real[j]);
					}
					System.exit(0);
				}
				return;
			}
		if(idx == 9) {
			return;
		}

		real[sidx] = nan[idx];
		arr(idx + 1, sidx +1);
		arr(idx + 1, sidx);

	}
}
