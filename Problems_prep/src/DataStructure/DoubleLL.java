package DataStructure;

public class DoubleLL {
	private int size;
	private Node headNode;
	private Node tailNode;
	public DoubleLL() {
		// TODO Auto-generated constructor stub
		this.size=0; 
	}
	
	
	public void insertFirstDLL(int value) {
		Node node =new Node(value);
		node.nextNode=headNode;
		node.preNode=null;
		if(headNode!=null) {
			headNode.preNode=node;
		}
		
		
		
		headNode=node;
		if(tailNode==null) {
			tailNode=headNode;
			System.out.println("tail:"+tailNode.value);
		}
		size++;
	}
	public void insertLast(int value) {
		Node node =new Node(value);
		if(headNode==null) {
			insertFirstDLL(value);
		}
		
		
		tailNode.nextNode=node;
		node.nextNode=null;
		node.preNode=tailNode;
		tailNode=node;
		size++;
		
	}
	public void display() {
		Node lastNode = null;
		Node tempNode=headNode;
		while(tempNode!=null) {
			System.out.print(tempNode.value+"--->");
			lastNode=tempNode;
			tempNode=tempNode.nextNode;
		}
		System.out.print("End");
	//	System.out.println("print in reverse");
	//	tempNode=lastNode;
	//	while(tempNode!=null) {
//			System.out.print(tempNode.value+"-->");
	//		tempNode=tempNode.preNode;
	//	}
	//	System.out.print("end");
		
	}
	
	public Node get(int value) {
		Node tempNode= headNode;
		while(tempNode!=null) {
			if(tempNode.value==value) {
				return tempNode;
			}
			tempNode=tempNode.nextNode;
		}
		return null;
	}
	
	//method to insert after a index
	public void insertAfterIndex(int afterValue,int value) {
		Node pNode=get(afterValue);
		
		if(pNode==null) {
			return;
		}
		Node node =new Node(value);
		
		node.preNode=pNode;
		node.nextNode=pNode.nextNode;
		pNode.nextNode=node;
		
		if (node.nextNode!=null) {
			node.nextNode.preNode=node;
		}
		
		
		
	}
	
	private class Node {
		private int value;
		private Node nextNode;
		private Node preNode;
		
		private  Node(int value) {
			// TODO Auto-generated constructor stub
			this.value=value;
		}
		private  Node(Node nextNode,int value) {
			// TODO Auto-generated constructor stub
			this.nextNode=nextNode;
			this.value=value;
		}
		private  Node(Node nextNode,Node preNode, int value) {
			// TODO Auto-generated constructor stub
			this.preNode=preNode;
			this.nextNode=nextNode;
			this.value=value;
		}
	}
	
}

