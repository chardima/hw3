public class Node{


	private Node next; 
	private Element data;
		

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
		if(this.data != null){
			return this.data;
		} else {
			return null; 
		} 
	}

	public void setData(Element ele){
		this.data = ele; 

	}


}
