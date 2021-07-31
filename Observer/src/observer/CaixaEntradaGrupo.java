package observer;

public class CaixaEntradaGrupo extends Observable{
	private String mensagem;
	
	void setNovaMensagem(String mensagem)
	{
		this.mensagem = mensagem;
		this.notifyObserver();
	}
	
	public String getMensagem()
	{
		return mensagem;
	}

}
