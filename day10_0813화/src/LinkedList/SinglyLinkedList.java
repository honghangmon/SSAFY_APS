package LinkedList;

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
	
	// 삽입
	void addData(int i, String data) {
		// i 인덱스에 데이터 삽입
		// 0이면 제일 앞에 추가
		// size와 같으면 제일 뒤에 추가
		//(0> i || i > size)
		if (!(0 <= i && i <= size)) {
			System.out.println("삽입할 위치가 잘못되었습니다.");
			return;
		}
		size++;
		
		Node nN = new Node();
		nN.data = data;
		
		
		// 삽입할 위치 앞에 있는 노드 찾기
		
		Node curr = head;
		for(int k = 0; k < i; k++) {
			curr = curr.link;
		}
		
		//새 노드 부터 연결
		nN.link = curr.link;
		curr.link = nN;
	}
	
	
	// 삭제
	void removeData(int i) {	
		// 0번 : 제일 앞에 있는 데이터 삭제
		// size - 1번 : 마지막 데이터 삭제
		
		if(0 > i || i >= size) {
			System.out.println("삭제할 수 없는 범위 입니다.");
			return;
		}
		
		size--;
		
		// 삭제할 노드의 앞 노드로 이동
		Node curr = head;
		
		for(int k = 0; k < i; k++) {
			curr = curr.link;
		}
		
		curr.link = curr.link.link;
	}
	
	// 조회
	
	void printAll() {
		Node curr = head.link;
		
		while(curr != null) {
			System.out.print(curr.data + "->");
			curr = curr.link;
		}
		System.out.println();
	}
	
}

public class SinglyLinkedList {
	public static void main(String[] args) {
		SLinkedList list = new SLinkedList();
		
		list.addData(0, "이윤준");
		list.printAll();
		list.addData(0, "이하나");
		list.addData(0, "최보성");
		list.printAll();
		list.addData(0, "배현수");
		list.addData(0, "이혜원");
		list.addData(0, "고민서");
		list.addData(0, "김성현");
		list.printAll();
	
		list.printAll();
	}
}