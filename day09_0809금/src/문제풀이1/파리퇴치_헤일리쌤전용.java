package 문제풀이1;

import java.util.Scanner;
//설계
//N값을 받아서 N * N 행렬을 생성 후 
//입력값을 받아온다.
//(0,0)부터 (N-M,N-M)까지 기준으로 잡고 M*M 크기만큼 
//파리의 숫자를 더한 값이 가장 큰 수가 나올때 까지 비교후 출력 (3분)
//풀이 시간 (45분) 이전에 몇번 풀어봤던 문제라 금방 풀줄 알았는데 생각보다 오래 걸렸음.
//뒤쳐지는 제자 한땀한땀 돌봐주시는 헤일리쌤 감사합니다.
public class 파리퇴치_헤일리쌤전용 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 1; t<=T; t++) {
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int[][] num = new int[N][N];
			//max값을 출력할 수 있도록 이 위치에서 max값 선언
			int max = 0;
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					num[i][j] = sc.nextInt();
					//num[N][N]안에 값을 입력
				}//풀다가 생각해보니 N-M+1까지 조사해야 완벽히 조사가 가능
				for(int p= 0; p<N-M+1; p++) {
					for(int q=0;q<N-M+1;q++) {
						int hab = 0;// M*M의 안의 숫자를 더한 값을 여기서 초기화 해줘야 비교가 가능
						for(int di = 0; di < M; di++) {
							for(int dj = 0; dj < M; dj++) {
						hab += num[di+p][dj+q]; // hab안에 M*M안의 숫자들을 더한 값을 저장
							}
							if(max < hab) {//이후 hab이 max보다 크다면 max를 최신화
								max = hab;
							}
						}
					}
				}
	}
			System.out.println("#"+t+" "+max);
}
	}
}
