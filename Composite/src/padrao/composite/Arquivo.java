package padrao.composite;

public class Arquivo implements IArquivo{
	public String nome;
	@Override
	public void printNomeDoArquivo() {
		// TODO Auto-generated method stub
		System.out.println(this.nome);
	}

	@Override
	public void adicionarArquivo(IArquivo novoArquivo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerArquivo(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getArquivo(int index) {
		// TODO Auto-generated method stub
		
	}

}
