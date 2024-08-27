package SWEA_1230_암호문3;

class Node {
	String data;
	Node link;
}

class SLinkedList {
	Node head;
	int size;
	
	SLinkedList(){
		head = new Node();
	}
	
	void addData(int i, String data) {
		
		if( 0 > i || i > size) {
			System.out.println("삽입할 위치가 잘못 되었습니다.");
			return;
		}
		size++;
		
		Node newNode = new Node();
		newNode.data = data;
		
		Node curr = head;
		for(int k = 0; k < i; k++) {
			curr = curr.link;
		}
		
		newNode.link = curr.link;
		curr.link = newNode;
	}
	
	void removeData(int i) {
		
		if(0 > i || i >= size) {
			System.out.println("삭제할 수 없는 범위입니다.");
			return;
		}
		
		size--;
		
		Node curr = head;
		
		for(int k = 0; k < i; k++) {
				curr = curr.link;
		}
		
		curr.link = curr.link.link;
	}
	
	void printAll() {
		Node curr = head.link;
		
		while (curr != null) {
			System.out.print(curr.data + " -> ");
			curr = curr.link;
		}
		System.out.println();
	}
}
public class 싱글 {
	public static void main(String[] args) {
		SLinkedList list = new SLinkedList();
		
		list.addData(0, "서울 8반 소남주");
		list.printAll();
		list.addData(0, "서울 8반 방승윤");
		list.addData(0, "서울 8반 김민지");
		list.printAll();
		list.addData(0, "대전 3반 최현만");
		list.addData(0, "서울 6반 김서현");
		list.addData(0, "서울 5반 장다은");
		list.addData(0, "서울 6반 오승원");
		list.printAll();
	}
}

