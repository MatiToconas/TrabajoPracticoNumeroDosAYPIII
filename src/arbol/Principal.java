package arbol;

public class Principal {

	public static void main(String[] args) 
	{
		Arbol arbol = new Arbol();
		
		arbol.insertar(new MiEntero(10));
		arbol.insertar(new MiEntero(15));
		arbol.insertar(new MiEntero(8));

		if(!arbol.estaVacio())
		{
			arbol.recorrerInOrden(arbol.getRaiz());
		}
		else
		{
			System.out.println("El arbol esta vacio");
		}
		
		if(!arbol.estaVacio())
		{
			arbol.recorrerPostOrden(arbol.getRaiz());
		}
		else
		{
			System.out.println("El arbol esta vacio");
		}
	}
}
