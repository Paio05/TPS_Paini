package scuola.polofermigiorgi;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona d1 = new Docente ("Daniele", "Lombardo", "LM1DN100Z00Z123W", "informatica");
		d1.stampaInfo();
		Persona d2 = new Docente ("Luciano", "Carlotti", "CR1LN200Z00Z456W", "Informatica");
		d2.stampaInfo();
		Persona s1 = new Studente ("Enrico", "Fermi", "FR9EN900Q00S654P", "4BIF");
		s1.stampaInfo();
		Persona s2 = new Studente ("Giovanni", "Giorgi", "GR5GV501R00F321J", "4BIF");
		s2.stampaInfo();
		Persona s3 = new Studente ("Sandro", "Pertini", "PT3SD201C00G963H", "4BIF");
		s3.stampaInfo();
		
	}

}
