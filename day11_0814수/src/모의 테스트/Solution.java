package 연결_스택_구현;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//테스트 케이스 값 받아오기
		int T = sc.nextInt();
		
		for(int t = 1; t <= T; t++) {
			Queue<Character> Bi = new LinkedList<>();
			//N값과 K값 받아오기
			int N = sc.nextInt();
			int K = sc.nextInt();
			char H = 0; // Queue의 첫 번째 값을 받아서 제일 뒤로 옮길 H생성
	// N/4개씩 끊어서 받을 String 배열 생성
			String[] dab = new String[N/4];
			
			//String으로 비밀번호를 받아서 char A로 변환
			String B = sc.next();
			char[] A = new char[N];
			
			for(int i= 0; i < N; i++) {
				A[i] = B.charAt(i);
			}
			//Queue에 char A값을 순서대로 offer
			for(int i = 0; i < N; i++) {
				Bi.offer(A[i]);
			}
			//여기서 어떻게든 N/4개의 단어를 4개씩 가지고 있는 배열을 만들고 
			//(단어는 무조건 N/4길이를 가지고 한번 전환할때마다 4개씩 나오기 때문)
			//이걸 N/4번 반복하면 첫번 째 배열로 돌아오기때문에 N/4번 반복.
			int dx = N/4;
			for(int q = 0; q < 4; q++) {
				for(int dj = 0; dj < 4; dj++) {
				for(int p = 0; p < dx; p++) {
					dab[q] = B.charAt(p+(dx*dj);
					
				}
			}
			H = Bi.poll();
			Bi.offer(H);
			//H에 Queue Bi의 제일 앞의 값을 제일 뒤로 offer한 후 
			//위의 작업을 반복해서 N/4개로 끊어진 단어들의 배열 생성.
			//배열을 만든 후 Arrays.sort로 정렬 후 K 번째 값을 출력
			//PS. 16진법? 태어나서 처음 들어봅니다 ㅜㅜ 
			
			Arrays.sort();
			
			System.out.print([K-1]);
			
		}
	}
	}

}