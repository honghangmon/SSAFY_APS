package SWEA_2817_부분수열의_합;

import java.util.Arrays;

public class 복사_순열_방문체크 {
	
	static int[] nums;
	static int N;
	static boolean[] visited;
	static int[] result;

	public static void main(String[] args) {
		nums = new int[] { 0, 1, 2 };
		N = nums.length;
		visited = new boolean[N];
		result = new int[N];
		perm(0);
	}
	
	
	static void perm(int idx) {
		
		if (idx == N) {
			System.out.println(Arrays.toString(result));
			return;
		}
		
		for (int i = 0; i < N; i++) {
			
			if (visited[i])
				continue; 
			result[idx] = nums[i];
			visited[i] = true; 
			perm(idx + 1); 
			visited[i] = false; 

		}

	}

}
