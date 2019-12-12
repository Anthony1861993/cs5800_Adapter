package cs5800_Adapter;

public class PythonArrayAdapter implements JavaArray {
	
	PythonArray pythonArray;
	
	public PythonArrayAdapter(PythonArray pythonArray) {
		this.pythonArray = pythonArray;
	}
	
	public void get(int i) {
		pythonArray.at(i);
	}
	
	public void size() {
		pythonArray.length();
	}

}
