package hr.atos.praksa.lejlazepcan.zadatak07;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int start = 0;
		int end = 0;
		int replace = 0;
		int counter = 0;
		
		System.out.println("Unesite pocetni prirodni broj: ");
		start = input.nextInt();
		if(start <= 0) {
			do {
				System.out.println("Nije unesen prirodni broj, ponovite unos!");
				start = input.nextInt();
			}while(start <= 0);
		}
		
		System.out.println("Unesite krajnji prirodni broj: ");
		end = input.nextInt();
		if(end <= 0) {
			do {
				System.out.println("Nije unesen prirodni broj, ponovite unos!");
				end = input.nextInt();
			}while(end <= 0);
		}
		input.close();
		
		if (start > end) {
            replace = start;
            start = end;
            end = replace;
        }

		
		for(int i = start; i <= end; i++) {
			if(i % 6 == 0) {
				counter ++;
			}
		}
		
		if(counter ==1) {
			System.out.println("Izmedu intervala " + start + " i " + end + " ima " + counter + " broj djeljiv sa 6.");
		}
		else if(counter < 5) {
			System.out.println("Izmedu intervala " + start + " i " + end + " ima " + counter + " broja djeljiva sa 6.");
		}
		else {
			System.out.println("Izmedu intervala " + start + " i " + end + " ima " + counter + " brojeva djeljiva sa 6.");

		}

	}

}
