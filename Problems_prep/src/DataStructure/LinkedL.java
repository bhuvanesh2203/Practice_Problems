package DataStructure;

public class LinkedL {
	private Node head;
	private Node tail;
	private int size;
	public LinkedL() {
		// TODO Auto-generated constructor stub
		this.size=0; 
	}
	
	public void insert(int value) {
		Node node=new Node(value);
		node.next=head;
		head=node;
		if(tail==null) {
			tail=head;
		}
		size+=1;
	}
	
	// get last index before
	public Node getNode(int index) {
        Node tempNode=head;
		for(int i=0;i<index;i++) {
			tempNode=tempNode.next;
		}
		return tempNode;
	}
	
	//delete last before index
	public int deleteLastIndex() {
		
		if(size<=1) {
			return deletefirst();
		}
		int value=tail.value;
		Node secondlast=getNode(size-2);
		tail=secondlast;
		tail.next=null;
		size--;
		return value;
	}

	//delete a particular index
	public  int deleteAIndex(int index) {
		if (index==0) {
			return deletefirst();
		}
		if (index==size-1) {
			return deleteLastIndex();
		}
		
		Node prevNode=getNode(index-1);
		int value=prevNode.next.value;
		prevNode.next=prevNode.next.next;
		return value;
		
	}
	
	
	public int deletefirst() {
		int value=head.value;
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
		return value;
	}
	
	public void insertlast(int value) {
	Node node=new Node(value);
	if(tail==null) {
		insert(value);
		return;
	}
		tail.next=node;
		tail=node;
		size+=1;
	}
	//insert at index using recurssion
	
	public void insertrecurr(int value,int index) {
		head= helprecusion(index, value, head);
	}
	
	// helper method for insert recursion
	private Node helprecusion(int index,int value,Node node) {
		if(index==0) {
			Node node1=new Node(value,node);
			size++;
			return node1;
		}
			node.next=helprecusion(index-1, value, node.next);
			return node;
		
	}
	
	
	// insert at a index 
	public void insertAtIndex(int value,int index) {
		if(head==null) {
			insert(value);
			return;
		}
		if(size==index) {
			insertlast(value);
			return;
		}
		Node tempNode=head;
		for(int i=1;i<index;i++) {
			tempNode=tempNode.next;
			
		}
		Node node=new Node(value,tempNode.next);
		tempNode.next=node;
		size++;
		
	}
	
	public void display() {
	
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.value+"-->>");
			temp=temp.next;
		}
		System.out.println();
		
	}
private class Node{
	
	private int value;
	private Node next;
	
	public Node(int value,Node next) {
		this.value=value;
		this.next=next;
	}
	public Node(int value) {
		this.value=value;
		
	}
}

}

