package c15;

import java.util.HashMap;
import java.util.Map;

public class MergeDemo {
	public static void main(String[] args) {
		Map<String, Integer> wordCounts = new HashMap<>();
		String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
		
		for (String word : words) {
			Integer currentCount = wordCounts.get(word);
			if (currentCount == null) {
				wordCounts.put(word, 1);
			} else {
				wordCounts.put(word, currentCount + 1);
			}
		}
		
		System.out.println(wordCounts);
		
		for (String word : words) {
			wordCounts.merge(word, 1, (oldCount, newCount) -> oldCount + newCount);
		}
		
		// 2nd "apple", the function is called: (1, 1) -> 1 + 1 it return 2
		// 3rd "apple", the function is called: (2, 1) -> 2 + 1 it return 3
		System.out.println(wordCounts);
	}
}
