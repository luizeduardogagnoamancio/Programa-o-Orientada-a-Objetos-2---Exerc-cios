package observer;

public class Main {
	public static void main(String[] args)
	{
		CaixaEntradaGrupo caixa = new CaixaEntradaGrupo();
		Observer ob = new Observer();
		caixa.addObserver(ob);
		caixa.setNovaMensagem("Teste");
	}
}
