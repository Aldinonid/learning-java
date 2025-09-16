package c15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo1 {
	public static void main(String[] args) {
		// create a Map instance
		Map<String, String> marriageRegistry = new HashMap<>();
		
		// add marriage record 
		marriageRegistry.put("John", "Mary"); // one pair of key and value
		marriageRegistry.put("David", "Sarah");
		marriageRegistry.put("Mike", "Emily");
		
		// method 1: map.foreach() -> most concise method for reversal
		System.out.println("1. forEach() - simplied view:");
		marriageRegistry.forEach((husband, wife) -> System.out.println("Couple: " + husband + " & " + wife));
		
		// method 2: keySet().forEach -> traditional iteration (key-value pairs)
		System.out.println("\n2. Traditional iteration");
		Set<String> husbands = marriageRegistry.keySet();
		for (String husband : husbands) { // "husband" is a local defined temporary variable
			String wife = marriageRegistry.get(husband);
			System.out.println(husband + " is married to " + wife);
		}
		
		// method 3. entrySet().forEach()
		System.out.println("\n3. entrySet().forEach");
		marriageRegistry.entrySet().forEach(certificate -> {
			String husband = certificate.getKey();
			String wife = certificate.getValue();
			System.out.println("Certificate: " + husband + " and " + wife);
			if (husband.equals("John")) {
				certificate.setValue("Lisa"); // John remarriages Lisa
			}
		});
		
		System.out.println(marriageRegistry);
		
	}
	
	static void mapIntro() {
		// create a Map instance
		Map<String, String> map = new HashMap<>();
		
		// add elements
		map.put("John", "Mary"); // one pair of key and value
		map.put("David", "Sarah");
		map.put("Mike", "Emily");
//		map.put("John", "Melody");
		
		System.out.println(map.size());
		System.out.println(map); // the sequence isn't the insertion sequence
		
	}
}
