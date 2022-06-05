package hr.atos.praksa.lejlazepcan.zadatak14;

public class Zadatak14 {
	public static void main(String[] args) {
	   
		int rectangles = 150;
        double a = 3;
        double b = 2;
        double t1 = 0;
        double t2 = 3.14;
        

        Sinus sinus = new Sinus(a, b);
        Cosinus kosinus = new Cosinus(a, b);
        Tangens tangens = new Tangens(a, b);
        Cotangens kotangens = new Cotangens(a, b);

        Integral integral = new Integral(rectangles, t1, t2);

        integral.calculateIntegral(sinus);
        integral.calculateIntegral(kosinus);
        integral.calculateIntegral(tangens);
        integral.calculateIntegral(kotangens);
       
    }

	   }
	


	

