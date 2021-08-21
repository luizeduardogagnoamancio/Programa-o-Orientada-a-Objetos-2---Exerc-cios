package padrao.composite;

import java.util.ArrayList;

public class Pasta implements IArquivo{
	public String nome;
	ArrayList<IArquivo> listaDeArquivos;
	
	
	public void printNomeDoArquivo()
	{
		System.out.println(this.nome);
	}
	
	public void adicionarArquivo(IArquivo novoArquivo)
	{
		this.listaDeArquivos.add(novoArquivo);
	}
	
	public void removerArquivo(int index)
	{
		this.listaDeArquivos.remove(index);
	}
	public void getArquivo(int index)
	{
		this.listaDeArquivos.get(index);
	}
}
