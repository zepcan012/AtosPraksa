package hr.atos.praksa.lejlazepcan.zadatak15;

import java.util.Scanner;

public class Zadatak15 {

	public static void main(String[] args) {
	
		
		UserController user = new UserController();
		user.getUser();
		menu();
		
	}
	
	
	
	public static void menu() {
		Scanner input = new Scanner(System.in);
		
		int broj;
		System.out.println("\n\nUnesite odabir:");
		broj = input.nextInt();
		
		
		switch(broj) {
		case 1:
			
			ZaposlenikController emp1 = new ZaposlenikController();
			emp1.insertEmployee();
			
			ZadaciController zad1 = new ZadaciController();
			zad1.insertTask();
			
		    break; 
		  case 2:
			  
		    //System.out.println("Izlistavanje zaposlenika i zadataka:");
		    /*ZaposlenikController emp2 = new ZaposlenikController();
		    ZadaciController zad2 = new ZadaciController();
		    System.out.println("Zaposlenici:");
		    emp2.getAllEmployees();
		    System.out.println("\n\nZadaci:");
		    zad2.getAllTasks();*/
			JoinZaposlenikZadaciController get = new JoinZaposlenikZadaciController();
			get.getAllTables();
			 
		    
		    break;    
		  case 3:		    
		    
		    System.out.println("1. Izmjena Zaposlenika\n2. Izmjena Zadatka");
			int broj3 = input.nextInt();
			if(broj3 == 1) {
				ZaposlenikController emp3 = new ZaposlenikController();
			    emp3.updateEmployee();
			}
			else if(broj3 == 2) {
				ZadaciController zad3 = new ZadaciController();
				zad3.updateTask();
			}
			else {
				System.out.println("Krivi unos!");
				UserController user = new UserController();
				user.getUser();
				menu();
			}
		    
		    break;    
		  case 4:
		    //System.out.println("Brisanje zaposlenika i zadataka:");
		    
		    System.out.println("1. Brisanje Zaposlenika\n2. Brisanje Zadatka");
			int broj4 = input.nextInt();
			if(broj4 == 1) {
				ZaposlenikController emp4 = new ZaposlenikController();
			    emp4.deleteEmployee();
			}
			else if(broj4 == 2) {
				ZadaciController zad4 = new ZadaciController();
				zad4.deleteTask();
			}
			else {
				System.out.println("Krivi unos!");
				UserController user = new UserController();
				user.getUser();
				menu();
			}
			
			
		    break;    
		  case 5:
			  
		    System.exit(0);
		    
		    break;
		  default: 
			  System.out.println("Nepostojeci izbor!");
			  
			  UserController user = new UserController();
				user.getUser();
			  menu();
		    	
		}
		
	}
	

}
