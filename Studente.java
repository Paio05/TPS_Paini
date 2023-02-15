package scuola.polofermigiorgi;

public class Studente extends Persona
{
    // instance variables - replace the example below with your own
    private String classeFrequentata;

    
    public Studente(String nome, String cognome, String codiceFiscale, String classeFrequentata)
    {
        // initialise instance variables
       super(nome, cognome, codiceFiscale);
       this.classeFrequentata=classeFrequentata;
    }

    public void setclasseFrequentata()
    {
        // put your code here
        this.classeFrequentata=classeFrequentata;
    }
    
    public String getclasseFrequentata(String classeFrequentata)
    {
        // put your code here
        return classeFrequentata;
    }
    
    public void stampaInfo()
    {
     System.out.println(super.getNome());
     System.out.println(super.getCognome());
     System.out.println(super.getCodiceFiscale());
     System.out.println(classeFrequentata);
    }
}
