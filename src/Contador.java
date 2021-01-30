
public class Contador 
{
	private static int contador=0;
	
	public synchronized static void aumentar()
	{
		for(int i=0; i<10000;i++)
		{
			contador++;
		}
		System.out.println(contador);
	}
	
	public static int getContador()
	{
		return contador;
	}
}
