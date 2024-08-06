package Stack2;

import java.util.Arrays;
import java.util.List;

public class Stack {
	
	private List<Integer> up = new ArrayList<integer>();
	private int top = -1;
	
	public void push(int a) {
		up.add(a);
		top++;
		
	}
	public int pop() {
		if(!isEmpty()) {
			int i = up.get(top);
			pipe.remove(top);
			top--;
			return i;s
		}
	}
}