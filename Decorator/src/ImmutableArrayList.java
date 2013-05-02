import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class ImmutableArrayList<E> extends ArrayList<E> {
	public ArrayList<E> specialArray; 
	
	public ImmutableArrayList(ArrayList<E> newArray) {
		
		specialArray = new ArrayList<E>();
		
		for (int i = 0; i < newArray.size(); i++){
			specialArray.add(newArray.get(i));
		}
	}
	
	

	@Override
	public boolean add(Object e) {
		
		throw new UnsupportedOperationException();
	}

	@Override
	public void add(int index, Object element) {
		throw new UnsupportedOperationException();
		
	}
	
	@Override
	public boolean addAll(Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public void clear() {
		throw new UnsupportedOperationException();	
	}
	
	
	@Override
	public E get(int index){
		return specialArray.get(index);
	}
	@Override
	public E remove(int index) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void removeRange (int fromIndex, int toIndex){
		throw new UnsupportedOperationException();
	}
	
	@Override
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}

	@Override
	public E set(int index, Object element) {
		throw new UnsupportedOperationException();
	}
	
	@Override 
	public int size(){
		return specialArray.size();
		
	}
	
	@Override
	public List<E> subList(int fromIndex,int toIndex){
		throw new UnsupportedOperationException();
	}

	

	

	

	

	


}



	
