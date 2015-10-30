public class MyChar extends Element{
	public char character;
	
	public MyChar(){ //constructor
		character = '0';
		
	}

	public char Get(){ //get function
		return character;
	}

	public void Set(char SetChar){ //set function
		character = SetChar;
	}
	

	public void Print(){
		System.out.print("\'"+ character  +"\'");

	}

}
