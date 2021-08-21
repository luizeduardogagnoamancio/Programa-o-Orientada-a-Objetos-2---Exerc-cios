package padrao.composite;

public interface IArquivo {
	
	
	public void printNomeDoArquivo();
	
	public void adicionarArquivo(IArquivo novoArquivo);
	
	public void removerArquivo(int index);
	
	public void getArquivo(int index);
	
}
