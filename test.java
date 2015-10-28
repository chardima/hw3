public class test{

	public static  void main(String args[]){
		MyChar c = new MyChar(); 
		MyInteger i; 
		Sequence s;
		c.Set('h');
		i = new MyInteger();
		i.Set(9);
		s = new Sequence();
		s.add(c, 0); 
		s.add(i, 1);
		s.Print();
		System.out.println("\nEnd of Test\n"); 
		return; 

	}





}
