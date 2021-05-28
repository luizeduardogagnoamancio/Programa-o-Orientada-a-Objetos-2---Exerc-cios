package telefonia;

public class FabricaTim extends FabricaAbstrataEnvios
{

	@Override
	public Cobranca criaCobranca() 
	{
		// TODO Auto-generated method stub
		return new CobrancaTim();
	}

	@Override
	public EnvioSMS criaEnvioSMS() 
	{
		// TODO Auto-generated method stub
		return new EnvioSMSTim("assincrono");
	}

}
