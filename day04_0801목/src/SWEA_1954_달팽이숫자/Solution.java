package SWEA_1954_달팽이숫자 ;


import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t = 0; t < T; t++) {
			int N = sc.nextInt();
			
			//달팽이 배열
			int[][] snail = new int[N][N];
			
			
			//방향 설정 (오른쪽, 아래, 왼쪽. 위)
			int[] di = {0, 1, 0, -1};
			int[] dj = {1, 0, -1, 0};
			int Z = 0; 
			
			int x = 0;  //시작 위치  
			int y = 0;
			
			for(int i = 1; i <= N*N; i++) {
				snail[x][y] = i;
				// 다음 위치 계산
                int nx = x + di[Z];
                int ny = y + dj[Z];

                // 다음 위치가 배열 범위를 벗어나거나 이미 채워져 있으면 방향 전환
                if (nx < 0 || nx >= N || ny < 0 || ny >= N || snail[nx][ny] != 0) {
                    Z = (Z + 1) % 4; // 방향 전환
                    nx = x + di[Z];
                    ny = y + dj[Z];
                }

                // 위치 업데이트
                x = nx;
                y = ny;
            }

            // 결과 출력
            System.out.println("#" + t);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(snail[i][j] + " ");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}