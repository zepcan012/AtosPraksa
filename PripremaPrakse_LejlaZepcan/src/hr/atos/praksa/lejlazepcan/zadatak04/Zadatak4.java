package hr.atos.praksa.lejlazepcan.zadatak04;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		
		
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Unesi " + (i+1)+". broj:");
			array[i] = scanner.nextInt(); 
		}
		scanner.close();
		
		for(int i=0; i<array.length; i++) {
			if(array[i] %2 == 0 ) {
				System.out.println(array[i] + " je paran broj.");
			}
			else {
				System.out.println(array[i] + " je neparan broj.");
			}
			if(array[i] % 3 == 0) {
                System.out.println(array[i] + " je višekratnik od 3");
            }
            if(array[i] % 5 == 0) {
                System.out.println(array[i] + " je višekratnik od 5");
            }
            if(array[i] % 11 == 0) {
                System.out.println(array[i] + " je višekratnik od 11");
            }
		}

	}

}
