package telefonia;

import javax.swing.JOptionPane;

public class Main 
{
	public static void main(String[] args) 
	{
		String escolha = JOptionPane.showInputDialog("Tim ou Vivo?");
		int telefone = Integer.parseInt(JOptionPane.showInputDialog("Telefone: "));
		String texto = JOptionPane.showInputDialog("Mensagem");
		Mensagem msg = new Mensagem(texto);
		FabricaAbstrataEnvios fabrica = null;
		if (escolha.equalsIgnoreCase("tim")) 
		{
			fabrica = new FabricaTim();
		}else if (escolha.equalsIgnoreCase("vivo"))
		{
			fabrica = new FabricaVivo();
		}
		EnvioSMS envio = fabrica.criaEnvioSMS();
		if (envio.enviar(msg, telefone))
		{
			Cobranca cobranca = fabrica.criaCobranca();
			cobranca.cobrar(telefone);
		}
		
	}
}
