package operations;

import java.util.ArrayList;

class ChangeElements {

	public static void main(String[] args) {
	    ArrayList<String> languages = new ArrayList<>();

	    
	    languages.add("Java");
	    languages.add("Kotlin");
	    languages.add("C++");
	    System.out.println("ArrayList: " + languages);

	    
	    languages.set(1, "JavaScript");
	    System.out.println("Modified ArrayList: " + languages);
	
	}
	
}
