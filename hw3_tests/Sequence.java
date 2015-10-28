public class Sequence extends Element{

	//private LinkedList seq = new LinkedList(); 
	private Element[] seq;
	public int length;

	
	public Sequence(){
		seq =  new Element[100]; 
		length = 0;
	}
	
	public void Print(){

		System.out.print("[ ");  
		for(int i = 0 ; i < this.length(); i++){
			
			seq[i].Print();
			System.out.print(" , ");
		}
		System.out.print(" ]\n");
	
	} 

	public Element first(){
		
		return seq[0];
		
		
	} 
	
	
	public Sequence rest(){
		Sequence x = new Sequence();
		for(int i = 0; i < this.length() - 1 ; i++){
			x.seq[i] = seq[i+1]; 
			
		}
		
		return x; 
	}
	
	public int length(){
		
			return length; 
	
	}
	
	public void add(Element ele, int pos){
		//check if within bounds, length() is number of objects and positions start at 0	
		if(pos < 0 || pos > this.length()){
			System.err.println("Position Does Not Exsist");
			System.exit(1); 
	
		}	
		else if(pos >= 0 && pos <= this.length()){
			
			for(int i = pos; i < this.length(); i++){
					Element buffer = seq[i + 1];
					this.seq[i+1] = seq[i];
				}
				this.seq[pos] = ele;
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
