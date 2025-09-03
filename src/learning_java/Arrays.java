package learning_java;

import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
//		reverseArray(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
//		printArr(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
		numberPrime(101, 200);
		String coba = arrayMinMax(7, 8, 9, 8, 45, 54, 132, 456, 4, 5, 1, 10);
		System.out.println(coba);
	}
	
	static void numberPrime(int startNumber, int endNumber) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = startNumber; i <= endNumber; i++) if (isPrimeNumber(i)) numbers.add(i);
		System.out.print("[");
		for (int number : numbers) System.out.print((number == numbers.get(numbers.size() - 1)) ? number + "]" : number + ", ");
		System.out.println();
		System.out.println("Total prime Number: " + numbers.size());
	}
	
	static boolean isPrimeNumber(int number) {
		if (number < 2) return false;
        for (int i = 2; i * i <= number; i++) if (number % i == 0) return false;
        return true;
	}
	
	static String arrayMinMax(int... array) {
		String result = "";
		int min = array[0];
		int max = array[0];
		
		for(int i = 0, j = array.length - 1; i <= j; i++, j--) {
			if (i != j) {
                if (array[j] < min) min = array[j];
                if (array[j] > max) max = array[j];
            }
			if (array[i] < min) min = array[i];
            if (array[i] > max) max = array[i];
			
		}
		result = "Minimum is: " + min + "\nMaximum is: " + max;
		return result;
	}
	
	static void printArr(int... array) {
		System.out.print("[");
		for(int arr : array) {
			System.out.print(arr == array[array.length - 1] ? arr + "]" : arr + ", ");
		}
	}
	
	static void reverseArray(int... array) {
		int loopCount = 0;
		System.out.print("Original array: ");
		for(int arr : array) {
			if(arr == array[array.length - 1]) {
				System.out.print(arr + ".");
			} else {
				System.out.print(arr + ", ");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < array.length / 2; i++) {
			if(i == array[array.length / 2]) {
				continue;
			}
			loopCount++;
			int tempNumber = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = tempNumber;
		}
		
		System.out.print("New array: ");
		for(int arr : array) {
			if(arr == array[array.length - 1]) {
				System.out.print(arr + ".");
			} else {
				System.out.print(arr + ", ");
			}
		}
		System.out.println();
		System.out.println("Looping count total: " + loopCount);
	}
	
	static void introArray() {
		int[] arr = { 1, 2, 3, 4, 5};
		String[] strArr = { "apple", "orange", "grape" };
		double[] doubleArr = { 1.1, 2.2, 3.3, 4.4, 5.5};
		System.out.println(arr);
		System.out.println(strArr);
		System.out.println(doubleArr);
		
		// "[" means indicator is an array
		// "I" means array type
		// "@" means separator
		// "5f184fc6" means actual memory address (in HEX)
	}
}