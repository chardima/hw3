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
		//TESTING PART 5
		System.out.println("\n\nTesting Matrices");
		System.out.print("m1:\n");
		Matrix m1 = new Matrix(2,2);
		int val = 0;
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				m1.Set(i,j,val);	
				val++;
			}//cols
		}//set rows
		m1.Print();//print m1

		Matrix m2 = new Matrix(2,2);
		for(int i = 0; i < 2; i++){
			for(int j = 0; j < 2; j++){
				m2.Set(i,j,val);	
				val++;
			}//cols
		}//set rows
		System.out.println("\nm2:");
		m2.Print();//print m1

		System.out.println("\nTesting Get...");
		System.out.print(m2.Get(1, 1) +" \n");
		
		System.out.println("\nm3 (sum):");
		Matrix m3 = m1.Sum(m2);
		m3.Print();

		System.out.println("\nm4 (product):");
		Matrix m4 = m1.Product(m2);
		m4.Print();
	
		//TESTING PART 6
		Map map = new Map();
		MapIterator mt;
		Pair p;
		MyChar key;
		
		for(int i = 0; i < 10; i++){ 
			key = new MyChar();
			key.Set( (char) (65+i));
//			System.out.print((char)(65+ i));
			MyInteger val2 = new MyInteger();
			val2.Set(i);
			p = new Pair(key, val2);
			map.add(p);
		}
				
		System.out.print("Printing map m1: ");
		map.Print();
		System.out.println();
		
		Map map2 = new Map();
		
		for(int i = 0; i < 69; i++){
			key = new MyChar();
			key.Set('A');
			MyInteger val3 = new MyInteger();
			val3.Set(i + 420);
			p = new Pair(key, val3);
			map2.add(p);
		}


		System.out.print("Printing map m2: ");
		map2.Print();
		System.out.println();
		
	
		System.out.println("\n\nEnd of Test"); 
		return; 
		
	}
		
		
		
			
}
