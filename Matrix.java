public class Matrix extends Sequence{

	

	public Matrix(int rowsize, int colsize){}
	
	public void Set(int rowsize, int colsize){}
	
	public int Get(int rowsize, int colsize){}
	
	public Matrix Sum(matrix mat){}

	public Matrix Product(Matrix mat){}

	public void Print(){
		System.out.print("[ ");
		int rowcounter = 1;
		int colcounter = 1; 
		Node curr = this.seq.getNode(rowcounter);
		while( ) //column
			while(curr != null){ //row
				curr.getData().Print();
				System.out.print(" ");
				curr = curr.getNext();
			}
			System.out.print("]");
		}
	}

}
