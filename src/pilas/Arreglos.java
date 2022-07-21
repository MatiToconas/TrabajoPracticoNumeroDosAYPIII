package pilas;

public class Arreglos {
	
	public static boolean esSinRepetidos(int[] arr)
	{
		int elemento=0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			elemento = arr[i];
		}
			for(int j=0; j<=arr.length-1; j++)
			{
				if(arr[j] == elemento)
				return false;
			}
		return true;
	}
	
	public static int[] pegar(int[] arr, int[] arr2)
	{
		int[] nuevoArreglo1 = new int[arr.length+arr2.length];
		
		for(int i=0; i<arr.length; i++)
		{
			nuevoArreglo1[i] = arr[i];
		}
			for(int j=arr.length; j<arr.length+arr2.length; j++)
			{
				nuevoArreglo1[j] = arr2[j-arr2.length];
			}
		return nuevoArreglo1;
	}
	
	public static int[] agregarAlFinal(int[] arr, int elem)
	{
		int[] nuevoArreglo2 = new int[arr.length+1];
		
		for(int i=0; i<arr.length; i++)
		{
			nuevoArreglo2[i] = arr[i];
		}
		nuevoArreglo2[nuevoArreglo2.length-1]= elem;
		
	return nuevoArreglo2;
	}
	
	public static int[] sinRepetidos(int[] arr)
	{
		int elemento=0;
		int[] nuevoArreglo3 = new int[arr.length];
		
		for(int i=0; i<=arr.length-1; i++)
		{ 
			elemento = arr[i];
		}	
			for(int j=0; j<arr.length; j++)
			{
				if(elemento != arr[j])
				{
					nuevoArreglo3[j]=elemento;
				}
			}
		return nuevoArreglo3;
	}	
	
	public static void invertir(int[] arr)
	{
	    int [] invertir = new int [arr.length];
        int aux = arr.length;
 
        for (int i = 0; i<arr.length; i++) 
        {
            invertir[aux - 1] = arr[i];
            System.out.print(aux--+", ");
        }
		
	}
	
	public static void imprimir (int[] arr)
	{
		for (int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ ", ");
		}
	}
}
