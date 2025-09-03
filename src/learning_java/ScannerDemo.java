package learning_java;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
//		seken();
		decompose();
	}
	
	void testing() {
		Scanner sc = new Scanner(System.in);
		
		String name;
		int age;
		boolean isMarried;
		
		System.out.println("会社員情報を記入してください！");
		name = sc.nextLine().trim();
//		age = sc.nextLine().trim();
		if (!name.isEmpty()) {
			System.out.println("名前を記入してください！");
		}
		
		System.out.println("=====================");
		System.out.println("こんにちは :");
		
		System.out.println("年齢を記入してください！");
//		System.out.println(age + "歳ですね");
		
		sc.close();
	}
	
	
	public static void seken() {
		Scanner scanner = new Scanner(System.in);

        String nama;
        while (true) {
            System.out.print("Siapa namamu? ");
            nama = scanner.nextLine().trim();

            if (!nama.isEmpty()) break;
            System.out.println("Nama tidak boleh kosong. Coba lagi.");
        }

        String teks;
        while (true) {
            System.out.print("Berikan aku teks, " + nama + ": ");
            teks = scanner.nextLine().trim();

            if (!teks.isEmpty()) break;
            System.out.println("Teks tidak boleh kosong. Coba lagi.");
        }

        int umur = 0;
        while (true) {
            System.out.print("Berapa umurmu, " + nama + "? ");
            String inputUmur = scanner.nextLine().trim();

            try {
                umur = Integer.parseInt(inputUmur);
                if (umur > 0) break;
                else System.out.println("Umur harus lebih dari 0.");
            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka. Coba lagi.");
            }
        }

        System.out.println("\n--- Ringkasan ---");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Teks yang kamu berikan: " + teks);

        scanner.close();
	}
	
	public static void decompose() {
		int number = 0;
		int one = 0;
		int thousand = 0;
		int hundred = 0;
		try (Scanner sc = new Scanner(System.in)) {
			while(true) {
				System.out.println("Enter a number ");
				
				if (sc.hasNextInt()) {
					number = sc.nextInt();
					one = (number / 100) % 10;
					thousand = number % 10;
					hundred = (number / 10) % 10;
					System.out.println("One: " + one);
					System.out.println("Hundred: " + hundred);
					System.out.println("Thousand: " + thousand);
					System.out.println(one + "," + hundred + "," + thousand);
					break;
		        } else {
		            System.out.println("Input not valid. must be a number.");
		            sc.nextLine(); 
		        }
			}
		}
	}
}
