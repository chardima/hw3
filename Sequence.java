public class Sequence extends Element{


	private Element[] seq;
	public int length;

	
	public Sequence(){
		seq = null; 
		length = 0;
	}
	
	public void print(){

		for(int i = 0 ; i < this.length(); i++){
			System.out.println("[" + seq[i].print() +"]");
		}
	
	} 

	public Element first(){
		
		return seq[0];
		
		
	} 
	
	
	public Seqence[] rest(){
		Sequence[] x;
		for(int i = 1; i < this.length(); i++){
			x[i-1] = seq[i]; 
			
		}
		
		return x; 
	}
	
	public void length(){
		
			return length; 
	
	}
	
	public void add(Element ele, int pos){
		
		if( pos < 0 || pos > this.length()){
			System.err.println("Position Does not exsist");
			System.exit(1);
		}
		else if(pos > 0 && pos <= this.length() - 1){
			
				for(int i = pos; i < this.length(); i++){
					Element buffer = seq[i + 1];
					seq[i+1] = seq[i];
				}
				seq[pos] = ele;
				length++; 
		}
		
		
		
	}
	
	public void delete(int pos){
		
		for(int i = pos; i > this.length()-1; i++){
					//Element buffer = seq[i - 1];
					//Element buffer = seq[i - 1];
					seq[i] = seq[i+1];				
		}
			length--; 
		
	}
	
	
}
