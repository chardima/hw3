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

	public Element get(){
	
		return this.curr.getData();
		

	}

}
