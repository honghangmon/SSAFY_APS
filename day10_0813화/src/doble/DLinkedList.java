package doble;

import java.util.Queue;
import java.util.LinkedList;

class Node {
	 String data;
	 Node pre;
	 Node next;
 }

class DoblyLinkedList {
	Node head;
	Node tail;
	int size;
	
	public DoblyLinkedList() { 
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
		//이렇게 되면 모든 삽입 연산은 중간삽입연산
	}
	
	void addData(int i, String data) {
		// 0이면 제일 앞에 삽입
		// size면 제일 뒤에 삽입
		if (i < 0 || i > size) {
			System.out.println("삽입할 수 없는 범위입니다.");
			return;
		}
		size++;
		 
		//새 노드 만들어주기 
		Node newNode = new Node();
		newNode.data = data;
		
		//삽입 위치 앞의 노드를 찾는다.
		Node curr = head;
		
		for (int k = 0; k< i; k++) {
			curr = curr.next;
		}
		
		
		//새 노드 연결해주기
		newNode.next = curr.next;
		newNode.pre = curr;
		
		
		//기존 노드 연결 재구성
		curr.next.pre = newNode;
		curr.next = newNode;	
	}
	
	void removeData(int i) {
		// 0은 제일 앞의 데이터 삭제
		// size - 1 제일 뒤의 데이터 삭제
		
		if(i < 0 || i >= size) {
			System.out.println("삭제할 수 없는 ㅇ범위 입니다.");
			return;
		}
		size--;
		
		//삭제할 위치를 찾기
		//rmNode는 지역변수이므로 메서드 리턴과 동시에 접근 불가 
		Node rmNode = head.next;
		
		for (int k = 0; k < i; k++) {
			rmNode = rmNode.next;
		}
		
		rmNode.pre.next = rmNode.next;
		rmNode.next.pre = rmNode.pre; 
	}
	
	void printReverseAll() {
			Node curr = tail.pre;
			//String str = "";
			while(curr != head) {
				System.out.println("<-" + curr.data);
				//str = "<-" + curr.data +str;
				curr = curr.pre;
			}
			//System.out.println(str);
	}
}
 
public class DLinkedList {
	public static void main(String[] args) {
		DLinkedList list = new DLinkedList();
		
		
	
}
}
