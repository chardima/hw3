public class test{

	public static  void main(String args[]){
		MyChar ch = new MyChar(); 
		MyInteger in; 
		Sequence s;
		ch.Set('h');
		in = new MyInteger();
		in.Set(9);
		MyChar ch2 = new MyChar();
		ch2.Set('g'); 
		s = new Sequence();
		s.add(ch, 0);
		s.Print(); 
		s.add(in, 1);
		s.Print();
		s.add(ch2, 2);
		s.Print();
		s.first();



		LinkedList l = new LinkedList(); 
		MyChar c = new MyChar(); 
		c.Set('c'); 
		MyInteger i = new MyInteger();
		i.Set(2); 
		MyInteger j = new MyInteger();
		j.Set(9);
		l.add(c);
		l.Print();
		l.add(i);
		l.Print();
		l.add(j);
		l.Print();
		System.out.println("\nEnd of Test\n"); 
		return; 

	}





}
