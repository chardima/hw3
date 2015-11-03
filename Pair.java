class Pair extends Element{

	MyChar key;
	Element value;
		
	public Pair(MyChar key, Element value){
		this.key = key;
		this.value = value;

	}

	public void Print(){
		System.out.print("( " +"\'" + key + "\' ");
		value.Print();
		System.out.print(" )");  

	}
}
