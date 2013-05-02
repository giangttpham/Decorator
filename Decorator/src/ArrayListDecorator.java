import java.util.ArrayList;


public class ArrayListDecorator<E> extends ArrayList<E>{
	public ArrayList<E> specialArray; 
	
	public ArrayListDecorator (ArrayList<E> newArray){
		for (int i = 0; i < newArray.size(); i++){
			specialArray.add(newArray.get(i));
		}
	}
	
	@Override 
	public E get(int index){
		return specialArray.get(index);
	}
	
//	public int size(){
//		return specialArray.size();
//	}
//	
//	public Object get(int index){
//		return specialArray.get(index);
//	}
}
