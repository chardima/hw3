public class Matrix extends Sequence {


	public int rowsize, colsize;

	public Matrix(int rowsize, int colsize){
		this.rowsize = rowsize;
		this.colsize = colsize;
		
		for(int i = 1; i <= rowsize; i++){
			Sequence col_matrix = new Sequence();
			for(int j = 1; j <= colsize; j++){
				col_matrix.add(null, j);
			}//cols	
			this.seq.add(col_matrix, i);
		}//rows
	}
	
	public void Set(int rowsize, int colsize, int value){ 
		
		Node cur = this.seq.getNode(rowsize);//get sequence at row

		MyInteger i = new MyInteger();//create Integer
		i.Set(value); //set value

		((Sequence)this.seq.get(rowsize)).delete(colsize); //delete current int at pos
		((Sequence)this.seq.get(rowsize)).add(i, colsize); //replace int 
			
	}
	
	//A + B = C(sum)
	public Matrix Sum(matrix mat){
		//this = A and B = mat
		//matrix is a linkedlist of sequences
		SequenceIterator a_row = this.begin(); //start at row 0
		SequenceIterator b_row() = mat.begin();
	
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
				MyInteger c = new MyInteger( a.Get() + b.Get());
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
	public int Get(int rowsize, int colsize){
		return ( (MyInteger)( ((Sequence)this.seq.get(rowsize)).seq.getNode(colsize) ).getData() ).Get();	
	}
	
	public Matrix Product(Matrix mat){}

	public void Print(){
		System.out.print("[ ");
		int rowcounter = 1;
		int colcounter = 1; 
		Node curr = this.seq.getNode(rowcounter);
		/*while( ) //column
			while(curr != null){ //row
				curr.getData().Print();
				System.out.print(" ");
				curr = curr.getNext();
			}
			System.out.print("]");
		}*/
	}

}
