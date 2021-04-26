package java_code;
import java_code.Node;

public class ReverseLinkedList {
	public static Node reverseLL(Node head) {
		Node temp = null, p = null , q = null;
		temp = head;
		while (temp != null) {
			p = q;
			q = temp;
			temp = q.next;
			q.next = p; 
		}
		return q;
	}
	
	public static void main(String[] args) {
		Node head = new Node(10);
		Node sec = new Node(11);
		Node third = new Node(12);
		
		head.next = sec;
		sec.next = third;
		
		Node reverseHead = ReverseLinkedList.reverseLL(head);
		
		while(reverseHead != null) {
			System.out.println(reverseHead.value);
			reverseHead = reverseHead.next;
		}
	}
}
