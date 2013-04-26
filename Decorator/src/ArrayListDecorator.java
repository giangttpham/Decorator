import java.util.ArrayList;


public class ArrayListDecorator{
	public ArrayList specialArray; 
	
	public ArrayListDecorator (ArrayList newArray){
		for (int i = 0; i < newArray.size(); i++){
			specialArray.add(newArray.get(i));
		}
	}
	
	public int size(){
		return specialArray.size();
	}
	
	public Object get(int index){
		return specialArray.get(index);
	}
}
