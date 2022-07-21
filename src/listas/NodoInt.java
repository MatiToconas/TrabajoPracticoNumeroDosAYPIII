package listas;

public class NodoInt {
	private int elemento;
	private NodoInt siguiente;
	
/*	public NodoInt(int elemento, NodoInt siguiente)
	{
		this.elemento = elemento;
		this.siguiente = siguiente;
	}
*/
	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}

	public NodoInt getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(NodoInt siguiente) {
		this.siguiente = siguiente;
	}	
}
