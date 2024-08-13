import java.util.ArrayList;
import java.util.Scanner;

public class Test_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		// 테스트 케이스 입력값을 받을 int T생성
		for(int t = 1; t<=T; t++) {
			// char 값을 받아줄 배열 생성
			char B = 0;
			//String 배열로 5행 1열 2차원배열 생성
			String [][] num = new String[5][1];
			//nestLine을 이용해서 한 단어씩 5개 입력
			for( int i = 0; i < 5; i ++) {
				for(int j = 0; j < 1; j++) {
					num[i][j] = sc.nextLine();
					//5개 행을 고정하고 열을 단어의 갯수만큼 생성하여 
					// 배열 char boom 생성
				for(int p = 0; p < num[5][0].length(); p++) {	
				char[][] boom = new char[5][]; 
				boom[5][p] = (char) num[p][0].length();
				// 세로로 출력
				for( int q = 0; q < 5; q ++) {
					for(int e = 0; e < num[5][0].length(); e++) {
						B = boom[e][q];
					}
					
				}
			}
				}
			}
			System.out.print("#"+t+" "+B);
	}

}
}

