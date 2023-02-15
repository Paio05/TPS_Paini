package scuola.polofermigiorgi;



public class Docente extends Persona
{
    // instance variables - replace the example below with your own
    private String materiaInsegnante;

    
    public Docente(String nome, String cognome, String codiceFiscale, String materiaInsegnante)
    {
        // initialise instance variables
       super(nome, cognome, codiceFiscale);
       this.materiaInsegnante=materiaInsegnante;
    }

    public void setMateriaInsegnante()
    {
        // put your code here
        this.materiaInsegnante=materiaInsegnante;
    }
    
    public String getMateriaInsegnante(String materiaInsegnante)
    {
        // put your code here
        return materiaInsegnante;
    }
    
    public void stampaInfo()
    {
     System.out.println(super.getNome());
     System.out.println(super.getCognome());
     System.out.println(super.getCodiceFiscale());
     System.out.println(materiaInsegnante);
    }
}
