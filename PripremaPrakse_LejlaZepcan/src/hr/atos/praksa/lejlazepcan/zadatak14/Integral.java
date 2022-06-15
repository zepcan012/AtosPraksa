package hr.atos.praksa.lejlazepcan.zadatak14;

public class Integral {

	
	    int rectangles;
	    double t1;
	    double t2;

	   public Integral(int rectangles, double t1, double t2) {
	        this.rectangles = rectangles;
	        this.t1 = t1;
	        this.t2 = t2;
	    }

	    public void calculateIntegral(TrigFunction trigFunkcija) {
	        
	        
	        double function = 0;
	        double sum = 0;
	        
	        double x = 0;
	        
	        double rectangleWidth = 0;
	        double t = t2 - t1;
	        rectangleWidth = t / rectangles;
	        
	        double solution = 0;
	        
	      
	        
	        for(int i = 0; i < rectangles; i++) {
	            x = t1 + rectangleWidth * i;
	            if(trigFunkcija.name == "sinus") {
	            	function = trigFunkcija.a * Math.sin(x) + trigFunkcija.b;
	            }
	            if(trigFunkcija.name == "kosinus") {
	            	function = trigFunkcija.a * Math.cos(x) + trigFunkcija.b;
	            }
	            if(trigFunkcija.name == "tangens") {
	            	function = trigFunkcija.a * Math.tan(x) + trigFunkcija.b;
	            }
	            if(trigFunkcija.name == "kotagens") {
	            	function = trigFunkcija.a * Math.cos(x) / Math.sin(x) + trigFunkcija.b;
	            }
	            
	            sum += function;
	        }
	        solution = sum * rectangleWidth;
	        System.out.println("Povrsina s " + trigFunkcija.name + "om je: " + solution);
	            
	        
	    }
	

	

	
}



