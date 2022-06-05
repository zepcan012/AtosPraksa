package hr.atos.praksa.lejlazepcan.zadatak05;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int start = 0;
		int stop = 0;
		int counter = 0;
		
		System.out.println("Unesi pocetak intervala manji od 10: ");
		start = input.nextInt();
		if(start >= 10) {
			do {
				System.out.println("Unesen je prevelik broj, ponovite unos!");
				start = input.nextInt();
			}while(start >= 10);
		}
		
		
		System.out.println("Unesi kraj intervala veci od 100: ");
		stop = input.nextInt();
		if(stop<= 100) {
			do {
				System.out.println("Unesen je premalen broj, ponovite unos!");
				stop = input.nextInt();
			}while(stop <= 100);
		}
		input.close();
		
		for(int i = start; i<= stop; i++) {
			if(i <= 18) {
				counter +=4;
			}
			if (i > 18) {
                counter -= 1;
            } 
            if (i % 20 == 0) {
                continue;
            }
            if (i >= 75) {
                System.out.println("Vrijednost brojaca je: " + counter);
                break;
            }

		}

	}
	

}
