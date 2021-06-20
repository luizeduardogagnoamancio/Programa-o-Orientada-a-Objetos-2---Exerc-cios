package padrao.singleton.telefone;



public class CellphoneNumberGenerator 
{
	
	private int count = 999990101; 
	
	private static CellphoneNumberGenerator instance;
	
	
	
	
	public synchronized static CellphoneNumberGenerator getInstance()
	{
		if (instance == null)
		{
			instance = new CellphoneNumberGenerator();
		}
		return instance;
		
	}
	
	private CellphoneNumberGenerator() {};
	
	public synchronized int getNextSerial()
	{
		return ++count;
		
	}
}
