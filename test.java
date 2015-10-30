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
		//s.Print(); 
		//System.out.println();
		s.add(in, 1);
		//s.Print();
		//System.out.println();
		s.add(ch2, 1);
		//s.Print();
		//System.out.println();
		MyInteger f = new MyInteger();
		f.Set(99); 
		s.add(f, 1);
		//s.Print();
		//System.out.println();
		Element e = s.first();
		//s.Print();
		//System.out.println(); 
		//e.Print();
		//System.out.println('\n');

	
		
		System.out.print("Starting s1 and s2:\ns1:");
		s.Print();
		System.out.println();


		//TESTING REST
		//make s2 = s.rest
		Sequence s2;
		s2 = s.rest();
		System.out.print("s2:");
		s2.Print();
		System.out.println("\n");


		System.out.println("Adding h at pos s1[3]"); 
		s.add(ch, 3);
		System.out.print("s1:");
		s.Print();
		System.out.println();
		System.out.print("s2:");
		s2.Print(); 
		System.out.println();
		//System.out.println();
		//System.out.print("s1:");
		//s.Print();
		//System.out.println();

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
*
*/
		//TESTING COPY		
		System.out.print("\nTesting copy\ns1:");
		s.Print();
		Sequence cpy = s.copy();
		System.out.print("\nCopy:");
		cpy.Print(); 
		System.out.println(); 





		System.out.println("\n\nEnd of Test"); 
		return; 

	}





}
