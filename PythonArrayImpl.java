package cs5800_Adapter;

public class PythonArrayImpl implements PythonArray {
	
	public void at(int i) {
		System.out.println("Return object at index " + i + " in Python array.");
	}
	
	public void length() {
		System.out.println("Return the size of a Python array.");
	}
}
