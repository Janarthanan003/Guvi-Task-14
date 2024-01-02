package collections;
import java.util.ArrayList;
import java.util.List;
public class ListToArray {
	    public static void main(String[] args) {	        
	        List<String> stringList = new ArrayList<>();
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Orange");
	        String[] stringArray = new String[stringList.size()];
	        stringArray = stringList.toArray(stringArray);
	        System.out.println("Array elements:");
	        for (String element : stringArray) {
	            System.out.println(element);
	        }
	    }
	}