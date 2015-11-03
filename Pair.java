class Pair extends Element{

	MyChar key;
	Element value;
		
	public Pair(MyChar key, Element value){
		this.key = key;
		this.value = value;

	}

	public MyChar getKey(){	
		

		return this.key;



	}

	public void Print(){
		//System.out.print("( " +"\'" + key.Get() + "\' ");
		System.out.print("(");
		key.Print();
		System.out.print(" ");
		value.Print();
		System.out.print(")");  

	}

		
}
