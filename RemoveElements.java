package collections;
import java.util.ArrayList;
public class RemoveElements {
	    public static void main(String[] args) {	      
	        ArrayList<String> stringList = new ArrayList<>();
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Orange");
	        stringList.add("Grapes");
	        System.out.println("ArrayList before removing elements: " + stringList);
	        stringList.clear();
	        System.out.println("ArrayList after removing elements: " + stringList);
	    }
	}