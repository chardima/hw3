public Sequence extends Element{


	private Element[] seq = new Element[];
	public Sequence{
		seq = null; 

	}   
	 public void print(){

		for(int i = 0 ; i < seq.length(); i++){
			System.out.println("[" + seq[i].print() +"]");
		}
	
	} 

	public void first(){} 
	public void rest(){}
	public void length(){}
	public void add(){}
	public void delete(){}
}
