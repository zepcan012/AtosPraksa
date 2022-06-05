package hr.atos.praksa.lejlazepcan.zadatak12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Zadatak12 {

	public static void main(String[] args) throws FileNotFoundException {
        	File file = new File("C:\\Users\\Korisnik\\eclipse-workspace\\PripremaPrakse_LejlaZepcan\\src\\hr\\atos\\praksa\\lejlazepcan\\zadatak12\\words.txt");
         	Scanner scanner = new Scanner(file); 
         	
            ArrayList<String> allWords = new ArrayList<>();
            
            while (scanner.hasNext()) {
                allWords.add(scanner.next());
            }
            scanner.close();
            
            Collections.sort(allWords);
            List<String> differentWords = allWords.stream().distinct().collect(Collectors.toList());
            
            System.out.println("U datoteci " + file.getName() + " nalaze se sljedece rijeci:");
            System.out.println("------------------------ \nRijec (broj ponavljanja) \n------------------------");
            
            for (String word : differentWords) {
                int counter = 0;
                for (String words : allWords) {
                    if (word.equals(words)) {
                        counter++;
                    }
                }
                System.out.println(word + " (" + counter + ")");
            }
            
            System.out.println("------------------------");
        


	}

}
