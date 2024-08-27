package SWEA_4012_요리사;

import java.util.Scanner;

//설계 
//N*N행렬의 배열을 생성
//(i,j)를 중심으로 상하좌우를 합한값을 저장.
//모든 칸을 탐색
//(0,i)배열과 (j,0)배열은 어차피 최댓값이 나올 수 없기 때문에
//탐색할 필요없음.
//for문을 이용하여, 모든 점을 탐색함. 점마다 자신을 중심으로 가지게 되는 십자모양의 합을 더함.
//HOW? dx, dy를 설정하여서.(20분)
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
        System.out.println("N: " + N); 
		int[][] apple = new int[N][N];
	//상 하 좌 우의 위치를 이동하기 위한 배열 dx, dy 생성	
		int[] dx= {-1,0,1,0};
		int[] dy= {0,1,0,-1};
		//사과나무밭 배열 입력값 받기
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				apple[i][j] = sc.nextInt();
			}
		}
		 System.out.println("Array input completed");
		int max = 0;
		for(int i = 1; i < N -1; i++) {
			for(int j = 1; j < N -1; j++) {
				int hab = apple[i][j]; // 중간 밭의 영양분  
				for(int di = 0; di < 4; di++) {
						hab += apple[i+dx[di]][j+dy[di]]; //중간 밭을 기점으로 상,하,좌,우 더하기
					}
				//max값 비교
				if(max < hab) {
					max = hab;
				}
			}
			}
		System.out.print(max);
	}

}
//
//5
//N: 5
//1 1 1 1 1
//1 1 1 2 2
//1 1 1 2 1
//1 9 1 1 1
//1 1 1 1 1  이렇게 입력하면 답이 나오고
//5
//11111
//11122
//11121
//19111
//11111 이렇게 입력하면 답이 안나오는데 한참뒤에야 숫자를 1 1 1이 아닌 111으로 인식한다는 걸 깨달았습니다.
// 근데 이런 경우는 입력값을 임의대로 숫자로 입력해도 되는 것인지 
//문제에서 요구한대로 입력값을 저렇게 받고 문자열로 만든 뒤에 뛰어쓰기를 하고 
//다시 숫자로 바꿔야하는건지 잘 모르겠습니다.