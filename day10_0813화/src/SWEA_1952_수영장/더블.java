package SWEA_1952_수영장;

class Node {
	String data;
	Node pre;
	Node next;
}

class DLinkedList {
	Node head;
	Node tail;
	int size;
	
	DLinkedList() {
		head = new Node();
		tail = new Node();
		head.next = tail;
		tail.pre = head;
	}
	
	void addData(int i , String data) {
		if( i < 0 || i > size) {
			System.out.println("삽입할 수 없는 범위입니다.");
			return;
		}
		size++;
		
		Node newNode = new Node();
		newNode.data = data;

		Node curr = head;
		
		for (int k = 0; k < i; k++) {
				curr = curr.next;
		}
		
		
		newNode.next = curr.next;
		newNode.pre = curr;
		
		curr.next.pre = newNode;
		curr.next = newNode;
	}
	void removeData(int i) {
		
		if (i < 0 || i >= size) {
			System.out.println("삭제 할 수 없는 범위입니다.");
			return;
		}
		
		size--;
		
		Node rmNode = head.next;
		
		for (int k = 0; k < i; k++) {
			rmNode = rmNode.next;
		}
		
		rmNode.pre.next = rmNode.next;
		rmNode.next.pre = rmNode.pre;
	}
	
	void printReverse() {
		Node curr = tail.pre;
//		String str = "";
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.pre;
		}
		System.out.println();
	}
}

public class 더블 {

	public static void main(String[] args) {
		DLinkedList list = new DLinkedList();

		list.addData(0, "대전 4반 김혜준");
		list.addData(0, "서울 5반 김지승");
		list.addData(0, "서울 8반 김태연");
		list.addData(0, "서울 8반 최은영");

		list.printReverse();
	}
}
