import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayList<E> implements List<E> {
	
	// array
	private E[] data;
	private int size = 0;

	
	// constructor
	public ArrayList() {
		this.data = (E[])new Object[10];
		
	}
	
		
	@Override
	public int size() {
		return this.size;
	}

	@Override
	public boolean isEmpty() {
		for (E e: data) {
			if (e!=null) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean contains(Object o) {
		for (E e: data) {
			if (e != null && e.equals(o)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean add(E e){
		
		if (size >= data.length ) {
			expand();
		}
		
		data[size++] = e;
		return true;
		
	}
	
	private void expand() {
		// make temp array twice as long as current array
		// copy data from current array to temp array
		// store temp array to current array
		E[] tempArray = (E[])new Object[data.length*2];
		for (int i = 0; i < data.length; i++) {
			tempArray[i] = data[i];
		}
		data = tempArray;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		data = (E[])new Object[10];
		this.size = 0;
	}

	@Override
	public E get(int index) {
		if (index >= 0 && index < this.size) {
			return data[index];
		} else {
			throw new IndexOutOfBoundsException();
		}
	}

	@Override
	public E set(int index, E element) {
		if (index >= 0 && index < size) {// if the index is within range
			E prev = data[index]; // get element that was in that spot
			data[index] = element; // set new element to that spot
			return prev; // return element that was in that spot
		} else {
			throw new IndexOutOfBoundsException();
		}
	} 

	
	@Override
	// insert and shift
	public void add(int index, E element) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		} 
		
		if (size == data.length) {
			expand();
		}
		
		moveUp(index, element);
	}
	
	private void moveUp(int index, E element) {
		
		if (data[index] != null) {
			E next = data[index];
			moveUp(index+1, next);
			
		} else {
			size++;
		}
		
		data[index] = element;
	}
	
	

	@Override
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		
		E removed = data[index];
		moveDown(index);
		data[size--] = null;

		return removed;
	}
	
	private void moveDown(int index) {
		
		data[index] = data[index+1];
		
		if (data[index+1] != null) {
			moveDown(index+1);
		}
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<E> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

}
