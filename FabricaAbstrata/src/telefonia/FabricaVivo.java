package telefonia;

public class FabricaVivo extends FabricaAbstrataEnvios
{

	@Override
	public Cobranca criaCobranca() 
	{
		// TODO Auto-generated method stub
		return new CobrancaVivo();
	}

	@Override
	public EnvioSMS criaEnvioSMS() 
	{
		// TODO Auto-generated method stub
		return new EnvioSMSVivo("assincrono");
	}
	
}
