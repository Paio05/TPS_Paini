package provapila;

public class Pila {
	
	public static void main (String[] args) {
		
		Lista lista = new Lista();
		
		lista.aggiungiNodoInTesta(8);
		lista.aggiungiNodoInTesta(7);
		lista.aggiungiNodoInTesta(1);
		
		lista.stampaLista();
		
		lista.eliminaNodoInTesta();
		
		lista.stampaLista();
		
		
	}

}
