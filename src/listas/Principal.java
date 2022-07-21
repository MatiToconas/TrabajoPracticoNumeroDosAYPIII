package listas;

public class Principal {

	public static void main(String[] args) 
	{
		NodoInt nodo1 = new NodoInt();
		NodoInt nodo2 = new NodoInt();
		NodoInt nodo3 = new NodoInt();
		
		nodo1.setSiguiente(nodo2);
		nodo2.setSiguiente(nodo3);
		nodo3.setSiguiente(null);
		
		ListaInt lst = new ListaInt();
		
		lst.imprimir();
		lst.agregarAdelante(4);
		lst.imprimir();
		lst.agregarAdelante(6);
		lst.imprimir();
		lst.agregarAdelante(8);
		lst.imprimir();
		lst.agregarAdelante(10);
		lst.imprimir();
		
		System.out.println("");
		
		int largoLista;
		largoLista=lst.largo();
		System.out.println("El largo de la lista es: "+largoLista);
		
		if(lst.estaVacia())
		{
			System.out.println("La lista esta vacia");
		}
		else
		{
			System.out.println("La lista no esta vacia");
		}
		
		int posicion;
		posicion = lst.iesimo(2);
		System.out.println("El elemento que se encuentra en la posicion seleccionada [2] es: "+posicion);
		lst.imprimir();
		
		System.out.println("La suma de la lista es: "+lst.suma());
		
		System.out.println("El promedio de la lista es: " +lst.promedio());
		
		if(lst.buscar(7))
		{
			System.out.println("El elemento se encuentra en la lista");
		}
		else
		{
			System.out.println("El elemento no se encuentra en la lista");
		}
		
		int maximo;
		maximo = lst.maximo();
		System.out.println("El maximo elemento de la lista es: "+maximo);
		
		if(lst.estaOrdenada())
		{
			System.out.println("La lista esta ordenada de menor a mayor");
		}
		else
		{
			System.out.println("La lista no esta ordenada de menor a mayor");
		}
		
		System.out.println("Lista ordenada de menor a mayor");
		lst.ordenar();
		lst.imprimir();
		
		System.out.println("Metodo rotar derecha");
		lst.rotarDerecha();
		lst.imprimir();
		
		System.out.println("Metodo agregar en posicion");
		lst.agregarEnPosicion(2, 5);
		lst.imprimir();
		
		System.out.println("Metodo insertar ordenado");
		lst.insertarOrdenado(1);
		lst.imprimir();
		
		System.out.println("Nueva lista 1");
		ListaInt lista1 = new ListaInt();
		
		lista1.imprimir();
		lista1.agregarAdelante(3);
		lista1.imprimir();
		lista1.agregarAdelante(2);
		lista1.imprimir();
		lista1.agregarAdelante(9);
		lista1.imprimir();
		lista1.agregarAdelante(8);
		lista1.imprimir();
		
		System.out.println("Nueva lista 2");
		ListaInt lista2 = new ListaInt();
		
		lista2.imprimir();
		lista2.agregarAdelante(4);
		lista2.imprimir();
		lista2.agregarAdelante(5);
		lista2.imprimir();
		lista2.agregarAdelante(7);
		lista2.imprimir();
		lista2.agregarAdelante(1);
		lista2.imprimir();
		
		System.out.println("Mostrando ambas listas");
		lista1.imprimir();
		lista2.imprimir();
		
		System.out.println("Metodo intercambiar colas");
		ListaInt.intercambiarColas(lista1, 2, lista2, 2);
		lista1.imprimir();
		lista2.imprimir();
	}
}