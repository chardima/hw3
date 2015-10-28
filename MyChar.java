public class MyChar extends Element{
	private char character;
	
	public char MyChar(){ //constructor
	character = '0';
	}

	public char get(){ //get function
	return character;
	}

	public void set(char SetChar){ //set function
	character = setChar;
	}
}
