package hr.atos.praksa.lejlazepcan.zadatak06;

import java.util.Scanner;

public class Zadatak6 {

		public static void main(String[] args) {
	        	Scanner scanner = new Scanner(System.in);
	        	
	            System.out.println("Unesi ime:");
	            String name = scanner.nextLine();
	            scanner.close();
	            
	            int strlen = (int) name.chars().count();
	            
	            
	            System.out.println("-------------------------------");
	            System.out.println(": : :  TABLICA  MNOZENJA  : : :");
	            System.out.println("-------------------------------");
	            System.out.println(" * |  1  2  3  4  5  6  7  8  9");
	            System.out.println("-------------------------------");
	            
	            for (int i = 1; i < 10; i++) {
	                System.out.print(" " + i + " | ");
	                for (int j = 1; j < 10; j++) {
	                    if (i * j < 10) {
	                        System.out.print(" " + (i * j) + " ");
	                    } else {
	                        System.out.print(i * j + " ");
	                    }
	                }
	                System.out.println();
	            }
	            System.out.println("-------------------------------");
	            for (int i = 0; i < ((31 - (strlen + 3)) /3 ); i++) {
	                System.out.print(":  ");
	            }
	            if ((31 - (strlen + 3)) % 3 == 2) {
	                System.out.println("  by " + name);
	            } else if ((31 - (strlen + 3)) % 3 == 1) {
	                System.out.println(" by " + name);
	            } else {
	                System.out.println("by " + name);
	            }
	        
	        System.out.println("-------------------------------");
	    }
	}


	


