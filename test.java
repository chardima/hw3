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
		System.out.println();
		s.add(in, 1);
		s.Print();
		System.out.println();
		s.add(ch2, 1);
		s.Print();
		System.out.println();
		MyInteger f = new MyInteger();
		f.Set(99); 
		s.add(f, 1);
		s.Print();
		System.out.println();
		Element e = s.first();
		s.delete(1);
		s.Print();
		e.Print();
		System.out.println();
		Sequence s2; 
		s2 = s.rest();
		s2.Print();
		System.out.println("\nAdding h at pos s1[3]"); 
		s.add(ch, 3);
		System.out.print("s1:");
		s.Print();
		System.out.print("\ns2:");
		s2.Print(); 
		System.out.println();


/*
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
*/
		System.out.println("\nEnd of Test\n"); 
		return; 

	}





}
