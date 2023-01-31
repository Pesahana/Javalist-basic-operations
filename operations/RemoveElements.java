package operations;

import java.util.ArrayList;

class RemoveElements {
	public static void main(String[] args) {
	    ArrayList<String> animals = new ArrayList<>();

	    
	    animals.add("Dog");
	    animals.add("Cat");
	    animals.add("Horse");
	    System.out.println("ArrayList: " + animals);

	   
	    String str = animals.remove(2);
	    
	    System.out.println("Updated ArrayList: " + animals);
	    System.out.println("Removed Element: " + str);
	  }
	
}
