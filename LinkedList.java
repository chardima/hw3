public class LinkedList{


	private Node head; //top of head 
	private int num; // num of elements

	public LinkedList(){
		this.head = new Node(null);
		this.num = 0; 

	}
	public LinkedList(Node n){
		this.head = n;
		int i = 0;
		while(n.getNext() != null){
			n = n.getNext();
			i++;
		}
		this.num = i;

	}
	public Node getNode(int index){
		int i =  0;
		Node curr = this.head;  
		while(curr.getNext() != null && i < index){
			curr = curr.getNext();
			i++;
		}
		return curr;
		
	}

	public void add(Element el){
		this.num++;
		Node temp = new Node(el); 
		Node curr = this.head; 
		while(curr.getNext() != null){
			curr = curr.getNext();
		}
		curr.setNext(temp); 
		
		
	}

	public void  add(Element el, int index){
		Node temp = new Node(el); 
		Node curr = this.head;
		if(index == 0){
			curr.setNext(temp);
		}//setting head
		else{
			//checks the index and the last node in the link 
			for(int i = 1; i < index && curr.getNext() != null; i++){
				curr = curr.getNext(); 
			}
			temp.setNext(curr.getNext());
			curr.setNext(temp);
		}
			this.num++;	
	}
	
	public boolean remove(int index){
		
		if(index < 1 && index > this.num){
			
			return false; 

		}
		Node curr = this.head; 
		for(int i = 1; i < index; i++){
			if(curr.getNext() == null)
				return false;
			curr = curr.getNext();

		}
		curr.setNext((curr.getNext()).getNext());
		this.num--;
		return true;
		
	}



	public int length(){
		return this.num;
	}

	public Element get(int index){
		if(index < 0 ){
			return null; 
		}
		Node curr = this.head.getNext(); 
		for(int i = 1; i < index; i++){
			if(curr.getNext() == null){
				return null;
			}
			curr = curr.getNext();
		}
		return curr.getData();
	}
	public void Print(){
		for(int i = 1; i <= this.length(); i++){
			this.get(i).Print();
			System.out.print(" , ");
		}
		System.out.print("\n");
	}

}
