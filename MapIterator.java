class MapIterator{

	private Node curr;
	public MapIterator(Node input){
		this.curr = input;
	}

	public MapIterator advance(){
		MapIterator next = new MapIterator(this.curr.getNext());
		this.curr = this.curr.getNext();
		return next;	

	}

	public Pair get(){
	
		return (Pair)this.curr.getData();
		

	}

	public boolean equal(MapIterator other){
		if(this.curr == other.curr){
			return true;
		}
		else{
			return false;
		}
	}

}
