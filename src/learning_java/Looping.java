package learning_java;

import java.util.Arrays;
import java.util.Random;

public class Looping {
	public static void main(String[] args) {
//		byte i = 1;
//		while (i <= 128) {
//			System.out.println("Hello 世界");
//			i++;
//		}
//		mountEverest();
//		randomDice();
		
//		forEachLoop();
		forInLoop();
	}
	
	public static void mountEverest() {
		int height = 8844430;
		double paper = 0.1;
		int foldedCount = 0;
		
		while (paper <= height) {
			paper *= 2;
			foldedCount++;
		}
		
		System.out.println("Total Folded is " + foldedCount);
	}
	
	public static void randomDice() {
		Random rand = new Random();
        int res;

        do {
        	res = rand.nextInt(6) + 1;
            System.out.println("Toss dice: " + res);
        } while (res != 6);

        System.out.println("Stop cause you already get number 6!");
	}
	
	public static void forEachLoop() {
		// HoF ForEach
		String[] fruits = {"Apple", "Orange", "Grape", "Peach"};
		Arrays.stream(fruits).forEach(fruit -> System.out.println(fruit));
		
		System.out.println("----------------");
		
		// Traditional For each
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
	}
	
	public static void forInLoop() {
		int[][] arr = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int[] row : arr) {
			for(int col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
	}
}
