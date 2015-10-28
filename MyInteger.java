public class MyInteger extends Element{
	
	public int integer; 

	public MyInteger(){
		integer = 0; 

	}

	public int get(){
		return integer; 
	}

	public void set(int val){
		integer = val; 
		
	}

	public void print(){
	
	System.out.println(integer);

	}
}
