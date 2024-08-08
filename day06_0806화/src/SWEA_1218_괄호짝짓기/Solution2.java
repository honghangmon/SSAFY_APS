package SWEA_1218_괄호짝짓기;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack line = new Stack();
		
		for( int t = 1; t <=10; t++) {
			int C = sc.nextInt();
			String A = sc.next();
			
			for(int i = 0; i < A.length(); i++) {
				char B = A.charAt(i);
				
				if(B == '{'||B == '('||B =='['||B=='<') {
					line.push(B);
				} else {
					line.pop();
				}
				}
			if(!line.isEmpty()) {
				System.out.println("#"+t+" "+0);
			}else {
				System.out.println("#"+t+" "+1);
			}
		}
	}

}