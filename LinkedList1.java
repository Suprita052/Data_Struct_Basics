package DATASTRUCT;



public class LinkedList1 {
	
	public Node head = null ;
	public Node tail = null ; 
	static class Node {
		int data ;
		Node next;
		 Node (int d){
			data = d;
			next = null;
		}
	}
	
	
	
	public void pushfront(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
		if(tail == null) {
			tail = head;
		}
		
	}
	
	
	
	public void popfront() {
		if (head == null) {
			System.out.println("no element to pop");
			return;
		}
		else if(head == tail) {
			head = null;
			tail = null;
			return;
		}
		Node newnode = head;
		System.out.println("key is "+newnode.data);
		head = head.next;
		
	}
	
	
	
	public void pushback(int data) {
		Node newnode = new Node(data);
		if(tail == null) {
			head = newnode;
			tail = newnode;
			return;
		}
		tail.next = newnode;
		tail = newnode;
		
	}
	
	
	
	
	public void popback() {
		if(head == null) {
			System.out.println("No elements to remove");
			return;
		}
		else if (head == tail) {
			head = null;
			tail = null;
			return;
		}
		Node newnode = head;
		while(newnode.next.next!=null) {
			newnode = newnode.next;
		}
		newnode.next = null;
		tail = newnode;
		
		
	}
	
	public void display() {
		Node curr = head;
		while(curr.next != null)
			{
			System.out.println(curr.data);
			curr = curr.next;
			}
		System.out.println(curr.data);
		
	}
	
	public void addafter( Node n, int value , Node first , Node last) {
		Node newnode = new Node(value);
		newnode.next = n.next;
		n.next = newnode;
	}
	
	public void display(Node first) {
		Node curr = first;
		while(curr.next != null)
			{
			System.out.println(curr.data);
			curr = curr.next;
			}
		System.out.println(curr.data);
	}
	
	public static void main(String[] args) 
    { 
        /* Start with the empty list. */
		LinkedList1  list1 = new LinkedList1 ();
        Node first = new Node(9);
        Node second = new Node(6);
        Node third = new Node(5);
        first.next = second;
        second.next = third;
        list1.pushfront(4);
        list1.pushfront(7);
        list1.pushfront(9);
        list1.popback();
        
        list1.display();
        list1.addafter(second, 10, first, third);
        list1.display(first);
    }
}
