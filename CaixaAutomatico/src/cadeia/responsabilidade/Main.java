package cadeia.responsabilidade;

public class Main 
{
	public static void main(String[] args) 
	{
		contaCedulas();
	}
	
	
	
	
	static void contaCedulas()
	{
		int valor = 125;
		int total = valor;
		int ced = 100;
		int totced = 0;
		
		while (true)
		{
			if (total >= ced)
			{
				total -= ced;
				totced += 1;
			}
			else
			{
				System.out.println("Total de " + totced + "cedulas de R$" + ced);
				if (ced == 50)
				{
					ced = 20;
				}
				else if (ced == 20)
				{
					ced = 10;
				}
				else if (ced == 10) 
				{
					ced = 5;
				}
				else if (ced == 5)
				{
					ced = 2;
				}
				if (total == 0) {
					break;
				}
			}
		}
		
	}
}
