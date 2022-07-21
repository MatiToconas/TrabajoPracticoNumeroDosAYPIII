package pilas;

public class PilaIntConListaEnlazada implements PilaInt{

	private ListaInt lista;

	public PilaIntConListaEnlazada()
	{
		this.lista = new ListaInt();
	}
	
	public void apilar(int n) 
	{
		this.lista.AgregarAtras(n);
	}

	public void desapilar() 
	{
		this.lista.quitarAtras();
	}

	public boolean estaVacia()
	{
		return (this.lista.largo() == 0);
	}

	public int tope() 
	{
		if(this.estaVacia())
		{
			System.out.println("La pila esta vacia");
		}
		return this.lista.obtenerAtras();
	}
}
