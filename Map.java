class Map extends Sequence{



	public Map(){
		this.seq = new LinkedList();
		this.length = 0;		
	}

	//need to  change by actually checking and putting it in order
	public void add(Pair inval){
		Node cur = this.seq.get(0);	
		Node n  = new Node(inval); 
		this.seq.add(n, this.length);
		length++;

	}
	public MapIterator find(MyChar key){}
	public MapIterator begin(){}
	public MapIterator end(){}



}
