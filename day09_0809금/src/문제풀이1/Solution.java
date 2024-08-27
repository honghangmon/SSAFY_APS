package 문제풀이1;

import java.util.Scanner;
import java.util.Arrays;
//설계
//테스트 케이스 수 T를 받아온다.
//sc.nextLine();을 한번 해준다.
//string타입을 선언하고 sc.nextLine()으로 5단어를 한줄 씩 받아온다.
//가변 배열을 이용해서 단어의 길이를 배열의 크기로하는 1차행렬을 5개만들어서
//2차행렬을 만든다. 
//2차 행렬을 만든 후 세로로 읽어서 출력한다. (설계 13분)
//문제 풀이(2시간 40분) 2시간을 넘기지 말라고 하셨지만... 뭔가 조금만 더하면 될꺼같은데 하면서 하다가 
//혜민이랑 정우가 도와줘서 풀었습니다. 도움이 없었다면 훨~~씬 오래걸렸을 것 같습니다.
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		sc.nextLine();
		
		for(int t = 1; t <= T; t++) {
		
		String[][] A = new String[5][1]; // 일차원이어도 됨
		int max = 0;
		char B = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 1; j++) {//없어도 됨
				A[i][j] = sc.nextLine();
				max = Math.max(max, A[i][j].length()); //혜민이가 알려줌!
			}
		}// 처음엔 A[5][1]행렬을 만들고 가변 배열을 설정해서 
		 // num[0] = new char[A[0][0].length()]
		 // num[1] = new char[A[1][0].length()]
		 // num[4] = new char[A[4][0].length()] 로 배열 후 
		// A[i][0]을 for문으로 돌리면서 length의 맥스값을 찾고 
		// num[i] = A[i][0].toCahrArray로 char 배열을 만들고 
		// char배열을 세로로 읽고 빈칸을 만나면 아무것도 출력하지않고 continue하려 했으나, 
		//이렇게 만들면 밑에 max를 활용할 부분에서 [a,b,d, , ,] 이렇게 출력되지않고
		//toCahrArray에 의해 [a,b,d]로 수정되어서 배열이 만들어지기 때문에, 출력에서 오류가 생김
		//math.max를 이용해서 위에서 max값을 만들고 max값을 기반으로 char배열을 생성
		// 그리고 charAt을 이용해서 num배열을 완성
		 
		char[][] num = new char[5][];
		num[0] = new char[max];
		num[1] = new char[max];
		num[2] = new char[max];
		num[3] = new char[max];
		num[4] = new char[max];
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<A[i][0].length(); j++)
				num[i][j] = A[i][0].charAt(j); // 혜민이가 알려줌!
		}
//		System.out.println(Arrays.deepToString(num));
		
		System.out.print("#"+t+" ");  
		for(int i= 0; i < max; i++) { // 이부분이 max를 활용한 부분
			for(int j = 0; j < 5; j++) {//j행은 5줄로 고정하고 i를 max길이까지 순회하면서
				if(num[j][i] == 0) {   //빈칸이 나올 경우 그대로 읽도록 함.
					continue;
				}
//				System.out.println("j: " + j + "i: " + i + "값: " + num[j][i]);
				System.out.print("#"+t+" "+num[j][i]);
			}
		}
		System.out.println();
		}	
	}
}