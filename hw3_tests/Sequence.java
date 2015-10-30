public class Sequence extends Element{

	private LinkedList seq; 
	public int length;

	public Sequence(){
		seq =  new LinkedList(); 
		length = 0;
	}

	public Sequence(Node n){
		seq  = new LinkedList(n); 
		length = seq.length(); 

	}
	
	public void Print(){
		System.out.print("[ "); 
		int counter = 0;  
		Node curr = this.seq.getNode(1);//getNode as part of the linked list actually follows the position, sequence shift by 1   
		while(curr != null){
			//go down and print every element 
			//this.seq.get(counter).Print();
			curr.getData().Print();  
			System.out.print(" ");
			curr = curr.getNext();
			counter++;
			//System.out.println("While Loop Ends");  
			
		}
		System.out.print("]");
		//this.length = counter; 
	
	} 

	public Element first(){
		
		return this.seq.get(0);
		
		
	} 
	
	
	public Sequence rest(){
		Sequence ref = new Sequence(this.seq.getNode(1)); 
		return  ref; 
	}
	
	public int length(){
		
		int counter = 0;  
		Node curr = this.seq.getNode(1);//getNode as part of the linked list actually follows the position, sequence shift by 1   
		while(curr != null){
			//go down and print every element 
			//this.seq.get(counter).Print();
			//curr.getData().Print();  
			//System.out.print(" ");
			curr = curr.getNext();
			counter++;
			//System.out.println("While Loop Ends");  
			
		}
		this.length = counter;
		return this.length; 
	
	}
	
	public void add(Element ele, int pos){
		//check if within bounds, length() is number of objects and positions start at 0	
		if(pos < 0 || pos > this.length()){
			System.err.println("Position Does Not Exist "+Integer.toString(pos));
			System.exit(1); 
	
		}	
		else if(pos >= 0 && pos <= this.length()){
				pos++;
				this.seq.add(ele, pos);
				length++; 
		}
		
		
		
	}
	
	public void delete(int pos){
		pos++;
		this.seq.remove(pos);
		length--; 
		
	}
	
	public Element index(int pos){
		if (pos < 0 || pos >= this.length()){
			System.err.println("Position is out of boundary");
			System.exit(1);
		}
		else
			
	}

	public Sequence flatten(){

	}

	public Sequence copy(){
		Sequence copy = new Sequence(); 
		Node curr = this.seq.head;	
		int counter = 0;  
		while(curr.getNext() != null){
			Node tmp = curr; 
			copy.add(counter, cur);  			
			counter++;
			curr = curr.getNext()
		}
	
		return copy
	}
	
}
