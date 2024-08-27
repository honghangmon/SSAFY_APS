package SWEA_1218_괄호짝짓기;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for( int t = 1; t <=10; t++) {
			Stack<Character> line = new Stack<>();
			int C = sc.nextInt();
			String A = sc.next();
			boolean dab = true;
			
			for(int i = 0; i < A.length(); i++) {
				char B = A.charAt(i);
				//여는괄호라면
				if(B == '(' || B == '[' || B == '<' || B == '{') {
					line.push(B);
				}
				//닫는 괄호라면
				else{
					if(line.isEmpty()) {
						dab = false;
						break;
					}
					char Y = line.pop();
					if(B == ')') {
						if(Y != '(') {
							dab = false;
							break;
						}
					}
					else if(B == ']') {
						if(Y != '[') {
							dab = false;
							break;
						}
					}
					else if(B == '>') {
						if(Y != '<') {
							dab = false;
							break;
						}
					}
					else {
						if(Y != '{') {
							dab = false;
							break;
						}
					}
					
				}
			}
			if(!line.isEmpty())
				dab = false;
			
			if(dab)
				System.out.println("#"+t+" "+1);
			else
				System.out.println("#"+t+" "+0);
		}
	}
}
			
//		for(int i = 0; i < A.length(); i++) {
//			char B = A.charAt(i);
//			//1.여는괄호인지 확인하기
//			//여는괄호라면
//			if(B == '(' || B == '[' || B == '<' || B == '{') {
//				line.push(B);
//			}else if(line.isEmpty()){
//				dab = false;
//				break;
//			}
//			char Y = line.pop();
//			//닫는 괄호라면
//			else if((B == '}' && Y != '{') ||
//			   (B == ']' && Y != '[') ||
//			   (B == '>' && Y != '<') ||
//			   (B == ')' && Y != '(')){
//				dab = false;
//			}
//		}
//		if(dab) {
//			System.out.println("#"+t+" "+1);
//		}else {
//			System.out.println("#"+t+" "+0);
//		}