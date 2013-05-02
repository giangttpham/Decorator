import java.util.ArrayList;


public class TwoDimArrayList<E> extends ArrayList<E>{
	protected ArrayList<E> specialArray;
	protected int colCt;
	
	public TwoDimArrayList (ArrayList<E> newArray, int noOfCol){
		
		specialArray = new ArrayList<E>();
		
		for (int i = 0; i < newArray.size(); i++){
			specialArray.add(newArray.get(i));
		}
		
		colCt = noOfCol;
	}
	
	
	@Override
	public E get(int index){
		return super.get(index);
	}
	
	
	public E get(int col, int row){
		int index = row * colCt + col;
		if (index < specialArray.size())
			return specialArray.get(index);	
		else
			throw new ArrayIndexOutOfBoundsException();
	}
	
	
	public void set(int col, int row, E newValue){
		int index = row * colCt + col;
		if (index < specialArray.size())
			specialArray.set(index, newValue);
		else
			throw new ArrayIndexOutOfBoundsException();
	}
}
