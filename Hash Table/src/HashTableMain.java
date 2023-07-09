import java.util.LinkedList;
import java.util.Scanner;

class HashTable {
	static class Pair {
		private int key; // key=roll
		private String value; // value=name

		public Pair() {
			key = 0;
			value = "";

		}

		public Pair(int key, String value) {
			super();
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}

	}

	private static final int SLOTS = 100;
	private LinkedList<Pair> table[];

	public int hash(int key) {
		return key % SLOTS;
	}

	public HashTable() {
		table = new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++)
			table[i] = new LinkedList<>();
	}

	public void put(int key, String value) {
		// find slot for given key using hash function
		int slot = hash(key);
		// access the bucket (linkedlist) in that slot
		LinkedList<Pair> bucket = table[slot];
		// fing the element (key-value) in that bucket-linear search
		for (Pair pair : bucket) {
			//if key is duplicated ,  replace the value
			if (key == pair.key) {
				pair.value= value;
				return;
				
			}

		}
		// if key not found, create a new pair and add into bucket
		Pair pair=new Pair(key,value);
		bucket.add(pair);
		System.out.println("  pair added  "+pair);
	}

	public String get(int key) {
		// find slot for given key using hash function
		int slot = hash(key);
		// access the bucket (linkedlist) in that slot
		LinkedList<Pair> bucket = table[slot];
		// fing the element (key-value) in that bucket-linear search
		for (Pair pair : bucket) {

			if (key == pair.key)
				return pair.value;
		}
		// if key not found return null
		return null;

	}

}

public class HashTableMain {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	HashTable ht=new HashTable();
	ht.put(1, "PEter");
	ht.put(4, "Walter");
	ht.put(8, "WaltJR");
	ht.put(5, "Tuco");
	ht.put(24, "Jesse");
	ht.put(34, "Witcher");
	ht.put(25, "Superman");
	
	
	System.out.println("Enter roll no to find:");
	int roll=sc.nextInt();
	String name=ht.get(roll);
	System.out.println("Name found:" +name);
}
}
