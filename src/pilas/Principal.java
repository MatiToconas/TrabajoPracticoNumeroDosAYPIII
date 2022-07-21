package pilas;

public class Principal {

	public static void main(String[] args) {
	
		PilaEnlazadaInt pila = new PilaEnlazadaInt();
		
		pila.apilar(5);
		pila.imprimir();
		pila.apilar(4);
		pila.imprimir();
		pila.apilar(6);
		pila.imprimir();
		
	
		System.out.println("El ultimo elemento de la pila es: "+pila.tope()); 
		 
	    pila.desapilar();
	    pila.imprimir();
	    
	    System.out.println("El ultimo elemento de la pila es: "+pila.tope());
	    
	    pila.desapilar();
	    pila.imprimir();
	    
	    if(pila.estaVacia())
	    {
	    	System.out.println("La pila esta vacia");
	    }
	    else
	    {
	    	System.out.println("La pila no esta vacia");
	    }
	}

}
