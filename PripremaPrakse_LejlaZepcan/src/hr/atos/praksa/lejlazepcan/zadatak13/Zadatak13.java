package hr.atos.praksa.lejlazepcan.zadatak13;

public class Zadatak13 implements HeavyMetalBands {

	public static void main(String[] args) {

		Zadatak13 band = new Zadatak13();
		band.IronMaiden();
		band.Metallica();
		
		
		
	}

	@Override
	public void IronMaiden() {
		System.out.print("Top 3 greatest Iron Maiden songs:\n 1. The Trooper \n 2. Fear Of The Dark \n 3. Hallowed Be Thy Name\n ");
		
	}

	@Override
	public void Metallica() {
		System.out.print("\nTop 3 greatest Metallica songs:\n 1. Master Of Puppets \n 2. Nothing Else Matters \n 3. For Whom The Bell Tolls ");

		
	}

}
