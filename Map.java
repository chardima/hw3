class Map extends Sequence{

	public Map(){
		this.seq = new LinkedList();
		this.length = 0;		
	}

	//need to  change by actually checking and putting it in order
	public void add(Pair inval){
		int counter = 0;
		Node curr = this.seq.getNode(0);
		char check = ((MyChar) curr.getData()).Get(); 
		char key = ((MyChar) inval.getKey()).Get();
		//if key is less than check or equal then we have the proper counter and curr node to insert at  
		while(curr != null ||  key <= check){
			check = ((MyChar) curr.getData()).Get(); 
			curr = curr.getNext();
			counter++;
			
		}
		Node n  = new Node(inval); 
		this.seq.add(n, counter);
		length++;

	}

	public MapIterator find(MyChar key){
		
	}

	public MapIterator begin(){
		MapIterator beg = new MapIterator(this.seq.getNode(1));
		return beg;
	}

	public MapIterator end(){
		MapIterator end = new MapIterator(this.seq.getNode(this.seq.length()+1).getNext());
		return end;
	}



}
