package pilas;

public interface PilaInt {

	public void apilar(int n);
	//que apila el entero n en la pila
	
	public void desapilar();
	//que desapila el ultimo entero almacenado [Requiere: !estaVacia()]
	
	public boolean estaVacia();
	//que indica si la pila se encuentra vaca o no
	
	public int tope();
	//que devuelve el ultimo entero almacenado [Requiere: !estaVacia()]
}
