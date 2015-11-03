public class Matrix extends Sequence {


	public int rowsize, colsize;

	public Matrix(int rowsize, int colsize){
		this.rowsize = rowsize;
		this.colsize = colsize;
		MyInteger empty = new MyInteger();
		empty.Set(0);		
		for(int i = 0; i < rowsize; i++){
			Sequence col_matrix = new Sequence();
			for(int j = 0; j < colsize; j++){
				col_matrix.add(empty, j);
			}//cols	
			this.seq.add(col_matrix, i);
		}//rows
	}
	
	public void Set(int rowsize, int colsize, int value){ 
		MyInteger i = new MyInteger();
		i.Set(value);
		Sequence row = (Sequence)this.seq.get(rowsize+1); //when dealing with this.seq remember +1 index
		row.delete(colsize);
		row.add(i, colsize);
				
			
	}
	
	//A + B = C(sum)
	public Matrix Sum(Matrix mat){
		//this = A and B = mat
		//matrix is a linkedlist of sequences
		SequenceIterator a_row = this.begin(); //start at row 0
		SequenceIterator b_row = mat.begin();
		Matrix sum = new Matrix(this.rowsize, this.colsize); //the sum of matrix
		for(int row = 0; row < this.rowsize ; row++){
			SequenceIterator b_col = ((Sequence) b_row.get()).begin(); //returns the node or inner sequence
			SequenceIterator a_col = ((Sequence) a_row.get()).begin();
			for(int col = 0; col < this.colsize ; col++){
				MyInteger a = (MyInteger) a_col.get();
				MyInteger b =  (MyInteger) b_col.get();
				MyInteger c = new MyInteger();
				c.Set(a.Get() + b.Get());
				sum.Set(row, col, c.Get());
			//	sum.Print();
				a_col.advance();
				b_col.advance();
			}
			a_row.advance();	
			b_row.advance();
		}
		/*int row = 0; 
		while(a_row != null && b_row != null){
			System.out.println("Going through the rows");
			int col = 0;
			while(a_col != null ||  b_col != null && col < this.colsize){
				System.out.println("Going through the cols");
				MyInteger a = (MyInteger) a_col.get();
				MyInteger b =  (MyInteger) b_col.get();
				MyInteger c = new MyInteger();
				c.Set(a.Get() + b.Get());
				sum.Set(row, col, c.Get());
				col++;
				b_col = b_col.advance();
				a_col = a_col.advance();
			}
			row++; 
			a_row = a_row.advance();
			b_row = b_row.advance();  
			 
		}
		*/		

	return sum; 

	}

	public Matrix Product(Matrix mat){
	//this = A, mat = B
		if(this.colsize != mat.rowsize){
		System.out.println("Matrix dimensions incompatible for Product");
		System.exit(1);
		}

		Matrix product = new Matrix(this.rowsize, mat.colsize);
		int productSum = 0;
		for(int i = 1; i < product.rowsize + 1 ; i++){
			for( int j = 1; j < product.colsize + 1; j++){
				for(int k = 1; k < this.colsize + 1; k++){
					productSum = productSum + this.Get(i-1, k-1) * mat.Get(k-1, j-1);
				//	System.out.println("this.Get(i, k) is: " + this.Get(i, k));
				//	System.out.println("mat.Get(k, j) is: " + mat.Get(k, j));
				//	System.out.println("productSum is: " + productSum);
				}//end for
			//	System.out.println("Attempting to place in product matrix.");
				product.Set(i - 1, j - 1, productSum);
			//	System.out.println("Succfessfully placed");
				productSum = 0; //reset product Sum for next multiplication
			}//end for
		}//end for
		return product;
	}

	public int Get(int rowsize, int colsize){
		rowsize++;
		colsize++;
		Sequence row = (Sequence)this.seq.get(rowsize); //access row
		Node col = row.seq.getNode(colsize);	//access col
		int data = ((MyInteger)col.getData()).Get();		//access data
		//return ( (MyInteger)( ((Sequence)this.seq.get(rowsize)).seq.getNode(colsize) ).getData() ).Get();	}
		return data;
	}
	

	public void Print(){
		Node curr = this.seq.getNode(1);
		while(curr != null){
			curr.getData().Print();
			System.out.println();
			curr = curr.getNext();
		}
	}
}
