import java.util.ArrayList;


public class TwoDimArrayList {
	protected ArrayList specialArray;
	protected int row;
	protected int col;
	
	public TwoDimArrayList (ArrayList newArray, int rowCt, int colCt){
		for (int i = 0; i < newArray.size(); i++){
			specialArray.add(newArray.get(i));
		}
		row = rowCt;
		col = colCt;
	}
	
	public int getRow(){
		return row;
	}
	
	public int getColumn(){
		return col;
	}
	
	public int size(){
		return specialArray.size();
	}
	
	public Object get(int x, int y){
		if ((y * col + x) < specialArray.size()-1)
			return specialArray.get(y * col + x);
		else
			return null;
	}
}
