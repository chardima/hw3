public class MyInteger extends Element{
	
	public Integer integer = new Integer(); 

	public MyInteger(){
		integer = 0; 

	}

	public Integer get(){
		return integer; 
	}

	public void set(Integer val){
		integer = val; 
		
	}

	public void print(){
	
	System.out.println(integer);

	}
}
