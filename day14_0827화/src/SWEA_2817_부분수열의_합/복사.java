package SWEA_2817_부분수열의_합;

public class 복사 {
	static String[] 재료 = {"단무지","햄","오이","시금치"};
	static int N;
	static boolean[] sel;
	
	public static void main(String[] args) {
		N = 4;
		sel = new boolean[N];
		
		powerset(0);
	}
	public static void powerset(int idx) {
		if(idx == N) {
			String tmp = "김밥: ";
			for(int i = 0; i < N; i++) {
				if(sel[i]) {
					tmp += 재료[i];
				}
			}
				System.out.println(tmp);
				return;
			}
			
		sel[idx] = true;
		powerset(idx + 1);
		
		sel[idx] = false;
		powerset(idx + 1);
		}
	}

