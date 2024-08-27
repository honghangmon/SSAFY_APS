package SWEA_1224_계산기3;


import java.util.Scanner;
import java.util.Stack;
import java.util.Map;
import java.util.HashMap;


public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			String input = sc.next();
			
			int result = eval(input);
			System.out.println(result);
				
			}
	
	static int eval(String input) {
			String postfix = infixToPostfix(input);
			retrun evalPostfix(postfix);
		}
	
	static Map<Character, Integer> map = new HashMap<>();
	
	static {
			map.put('+', 1);
			map.put('-', 1);
			map.put('*', 2);
			map.put('/', 2);
	}
	
	static String infixToPostfix(String infix) {
			String postfix = "";
			Stack<Character> stack = new Stack<>();
			
			for(int i = 0; i < infix.length(); i++) {
				char c = infix.charAt(i);
				
				if ('0' <= c && c <= '9') {
					postfix += c;
				} else if (c == '(') {
					stack.push(c);
				} else if (c == ')') {
					
					char popitem = stack.pop();
					while (popitem != '(') {
						postfix += popitem;
						popitem = stack.pop();
					}
				} else {
					while (!stack.isEmpty() && stack.peek())
				}
			}
	}

}