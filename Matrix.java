public class Matrix extends Sequence{

	private LinkedList mat;	
	int rowsize, colsize;

	public Matrix(int rowsize, int colsize){
		this.rowsize = rowsize;
		this.colsize = colsize;
		
		for(int i = 1; i <= rowsize; i++){
			Sequence col_matrix = new Sequence();
			for(int j = 1; j <= colsize; j++)}
				col_matrix.add(null, j);
			}//cols	
			this.mat.add(col_matrix, i);
		}//rows
	}
	
	public void Set(int rowsize, int colsize){ 
		
		for(int i = 0; i < rowsize; i++){
		
		}//get row
	}
	
	public int Get(int rowsize, int colsize){}
	
	public Matrix Sum(matrix mat){}

	public Matrix Product(Matrix mat){}

	public void Print(){}

}
