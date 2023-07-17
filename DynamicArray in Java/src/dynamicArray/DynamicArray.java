package dynamicArray;

public class DynamicArray {
	private int array[];
	private int count;
	private int sizeofarray;

	public DynamicArray() {
		array = new int[1];
		count = 0;
		sizeofarray = 1;
	}

	// Getters and setters
	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSizeofarray() {
		return sizeofarray;
	}

	public void setSizeofarray(int sizeofarray) {
		this.sizeofarray = sizeofarray;
	}

	public void addElement(int a) {

		if (count == sizeofarray) {
			growSize();
		}
		array[count] = a; // appending an array at the end
		count++;
	}

	public void growSize() // function to double array size
	{
		int temp[] = null;
		if (count == sizeofarray) {
			temp = new int[sizeofarray * 2]; // initializing new array
			{
				for (int i = 0; i < sizeofarray; i++) {
					temp[i] = array[i]; // copying all the elements of the old array
				}
			}
		}
		array = temp;
		sizeofarray = sizeofarray * 2;
	}

	public void addElementAt(int index, int num) { // function to add element at specific position

		if (count == sizeofarray) {
			growSize();
		}
		for (int i = count - 1; i >= index; i--) {
			array[i + 1] = array[i];
		}
		array[index] = num;
		count++;
	}

}