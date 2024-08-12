package SWEA_1289_원재의_메모리_복구;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		//테스트 케이스 입력 
		for(int t = 1; t <= T; t++) {
			//memo에 입력값을 받고 jo에 조작횟수 저장
			String memo = sc.next();
			int jo = 0;
			char now= '0';
			
			for(int i = 0; i < memo.length(); i++) {
				if(memo.charAt(i) != now) {
					jo++;
					now = memo.charAt(i);
					System.out.println(jo);
				}
			}
			System.out.println("#"+t+" "+jo);
		}
	}

}