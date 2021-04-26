package java_code;


public class Node {
	
	public static final String s = "aaaaaaa";
	
	int value;
	Node next;
	
	public Node (int v) {
		this.value = v;
		this.next = null;
	}
	
	protected void printNode() {
		System.out.println(this.value);
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public void setNext(Node n) {
		this.next = n;
	}
}