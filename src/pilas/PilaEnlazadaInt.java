package pilas;

import listas.NodoInt;

public class PilaEnlazadaInt implements PilaInt {

	private NodoInt primero;
	
	
	public PilaEnlazadaInt()
	{
		primero = null;
	}
	
	public NodoInt getPrimero() {
		return primero;
	}

	public void setPrimero(NodoInt primero) {
		this.primero = primero;
	}

	public void apilar(int n) 
	{
		NodoInt nuevo = new NodoInt();
		nuevo.setElemento(n);
		nuevo.setSiguiente(this.primero);
		this.primero = nuevo;
	}

	public void desapilar() {
		if(estaVacia())
		{
			System.out.println("La pila esta vacia");
		}
		primero = primero.getSiguiente();
	}

	public boolean estaVacia() {
		return primero == null;
	}


	public int tope() {
	
		if(estaVacia())
		{
			System.out.println("La pila esta vacia");
		}
		int aux = primero.getElemento();
		return aux; 
	}
	
	public void imprimir()
	{
		 System.out.print("[");
		 NodoInt n = this.primero;
		 while (n != null) 
		 {
		 System.out.print(n.getElemento() + " ");
		 n = n.getSiguiente();
		 }
		 System.out.println("]");
	}
}
