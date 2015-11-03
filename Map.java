class Map {
	public LinkedList seq; 
	public int length;
	public Map(){
		this.seq = new LinkedList();
		this.length = 0;		
	}

	//need to  change by actually checking and putting it in order
	public void add(Pair inval){
		/*
		int counter = 0;
		Node curr = this.seq.getNode(0);//get first node
		char curr_key; //= ((MyChar) curr.getData()).Get(); //get current key
		char key = ((MyChar) inval.getKey()).Get();//get key for value to add
		//if key is less than check or equal then we have the proper counter and curr node to insert at  
		while(curr != null && length > 0){// ||  key <= check){
			curr = curr.getNext();//move curr
			if(curr.getData() != null)//fetch new current key 
				curr_key = ((Pair)curr.getData()).getKey().Get();//fetch new current key 
			System.out.println(counter);
			counter++;
		}
		Node n  = new Node(inval); 
		System.out.println("adding at index " + counter);
		this.seq.add(n, counter);
		this.length++;*/
		
		Node n = new Node(inval);
		this.seq.add(n, this.length+1);
		System.out.print("adding at index " + this.length + " pair:" + inval.getKey().Get() + " ");
		inval.value.Print();
		System.out.println();
		length++;

	}

	public MapIterator find(MyChar key){
		MapIterator itr = this.begin();
		char k = key.Get();
		while(itr != null){
			char check = (((MyChar)itr.get()).Get());
			if(k == check){
				return itr;
			}
			itr = itr.advance(); 
		}
		return itr; 
	}

	public void Print(){
		MapIterator it;
		for(it = this.begin(); !it.equals(this.end()); it.advance()){
			((Element)it.get()).Print();
		}
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
