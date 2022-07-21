package arbol;

public class Arbol {

private NodoArbol raiz;
	
	public Arbol ()
	{
		raiz = null;
	}
	
	//almacena el nuevo elemento en el arbol.
	public void insertar(ElementoComparable e)
	{
		if (raiz == null)
		{
			NodoArbol nuevo = new NodoArbol (e);
			this.raiz = nuevo;
		}
		else 
		{
			insertar(this.raiz , e);
		}
	}
	
	private void insertar(NodoArbol nodo, ElementoComparable e) 
	{
		if (e.menorQue( nodo.getElemento()))
		{
			if (nodo.getHijo_izquierdo() != null)
			{
				this.insertar(nodo.getHijo_izquierdo(), e);
			}
			else
			{
				NodoArbol nuevo = new NodoArbol (e);
				nodo.setHijo_izquierdo(nuevo);
			}
		}
		
		else
		{
			if (nodo.getHijo_derecho() != null)
			{
				this.insertar(nodo.getHijo_derecho(), e);
			}
			else
			{
				NodoArbol nuevo = new NodoArbol (e);
				nodo.setHijo_derecho(nuevo);
			}
		}
	}

	//que imprime por pantalla los elementos almacenados en la estructura del arbol realizando un recorrido pre-orden.
	public void recorrerPreOrden(NodoArbol raiz)
	{
		if (raiz != null)
		{
			tratar (raiz);
			recorrerPreOrden(raiz.getHijo_izquierdo());
			recorrerPreOrden(raiz.getHijo_derecho());
		}
	}
	
	//imprime por pantalla los elementos almacenados en la estructura del arbol realizando un recorrido in-orden.
	public void recorrerInOrden(NodoArbol raiz)
	{
		if (raiz != null)
		{
		recorrerInOrden(raiz.getHijo_izquierdo());
		//tratar (raiz);
		recorrerInOrden(raiz.getHijo_derecho());
		}
	}
	
	//imprime por pantalla los elementos almacenados en la estructura del arbol realizando un recorrido post-orden.
	public void recorrerPostOrden(NodoArbol raiz)
	{
		if (raiz != null)
		{
		recorrerPostOrden(raiz.getHijo_izquierdo());
		recorrerPostOrden(raiz.getHijo_derecho());
		tratar (raiz);
		}
	}
	
	private void tratar(NodoArbol raiz2) {
		// TODO Auto-generated method stub
		
	}

	//devuelve la profundidad del arbol, es decir, la longitud del camino mas largo que conecta la raz a una hoja.
	public int profundidad()
	{
		return 0;
	}
	
	//devuelve el balance o equilibrio del arbol, es decir, la diferencia en altura entre los subarboles derecho e izquierdo
	//desde la raz.
	public int factorDeEquilibrio()
	{
		return 0;
	}
	
	//toma como parametro un elemento y devuelve si el elemento se almacena en la lista.
	public boolean buscar(ElementoComparable e)
	{
		NodoArbol aux= raiz;
		
		while(aux.getElemento() != e)
		{
			if(e.menorQue(aux.getElemento()))
				{
				 aux = aux.getHijo_izquierdo();
				}
			else
			{
				aux = aux.getHijo_derecho();
			}
			if(aux == null)
			{
				return false;
			}
		}
		return true;
	}

	public boolean estaVacio()
	{
		return raiz == null;
	}
	public NodoArbol getRaiz() {
		return raiz;
	}

	public void setRaiz(NodoArbol raiz) {
		this.raiz = raiz;
	}
	
	//devuelve el mnimo elemento del arbol.
	/*public ElementoComparable minimo()
	{
		
	}
	
	//devuelve el maximo elemento del arbol.
	public ElementoComparable maximo()
	{
	
	} */
}
