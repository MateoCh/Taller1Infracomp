import java.util.concurrent.TimeUnit;

public class ContadorThreads extends Thread 
{
	private static int contador=0;
	private static int nombre;
	
	public ContadorThreads(int pNombre)
	{
		nombre=pNombre;
	}
	
	public static synchronized void aumentar()
	{
		for(int i=0; i<10000;i++)
		{
			contador++;
		}
//		System.out.println(nombre+"-"+contador);
	}
	
	public void run()
	{
		aumentar();
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		ContadorThreads[] t= new ContadorThreads[1000];
		
		for(int i=0; i<t.length;i++)
		{
			t[i]=new ContadorThreads(i);
			t[i].start();
		}
		while(contador!=10000000)
		{
			System.out.println(contador);
		}
		System.out.println(contador);
	
	}
}
