package c15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentDemo {
	public static void main(String[] args) {
		Map<String, List<String>> departmentToEmployees = new HashMap<>();
		String dept = "Engineering";
		
		// get the list for "Engineering", of if absent, create a new ArrayList and put it in the map instance
		List<String> employees = departmentToEmployees.computeIfAbsent(dept, k -> new ArrayList<>());
		employees.add("Alice");
	}
	
	static void traditionalWay() {
		Map<String, List<String>> departmentToEmployees = new HashMap<>();
		String dept = "Engineering";
		
		// 1. check if the list already exists for this key
		List<String> employees = departmentToEmployees.get(dept);
		if (employees == null) { // 2. if not, create it
			employees = new ArrayList<>(); // created it
			departmentToEmployees.put(dept, employees); // add key-value pair back to the underlying map
		}
		employees.add("Alice");
		employees.add("Tom");
		
		System.out.println(departmentToEmployees);
	}
}
