package hr.atos.praksa.lejlazepcan.zadatak11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Zadatak11 {

	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("Odaberi jedan od ponudenih jezika: ");
		System.out.print("1. Engleski \n2. Njemacki\n3. Turski\n");
		
		menu = input.nextInt();
		input.close();
		
		switch(menu) {
		case 1:
			Properties english = new Properties();
				
			english.load(new FileInputStream("C:\\Users\\Korisnik\\eclipse-workspace\\PripremaPrakse_LejlaZepcan\\src\\hr\\atos\\praksa\\lejlazepcan\\zadatak11\\En.properties"));
			
			System.out.println(english.getProperty("Pozdrav"));
            System.out.println(english.getProperty("Dobrodosli"));
            System.out.println(english.getProperty("Dovidenja"));
			
            break;
            
		case 2:
			Properties german = new Properties();
			
			german.load(new FileInputStream("C:\\Users\\Korisnik\\eclipse-workspace\\PripremaPrakse_LejlaZepcan\\src\\hr\\atos\\praksa\\lejlazepcan\\zadatak11\\De.properties"));
			
			System.out.println(german.getProperty("Pozdrav"));
            System.out.println(german.getProperty("Dobrodosli"));
            System.out.println(german.getProperty("Dovidenja"));
            
            break;
            
		case 3:
			Properties turkish = new Properties();
			
			turkish.load(new FileInputStream("C:\\Users\\Korisnik\\eclipse-workspace\\PripremaPrakse_LejlaZepcan\\src\\hr\\atos\\praksa\\lejlazepcan\\zadatak11\\Tr.properties"));
			
            System.out.println(turkish.getProperty("Pozdrav"));
            System.out.println(turkish.getProperty("Dobrodosli"));
            System.out.println(turkish.getProperty("Dovidenja"));
            
            break;
		}
	}

}
