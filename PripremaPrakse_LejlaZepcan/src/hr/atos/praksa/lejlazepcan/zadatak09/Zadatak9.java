package hr.atos.praksa.lejlazepcan.zadatak09;
import java.util.Scanner;

public class Zadatak9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int unos = 0;
		int racuni[] = new int[12];
		int racuniAprox[] = new int[12];
		
		
		for(int i = 0; i< 12; i++) {
		    System.out.println("Unesi racun za " + (i+1) + ". mjesec:");
		    
		    unos = input.nextInt();
		  
		    racuni[i] = unos;
		    
		}
		input.close();
		
		approximation(racuni, racuniAprox);
		printGraf(racuniAprox);

	}
	
	
	
	
	public static int[] approximation(int[] racuni, int[] racuniAprox) {
     	
		for(int i = 0; i< racuni.length; i++) {
			if(racuni[i] >= 0 && racuni[i] < 501) {
				racuniAprox[i] = 0;
			}
			else if (racuni[i] > 500 && racuni[i] < 1501) {
				racuniAprox[i] = 1000;
            } else if (racuni[i] > 1500 && racuni[i] < 2501) {
            	racuniAprox[i] = 2000;
            } else if (racuni[i] > 2500 && racuni[i] < 3501) {
            	racuniAprox[i] = 3000;
            } else if (racuni[i] > 3500 && racuni[i] < 4001) {
            	racuniAprox[i] = 4000;
            } else if (racuni[i] > 4000) {
            	racuniAprox[i] = 4500;
            }
		}
        return racuniAprox;
    }
	
	
	 public static void printGraf(int[] racuniAprox) {
	        int[] graf = { 5000, 4500, 4000, 3500, 3000, 2500, 2000, 1500, 1000, 500, 0 };
	        for (int i = 0; i < graf.length; i++) {
	            if (graf[i] % 500 == 0 && graf[i] % 1000 == 0) {
	                System.out.printf("%4s |", graf[i]);
	            
	            }
	            else
	                System.out.printf("     |");
	            for (int j = 0; j < 12; j++) {
	                if (racuniAprox[j] == graf[i]) {
	                    System.out.print(" x ");
	                } else {
	                    System.out.print("   ");
	                }

	            }

	            System.out.println();
	        }
	        System.out.println("      -- -- -- -- -- -- -- -- -- -- -- --");
	        System.out.println("       1  2  3  4  5  6  7  8  9 10 11 12");
	    }

}
