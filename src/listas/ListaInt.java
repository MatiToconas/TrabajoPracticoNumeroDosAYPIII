package listas;

import pilas.NodoInt;

public class ListaInt {
	
	private NodoInt primero;
//	private NodoInt ultimo;
	int nodos;
	
	public ListaInt()
	{
		primero = null;
//		ultimo = null;
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
	
	
	public int suma()
	{
		NodoInt aux = new NodoInt();
		aux = primero;
		int suma=0;
		
		if(estaVacia())
		{
			return 0;
		}
		while(aux != null)
		{
			suma += aux.getElemento();
			aux = aux.getSiguiente();	
		}
		return suma;
	}
	
	public double promedio()
	{
		if(estaVacia()) {
			return (double) 0;
		}
		else {
			double resultado=(double)suma()/nodos;
			return resultado;
		}
		
	}
	
/*	public int iesimo(int i)
	{
		NodoInt indice = this.primero;
		
		if(i < 0)
		{
			return 0;
		}
		
		for(int j=1; (j<i) && (indice!=null); j++)
		{
			indice = indice.getSiguiente();
		}
	return indice.getSiguiente().getElemento(); 
	}
*/	
	public int iesimo(int pos) {
		int resultado=0;
		if(pos>=0 && pos<nodos) {
			resultado=NodoaBuscar(pos);
		}
		return resultado;
	}
	
	public boolean buscar(int n)
	{
		if(estaVacia()) {
			return false;
		}
		else if (primero.getElemento() == n) {
			return true;
		}
		else
		{
		NodoInt aux=new NodoInt();
			aux=primero;
			while(aux.getSiguiente()!=null) {
				if(n==aux.getElemento()) {
					return true;
				}
				aux=aux.getSiguiente();
			}
		}
	    return false;
	}
	
	public int NodoaBuscar(int pos) {
		NodoInt aux=new NodoInt();
		aux=primero;
		int i=0;
		int elementoBuscado=0;
		while(aux!=null) {
		if(i==pos) {
		return elementoBuscado=aux.getElemento();
		}
		aux=aux.getSiguiente();
		i++;
		}
		return elementoBuscado;
	}
	
	public int maximo()
	{
		NodoInt aux = this.primero;
		int mayorElemento = this.primero.getElemento();
		
		while(aux != null)
		{
			if(aux.getElemento() > mayorElemento)
			{
				mayorElemento = aux.getElemento();
			}
			else
			{
				aux = aux.getSiguiente();
			}
		}
		return mayorElemento;
	}
	
	public boolean estaOrdenada()
	{
		if(estaVacia()) {
			return true;
		}
		NodoInt aux=new NodoInt();
		aux=primero;
		while(aux.getSiguiente()!=null) {
			if(aux.getElemento()>aux.getSiguiente().getElemento())
				return false;
			aux=aux.getSiguiente();
		}
		return true;
	}
	
	public void ordenar()
	{
	if(estaVacia()|| nodos==1 || estaOrdenada()) {
		return;
	}
	else {
		NodoInt aux=primero;
		NodoInt aux2=primero;
		while(aux!=null) {
			while(aux2!=null) {
				if(aux.getElemento()<aux2.getElemento() ) {
					int e=aux2.getElemento();
					aux2.setElemento(aux.getElemento());
					aux.setElemento(e);
					}
			   aux2=aux2.getSiguiente();
			}
			aux2=primero;
			aux=aux.getSiguiente();
		}
	}
	}	
	
	public void rotarDerecha() {
		if(estaVacia() || nodos==1) {
			return;
		}
		else {
			NodoInt aux=primero;
			while(aux.getSiguiente()!=null) {
				aux=aux.getSiguiente();
			}
			int temp=aux.getElemento();
			aux.setElemento(primero.getElemento());
			primero.setElemento(temp);
		}
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
	
	public boolean posCorrecta(int k) {
		return(k>=0 && k<nodos);
	}
	
	public void insertarOrdenado(int e) {
		if(estaVacia()) {
			agregarAdelante(e);
		}
		else if(primero.getElemento()>e) {
			agregarAdelante(e);
		}
		else {
			NodoInt nuevo=new NodoInt();
			nuevo.setElemento(e);
			NodoInt aux=primero;
			while(aux.getSiguiente()!=null && aux.getSiguiente().getElemento()<nuevo.getElemento()) {
				aux=aux.getSiguiente();
			}
			if(aux.getSiguiente()!=null) {
				nuevo.setSiguiente(aux.getSiguiente());
				aux.setSiguiente(nuevo);
			}
			else {
				AgregarAtras(e);
			}
		}
	}
	
	public static void intercambiarColas(ListaInt l1, int pos1, ListaInt l2, int pos2) {
		int i=0;
		int j=0;
		
		NodoInt aux=l1.primero;
		
		while(i!=pos1-1) {
			aux=aux.getSiguiente();
			//aux2=aux2.getSiguiente();
			i++;
		}
		NodoInt aux2=aux.getSiguiente();
	
		NodoInt aux3=l2.primero;
		while(j!=pos2) {
			aux3=aux3.getSiguiente();
		    j++;
		}
		aux.setSiguiente(aux3);
		l2.primero.getSiguiente().setSiguiente(aux2);
		//aux2.setSiguiente(siguiente);
	}
	
/*	public ListaInt buscarTodos(int n)
	{
		ListaInt nuevo = null;
		NodoInt aux = new NodoInt();
		aux = primero;
		
		if(estaVacia())
		{
			return null;
		}
		
		while(aux != null)
		{
			
		}
	}*/
}
