public class MyChar extends Element{
	private Char character = new Char();
	
	public Char MyChar(){ //constructor
		character = '0';
	}

	public Char get(){ //get function
		return character;
	}

	public void set(Char SetChar){ //set function
		character = setChar;
	}
	

	public void print(){
		System.out.println("\'"+ character  +"\'");

	}

}
