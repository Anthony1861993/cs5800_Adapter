package cs5800_Adapter;

public class Client {
	
	public static void main(String[] args) {
		
		PythonArray pythonArray = new PythonArrayImpl();
		JavaArray javaArray = new JavaArrayImpl();
		
		pythonArray.at(1);
		pythonArray.length();
		
		javaArray.get(1);
		javaArray.size();
		
		JavaArray pythonAdapter = new PythonArrayAdapter(pythonArray);
		pythonAdapter.get(1);
		pythonAdapter.size();
	}
}
