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
	
		SequenceIterator a_col = ((Sequence) a_row.get()).begin(); //returns the node or inner sequence  
		SequenceIterator b_col = ((Sequence) b_row.get()).begin(); //returns the node or inner sequence
		Matrix sum = new Matrix(this.rowsize, this.colsize); //the sum of matrix
	        //for each row and column need to add the element and set them to each other
		int row = 0; 
		while(a_row != null || b_row != null){
			int col = 0;
			while(a_col != null || b_col != null){
				MyInteger a = (MyInteger) a_col.get();
				MyInteger b = (MyInteger) b_col.get();
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
				

	return sum; 

	}

	public Matrix Product(Matrix mat){
	//this = A, mat = B
		if(this.colsize != mat.rowsize){
		System.err.print("m1 * m2 = Matrix dimensions incompatible for Product");
		System.exit(1);
		}

		Matrix product = new Matrix(this.rowsize, mat.colsize);
//		int tempProduct = 0;
		int productSum = 0;
		
		for(int i = 0; i < product.rowsize ; i++){
			for( int j = 0; j < product.colsize; j++){
				for(int k = 0; k < this.colsize; k++){
//					tempProduct = this.Get(i, k) * mat.Get(k, j);
					productSum = productSum + (this.Get(i, k) * mat.Get(k, j));
//					tempProduct = 0; //reset product for next dot product step
				}//end for
				product.Set(i, j, productSum);
				productSum = 0; //reset product Sum for next multiplication
			}//end for
		}//end for
		return product;
	}

	public int Get(int rowsize, int colsize){
		return ( (MyInteger)( ((Sequence)this.seq.get(rowsize)).seq.getNode(colsize) ).getData() ).Get();	}
	

	public void Print(){
		Node curr = this.seq.getNode(1);
		while(curr != null){
			curr.getData().Print();
			System.out.println();
			curr = curr.getNext();
		}
	}
}
