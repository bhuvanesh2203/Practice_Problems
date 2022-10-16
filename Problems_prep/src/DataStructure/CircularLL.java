package DataStructure;

public class CircularLL {
	private Node tail;
	private Node heaNode;

	public void insertCyclic(int value) {
		Node node =new Node(value);
		
		if(heaNode==null) {
			heaNode=node;
			tail=node;
			return;
		}
		tail.nextNode=node;
		node.nextNode=heaNode;
		tail=node;
	}
	// delete a node in 
    public void delete(int value) {
    	Node node =heaNode;
    	if(node==null) {
    		return ;
    	}
    	if(node.value==value) {
    		heaNode=heaNode.nextNode;
    		tail.nextNode=heaNode;
    		return;
    	}
    	
    	do {
    		Node n=node.nextNode;
    		if( n.value==value) {
    			node.nextNode=n.nextNode;
    			break;
    		}
    		node=node.nextNode;
			
		} while (node!=heaNode);
    }
	public void display() {
		Node tempNode=heaNode;
		if(heaNode!=null) {
			do {
				System.out.print(tempNode.value+"->");
				tempNode=tempNode.nextNode;
			} while (tempNode!=heaNode);
			System.out.println();
		}
		
	}
	private class Node {
		private	int value;
		private	Node nextNode;
		private Node(int value,Node nextNode) {
			this.value=value;
			this.nextNode=nextNode;
		}
		private Node(int value) {
			this.value=value;
			
		}
		
		
	}
}
