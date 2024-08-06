package Stack1;

import java.util.ArrayList;
import java.util.List;

class Stack {
	private List<Integer> pipe = new ArrayList<Integer>(); 
	private int top = -1;

	public void push(int a) {
		pipe.add(a);
		top++;
	}
	public int pop() {
		if(!isEmpty()) {
			int i = pipe.get(top);
			pipe.remove(top);
			top--;
			return i;
		}
		return Integer.MIN_VALUE;
	}
	
	public int peek() {
		return pipe.get(top);
	}
	public boolean isEmpty() {
		return (top == -1);
	}
}