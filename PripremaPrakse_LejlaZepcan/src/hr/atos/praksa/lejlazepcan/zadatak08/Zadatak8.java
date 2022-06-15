package hr.atos.praksa.lejlazepcan.zadatak08;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int month = 0;
		
		System.out.println("Unesite mjesec koji zelite ispisati: ");
		month = input.nextInt();
		if(month <= 0 || month > 12) {
			do {
				System.out.println("Unesen je nepostojeci mjesec, ponovite unos!");
				month = input.nextInt();
			}while(month <= 0 || month > 12);
		}
		input.close();
		
        if (month == 2) {
            System.out.printf("  P  U  S  C  P  S  N \n  1  2  3  4  5  6  7 \n  8  9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29");
        } else if (month ==1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.printf("  P  U  S  C  P  S  N \n  1  2  3  4  5  6  7 \n  8  9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29 30 31");
        } else {
            System.out.printf("  P  U  S  C  P  S  N \n  1  2  3  4  5  6  7 \n  8  9 10 11 12 13 14 \n 15 16 17 18 19 20 21 \n 22 23 24 25 26 27 28 \n 29 30");  
        }


	}

}
