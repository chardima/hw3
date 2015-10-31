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
		int counter = 1;  
		Node curr = this.seq.getNode(counter);//getNode as part of the linked list actually follows the position, sequence shift by 1   
		while(curr != null){
			//go down and print every element 
			//this.seq.get(counter).Print();
			curr.getData().Print();  
			System.out.print(" ");
			curr = curr.getNext();
			//System.out.println("While Loop Ends");  
			
		}
		System.out.print("]");
	
	} 

	public Element first(){
		
		return this.seq.get(0);
		
		
	} 
	
	
	public Sequence rest(){
		Sequence ref = new Sequence(this.seq.getNode(1)); 
		return  ref; 
	}
	
	public int length(){
		
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
		if(pos < 0 || pos >= this.length){
			System.err.println("Position is out of boundary");
			System.exit(1);	
		}
						
		return this.seq.get(pos);
		
	}	

         public Sequence flatten(){
                Sequence newSeq = new Sequence();
                int i = 0;
                Node current = this.seq.getNode(0);

                while(current.getNext() != null){
                        if (current.getData() instanceof MyInteger || current.getData() instanceof MyChar){
                                Node newNode = new Node(current.getData());
                                newSeq.seq.add(newNode, i);
                                newSeq.length++;
                                i++;
                        }
                        else{ //its a sequence
                                Sequence deeper = this.seq.get(i).seq.flatten(); //recursively flatten new arising sequences
                                while(deeper.seq.getNode(counter) != null) //add new flattened elements to the upper level of flatten
                                {
                                        Node newNode = new Node(deeper.seq.getNode(i).getData);
                                        newSeq.seq.add(newNode, i);
                                        newSeq.length++;
                                        i++;
                                }

                        }
			current = current.getNext();
                }

                return newSeq; //need this for now
        }

	

	public Sequence copy(){ //produces deep copy of elements
		Sequence newSeq = new Sequence(); //our new copy
		newSeq.length++;
		int i = 0; //used to iterate thru
		Node current = this.seq.getNode(0);
		//System.out.println(current.getData());
		//idea is to iterate thru the sequence and recursively copy stuff when needed. this function needs to be recursive
		while(current.getNext() != null){
			//System.out.println(current.getData());
			if (current.getData() instanceof MyInteger){
				Node newNode = new Node(current.getData()); 
				newSeq.seq.add(newNode, i);
				newSeq.length++;	
				i++;
			}
			else if (current.getData() instanceof MyChar){
                                 Node newNode = new Node(current.getData());		
				newSeq.seq.add(newNode, i);
				newSeq.length++;
				i++;
			}
			current = current.getNext();
		}
	return newSeq;
	}	
}
