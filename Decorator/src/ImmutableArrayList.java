import java.util.ArrayList;


public class ImmutableArrayList  {
	public ArrayList specialArray; 
	
	public ImmutableArrayList(ArrayList newArray) {
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
