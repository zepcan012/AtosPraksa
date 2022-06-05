package hr.atos.praksa.lejlazepcan.zadatak10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak10 {

	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			
            ArrayList<String> phraseList = new ArrayList<>();
            String path;
            String phrase;
            
            System.out.println("Unesi putanju direktorija:");
            path = scanner.nextLine();
            
            System.out.println("Unesi frazu za pretrazivanje:");
            phrase = scanner.nextLine();
            
            scanner.close();

            File dir = new File(path);
            
            if(!dir.exists()) {
                System.out.println("Direktorij ne postoji!");
                System.exit(0);
            } 

            File[] files = dir.listFiles();
            for(File file : files) {
                if (file.isFile() && file.getName().contains(".csv") || file.getName().contains(".txt")) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        if(reader.readLine().contains(phrase)) {
                            phraseList.add(file.getName());
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            
            System.out.println("U direktoriju je pronadena fraza:" + phraseList.toString());
        }


    }



