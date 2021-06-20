package padrao.singleton.telefone;



public class Main 
{
	public static void main(String[] args)
	{
		System.out.println("Using traditional Singleton");
		CellphoneNumberGenerator generator = CellphoneNumberGenerator.getInstance();
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		System.out.println("next serial: " + generator.getNextSerial());
		
	}
}
