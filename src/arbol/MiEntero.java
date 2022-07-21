package arbol;

public class MiEntero implements ElementoComparable {

private int entero;
	
	public MiEntero(int entero)
	{
		this.entero = entero;	}
	
	public boolean igualQue(ElementoComparable otro) 
	{
	 	MiEntero otroEntero = (MiEntero) otro;
		return otroEntero.entero == this.entero;
	}

	public boolean menorQue(ElementoComparable otro) 
	{
		
		MiEntero otroEntero = (MiEntero) otro;
		return this.entero < otroEntero.entero;
	}

	public boolean menorIgualQue(ElementoComparable otro) 
	{
		MiEntero otroEntero = (MiEntero) otro;
		return this.entero <= otroEntero.entero;
	}

	public boolean mayorQue(ElementoComparable otro) 
	{
		MiEntero otroEntero = (MiEntero) otro;
		return this.entero > otroEntero.entero;
	}

	public boolean mayorIgualQue(ElementoComparable otro) 
	{
		MiEntero otroEntero = (MiEntero) otro;
		return this.entero >= otroEntero.entero;
	}
}
