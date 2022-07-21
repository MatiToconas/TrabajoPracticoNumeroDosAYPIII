package arbol;

public class NodoArbol {

	private ElementoComparable elemento;
	private NodoArbol hijo_izquierdo;
	private NodoArbol hijo_derecho;
	
	public NodoArbol(ElementoComparable e)
	{
		this.elemento = e;
		hijo_izquierdo = null;
		hijo_derecho = null;
	}

	public ElementoComparable getElemento() {
		return elemento;
	}
	public void setElemento(ElementoComparable elemento) {
		this.elemento = elemento;
	}
	public NodoArbol getHijo_izquierdo() {
		return hijo_izquierdo;
	}
	public void setHijo_izquierdo(NodoArbol nuevo) {
		this.hijo_izquierdo = nuevo;
	}
	public NodoArbol getHijo_derecho() {
		return hijo_derecho;
	}
	public void setHijo_derecho(NodoArbol nuevo) {
		this.hijo_derecho = nuevo;
	}
	
}
