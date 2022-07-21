package pilas;

public class ListaInt {
	
	private NodoInt primero;
	private NodoInt ultimo;
	int nodos;
	
	public ListaInt()
	{
		primero = null;
		ultimo = null;
		nodos = 0;
	}
	
	public int largo()
	{
		return nodos;
	}
	
	public boolean estaVacia()
	{
		return primero == null;
	}
	
	public void agregarAdelante(int e)
	{
		NodoInt nuevo = new NodoInt();
		nuevo.setElemento(e);
		nuevo.setSiguiente(this.primero);
		this.primero = nuevo;
		nodos++;
	}
	
	public void AgregarAtras(int valor) {
		NodoInt nodo=new NodoInt();
		nodo.setElemento(valor);
		if(estaVacia()) {
			primero=nodo;
		}
		else {
			NodoInt aux=new NodoInt();
			aux=primero;
			while(aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
			}
			aux.setSiguiente(nodo);
		}
		nodos++;
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
	
	public void agregarEnPosicion(int pos, int e) {
		if(estaVacia() || !posCorrecta(pos)) {
			return;
		}
		else if(pos==0) {
			agregarAdelante(e);
		}
		else if(pos==nodos) {
			AgregarAtras(e);
		}
		else {
			
			int i=0;
			NodoInt nuevo=new NodoInt();
			nuevo.setElemento(e);
			NodoInt aux=primero;
			while(i!=pos-1) {
				aux=aux.getSiguiente();
				i++;
			}
			/*System.out.println(aux.getElemento());
			NodoInt siguiente=aux.getSiguiente();
			aux.setSiguiente(nuevo);
			nuevo.setSiguiente(siguiente);*/
			nuevo.setSiguiente(aux.getSiguiente());
			aux.setSiguiente(nuevo);
		}
	}
	
	public void quitarPrimero() {
		if(!estaVacia())
		primero=primero.getSiguiente();
	}
	
	public int quitarAtras()
	{
		int elemento=ultimo.getElemento();
		
		if(primero==ultimo)
		{
			primero=ultimo=null;
		}
		else
		{
			NodoInt aux=primero;
			while(aux.getSiguiente() != ultimo)
			{
				aux=aux.getSiguiente();
			}
			ultimo=aux;	
			ultimo.setSiguiente(null);
		}
		return elemento;
	}
	
	public int obtenerAtras()
	{
		int elemento=ultimo.getElemento();
		
		if(primero==ultimo)
		{
			primero=ultimo=null;
		}
		else
		{
			NodoInt aux=primero;
			while(aux.getSiguiente() != ultimo)
			{
				aux=aux.getSiguiente();
			}
			ultimo=aux;
		}
		return elemento;
	}
	
	public void eliminar(int i) {
		if(estaVacia()) {
			 return;
		 }
		else if (primero.getElemento() == i) {
	         primero = primero.getSiguiente();
	    } else{
	        NodoInt aux = primero;
	        while(aux.getSiguiente().getElemento() != i){
	            aux = aux.getSiguiente();
	        }
	        aux.setSiguiente(aux.getSiguiente().getSiguiente());  
	    }
	    nodos--;
	}
	
	public void eliminarPorPos(int pos) {
		if(!posCorrecta(pos)) {
			return;
		}

	     else if (pos==0) {
			  primero = primero.getSiguiente();
			  nodos--;
		     }
		else {
			NodoInt aux=primero;
			int i=0;
			while(i!=pos-1) {
				aux=aux.getSiguiente();
				i++;
			}
			aux.setSiguiente(aux.getSiguiente().getSiguiente());
			
			nodos--;
		}		
	}
	
	public boolean posCorrecta(int k) {
		return(k>=0 && k<nodos);
	}
}
