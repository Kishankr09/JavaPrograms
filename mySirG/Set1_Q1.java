package mySirG;
class Array{
	private int lastIndex;
	private int[] ptr;
	public Array(int size) {
		lastIndex = -1;
		ptr = new int[size];
	}
	public void append(int data) {
		try {
			ptr[lastIndex+1]= data;
			lastIndex++;
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array is already Full, can Not add more Value.");
		}
	}
	public void insert(int index, int data) {
		try {
			if(index<0 || index>lastIndex+1)
				throw new ArrayIndexOutOfBoundsException("Invalid index Exception");
			for(int i = lastIndex; i>=index; i--)
				ptr[i+1] = ptr[i];
			ptr[index] = data;
			lastIndex++;
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
	}
	public void edit(int index, int newData) {
		try {
			if(index<0 || index>lastIndex)
				throw new ArrayIndexOutOfBoundsException("Invalid index Exception");
			ptr[index] = newData;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
	}
	public void delete(int index) {
		try {
			if(index<0 || index>lastIndex)
				throw new ArrayIndexOutOfBoundsException("Invalid index Exception");
			for(int i = index; i<lastIndex; i++)
				ptr[i] = ptr[i+1];
			lastIndex--;
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
	}
	public int count() {
		return lastIndex+1;
	}
	public boolean isEmpty() {
		return lastIndex == -1;
	}
	public boolean isFull() {
		return lastIndex+1 ==ptr.length;
	}
	public int getValue(int index) {
		try {
			if(index<0 || index>lastIndex)
				throw new ArrayIndexOutOfBoundsException("Invalid index Exception");
			return ptr[index];
			
		}catch(ArrayIndexOutOfBoundsException e) {
			e.getMessage();
		}
		return 0;
	}
	public int getCapacity() {
		return ptr.length;
	}	
}
public class Set1_Q1 {
	
	public void driver() {
		Array arr = new Array(4);
		arr.append(10);
		arr.append(20);
		arr.insert(0, 30);
		arr.insert(1, 40);
		arr.append(50);
		for(int i = 0; i < arr.count(); i++) {
			System.out.println(arr.getValue(i)+ " " );
		}		
	}
}
