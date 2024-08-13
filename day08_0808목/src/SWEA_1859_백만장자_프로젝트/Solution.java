package SWEA_1859_백만장자_프로젝트;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		// 테스트 케이스 수만큼 받기
		for(int t = 1; t <= T; t++) {
				int N = sc.nextInt();
				//배열의 크기 받기, N 크기의 배열 생성
				int[] price = new int[N];
				// 최대값을 받아줄 변수 생성
				// 최종 수익을 받아줄 변수 생성
				int max = 0;
				long total =0;
				// 가격을 입력값으로 받음.
				for(int i = 0; i < N; i++){
				 price[i] = sc.nextInt();
				}// 역순으로 가장 큰 값이 나올 때 마다 최대값 갱신 
				//최대값보다 작은 수를 만나면 최대값에서 그 수를 뺀 후 수익에 더함
				for(int i = N -1; i >= 0; i--) {
					if(max < price[i]) {
						max = price[i];
					}
						else if(max > price[i]) {
						total = total +	max - price[i];
						}
					}
				// 역순으로 가는 것이 핵심!!
				System.out.println("#" + t + " "+total);
	}
		sc.close();
	}
	}