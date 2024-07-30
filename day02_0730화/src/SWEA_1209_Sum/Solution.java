package SWEA_1209_Sum;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
    Scanner sc = new Scanner(System.in);

    int T = sc.nextInt();
    
    for (int t = 1; t <= T; t++) {
        
        int[][] num = new int[100][100];

    
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        int max = 0;
        int A = 0;
      
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                A += num[i][j];
            }
            if (A > max) {
                max = A;
            }
        }

        int B = 0;
        
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 100; i++) {
                B += num[i][j];
            }
            if (B > max) {
                max = B;
            }
        }

      
        int C = 0;
        
        for (int i = 0; i < 100; i++) {
            C += num[i][i];
        }
        if (C > max) {
            max = C;
        }

      
        int D = 0;
        
        for (int i = 0; i < 100; i++) {
            D += num[i][99 - i];
        }
        if (D > max) {
            max = D;
        }

        // 결과 출력
        System.out.println("#" + t + " " + max);
    }

    sc.close();
}

}
