public class Node{


	private Node next; 
	public Element data;
		

	public Node(Element ndata){
		this.next = null;
		this.data = ndata; 	
	} 

	public Node getNext(){
		return this.next; 
	}

	public void setNext(Node nextVal){
		this.next = nextVal;
	}

	public Element getData(){
		return this.data; 
	}

	public void setData(Element ele){
		this.data = ele; 

	}


}
