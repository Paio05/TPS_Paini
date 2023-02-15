package scuola.polofermigiorgi;

public class Persona
{
    // instance variables - replace the example below with your own
    private String cognome;
    private String nome;
    private String codiceFiscale;

    
    public Persona(String nome, String cognome, String codiceFiscale)
    {
        // initialise instance variables
        this.nome=nome;
        this.cognome=cognome;
        this.codiceFiscale=codiceFiscale;
    }

    
    public void setCognome()
    {
        // put your code here
        this.cognome=cognome;
    }
    
    public void setNome()
    {
        // put your code here
        this.nome=nome;
    }
    
    public void setCodiceFiscale()
    {
        // put your code here
        this.codiceFiscale=codiceFiscale;
    }
    
    public String getCodiceFiscale()
    {
        // put your code here
        return codiceFiscale;
    }
    
    public String getCognome()
    {
        // put your code here
        return cognome;
    }
    
    public String getNome()
    {
        // put your code here
        return nome;
    }
    
    public void stampaInfo()
    {
        // put your code here
        System.out.println("nome: " + nome + "/n cognome: " + cognome + "/n codice fiscale: " + codiceFiscale);
        
    }
    

}