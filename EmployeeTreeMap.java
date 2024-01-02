package collections;
import java.util.TreeMap;

public class EmployeeTreeMap {
	    public static void main(String[] args) {	        
	        TreeMap<Integer, String> employeeTreeMap = new TreeMap<>();	    
	        employeeTreeMap.put(101, "John Smith");
	        employeeTreeMap.put(102, "Alice Johnson");
	        employeeTreeMap.put(103, "Bob Williams");
	        employeeTreeMap.put(104, "Emily Davis");	        
	        System.out.println("Names of employees in alphabetical order:");
	        for (String employeeName : employeeTreeMap.values()) {
	            System.out.println(employeeName);
	        }
	    }
	}