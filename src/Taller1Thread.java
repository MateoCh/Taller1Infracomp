import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Programa para el taller 1 usando clase que extiende de Thread
 * @author Mateo Chaparro 201730891
 */

public class Taller1Thread extends Thread 
{
	private int limite;
	private boolean odd;
	
	public Taller1Thread(int pLimite, boolean pOdd)
	{
		System.out.println("extendiendo de la clase Thread");
		odd=pOdd;
		limite=pLimite;
	}
	
	public void run()
	{
		try 
		{
			if(odd)
			{
				for(int i=1;i<limite;i=i+2)
				{
					System.out.println("Thread impar: " + i);
					Thread.sleep(50);
				}
			}
			else
			{
				for(int i=2;i<limite;i=i+2)
				{
					System.out.println("Thread par: " + i);
					Thread.sleep(50);
				}
			}
		}
		catch(Exception e){}
		
		System.out.println("Saliendo");
		
	}
	
	public static void main(String args[]) throws IOException
	{
		System.out.println("Al ingresar el limite tenga en cuenta que se imprimiran numeros estrictamente menores a el. ");
		System.out.println(" ");
		System.out.println("Ingrese el limite: ");
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int lim = Integer.parseInt(reader.readLine());
		
		Taller1Thread t1= new Taller1Thread(lim, false);
		Taller1Thread t2= new Taller1Thread(lim, true);
		
		t1.start();
		t2.start();
	}
	
}
