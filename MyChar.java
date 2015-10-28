public class MyChar extends Element{
	private char character;
	
	public MyChar(){ //constructor
		character = '0';
		
	}

	public char get(){ //get function
		return character;
	}

	public void set(char SetChar){ //set function
		character = SetChar;
	}
	

	public void print(){
		System.out.println("\'"+ character  +"\'");

	}

}
