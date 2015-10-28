public class MyChar extends Element{
	private char character = new char();
	
	public char MyChar(){ //constructor
		character = '0';
	}

	public char get(){ //get function
		return character;
	}

	public void set(Char SetChar){ //set function
		character = setChar;
	}
	

	public void print(){
		System.out.println("\'"+ character  +"\'");

	}

}
