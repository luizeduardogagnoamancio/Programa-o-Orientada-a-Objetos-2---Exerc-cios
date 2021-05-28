package telefonia;

public class EnvioSMSTim implements EnvioSMS
{

	public EnvioSMSTim(String comunicacao) 
	{
		// TODO Auto-generated constructor stub
		//Configuracao de comunicacao da tim
	}

	@Override
	public boolean enviar(Mensagem mensagem, int telefone) 
	{
		System.out.println("Sua mensagem: '"+ mensagem.texto + "' enviada para o número " + telefone);
		return true;
	}

}
