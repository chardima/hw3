public class Matrix extends Sequence{

	int rowsize, colsize;

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
	
	public int Get(int rowsize, int colsize){
		return ( (MyInteger)( ((Sequence)this.seq.get(rowsize)).seq.getNode(colsize) ).getData() ).Get();	
	}
	
	public Matrix Sum(Matrix mat){}

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
