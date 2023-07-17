package dynamicArray;

public class Tester {

	public static void main(String[] args) {
		DynamicArray da = new DynamicArray();

		da.addElement(12);
		da.addElement(22);
		da.addElement(35);
		da.addElement(47);
		da.addElement(85);
		da.addElement(26);
		da.addElement(70);
		da.addElement(81);
		da.addElement(96);
		da.addElement(54);
		System.out.println("Elements of the array:");

		for (int i = 0; i < da.getSizeofarray(); i++) {
			System.out.print(da.getArray()[i] + " ");
		}
		System.out.println();

		System.out.println("Size of the array: " + da.getSizeofarray());
		System.out.println("No. of elements in the array: " + da.getCount());

		da.addElementAt(5, 99); // 5 is the index number and 99 is the element to be add
		System.out.println("\nElements of the array after adding an element at index 5:");

		for (int i = 0; i < da.getSizeofarray(); i++) {
			System.out.print(da.getArray()[i] + " ");
		}
		System.out.println();

		System.out.println("Size of the array: " + da.getSizeofarray());
		System.out.println("No. of elements in the array: " + da.getCount());
	}
}
