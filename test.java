public class test{

	public static  void main(String args[]){
		MyChar c = new MyChar(); 
		MyInteger i; 
		Sequence s;
		c.Set('h');
		i = new MyInteger();
		i.Set(9);
		MyChar c2 = new MyChar();
		c2.Set('g'); 
		s = new Sequence();
		s.add(c, 0);
		s.Print(); 
		s.add(i, 1);
		s.Print();
		s.add(c2, 2);
		s.Print();
		System.out.println("\nEnd of Test\n"); 
		return; 

	}





}
