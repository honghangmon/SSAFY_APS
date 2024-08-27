package SWEA_3499_퍼펙트셔플;

import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			
			int N = sc.nextInt();
			
			String[] card = new String[N];
			Queue<String> fr = new LinkedList<>();
			Queue<String> se = new LinkedList<>();
			String[] suffle = new String[N];
			
			
			for(int i = 0; i<N; i++) {
				card[i] = sc.next();
			}
			
			int mid = (N+1)/2;
			for(int i = 0; i < mid; i++) {
				fr.add(card[i]);
			}
			for(int i = mid; i < N; i++) {
				se.add(card[i]);
			}
			for(int i = 0; i < N; i++) {
				if(i%2 == 0) {
					suffle[i] = fr.poll();
				}
				if(i%2 != 0) {
					suffle[i] = se.poll();
				}
			}
			System.out.print("#"+t+" ");
			for(int i = 0; i < N; i++) {
			System.out.print(suffle[i]+" ");
		}
			System.out.println();
		
	}
}
}
