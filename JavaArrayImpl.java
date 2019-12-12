package cs5800_Adapter;

public class JavaArrayImpl implements JavaArray {
	
	public void get(int i) {
		System.out.println("Return object at index " + i + " in Java array.");
	}
	
	public void size() {
		System.out.println("Return the size of a Java array.");
	}
}
