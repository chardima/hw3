class SequenceIterator extends Sequence {
	private Node cur;

	public SequenceIterator(Node input){
		cur = input;
	}

	public SequenceIterator advance(){
		SequenceIterator next = new SequenceIterator(this.cur.getNext());
		this.cur = this.cur.getNext();
		return next;

	}

	public Element get(){
		return this.cur.getData();
	}

	public boolean equal(SequenceIterator other){
		if(this.cur == other.cur){
			return true;
		}
		else{
			return false;
		}
	}

}
