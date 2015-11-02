public class test{

	public static  void main(String args[]){
		Sequence deep = new Sequence(); 
		MyChar h = new MyChar();
		MyInteger n = new MyInteger();
		h.Set('a');
		n.Set(100);
		deep.add(n,0);
		deep.add(h,1);
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
		s.add(deep, 3);
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


		//TESTING FLATTEN
		System.out.println("\nTesting flatten, with sequence [6, '9'] in s1 index 2:");
		Sequence inner = new Sequence();
		MyInteger in1 = new MyInteger();
		in1.Set(6);
		MyChar co = new MyChar();
		co.Set('9');
		inner.add(in1, 0);
		inner.add(co, 1);
		//inner.Print();
		s.add(inner, 2);	
		System.out.print("s1:");
		s.Print();
		s2 = s.flatten();
		System.out.print("\ns2:");
		s2.Print();

		System.out.println("\n\nTesting flatten with sequence [6, '9', [420] ]");
		Sequence inner2 = new Sequence();
		MyInteger blaze = new MyInteger();
		blaze.Set(420);
		inner2.add(blaze,0);
		inner.add(inner2, 1);
		//inner.Print();	
		//s.add(inner, 2);
		System.out.print("s1:");
		s.Print();
		s2 = s.flatten();
		System.out.print("\ns2:");
		s2.Print();

		System.out.println("\n\nTesting index, shoult print out index 2");
		//MyChar ko = new MyChar();
		//ko = 
		s.index(2).Print();
		//ko.Print();
		
		



		//TESTING Part 4
		System.out.println("\n\nTesting Iterator for s1");
		System.out.print("s1:");
		s.Print();
		System.out.print("\nIterating:");
		SequenceIterator it; //create iterator
		
		for(it = s.begin(); !it.equal(s.end()); it.advance()){
			(it.get()).Print();
		}



		System.out.println("\n\nEnd of Test"); 
		return; 

	}





}
