package SWEA_1222_계산기1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t = 1; t <= 10; t++) {
		
		int N = sc.nextInt();
		ArrayList<Character> M = new ArrayList<>();
		Stack<Integer> L = new Stack<>();
		
		String B = sc.next();
		
		for(int i = 0; i < N; i++) { 
			char V = B.charAt(i);
			if(i == 1) {
				continue;
			}
				M.add(V);
		}
		M.add('+');
		
		for(int i = 0; i < M.size(); i++) {
			if(M.get(i)== '+') {
				int A = L.pop();
				int I = L.pop();
				L.push(A+I);
			}else {
				L.push(M.get(i)-'0');
			}
		}
		int P = L.pop();
		System.out.println("#"+t+" "+P);
		}
	}
}