public class MyInteger extends Element{
	
	public int integer = new int(); 

	public MyInteger(){
		integer = 0; 

	}

	public int get(){
		return integer; 
	}

	public void set(Integer val){
		integer = val; 
		
	}

	public void print(){
	
	System.out.println(integer);

	}
}
