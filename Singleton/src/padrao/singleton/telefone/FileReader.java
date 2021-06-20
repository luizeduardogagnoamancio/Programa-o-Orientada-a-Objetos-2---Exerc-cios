package padrao.singleton.telefone;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReader 
{
	private File file;
	private FileWriter fileWriter;
	private Scanner scanner;
	private static int number;
	
	public FileReader()
	{
		
	}
	
	
	
	public static int readNumber() throws FileNotFoundException
	{
		File file = new File("D:\\BSI\\SextoPeriodo\\DOO\\ExerciciosPOO2\\Singleton\\numbers.txt");
		Scanner scanner = null;
		scanner = new Scanner(file);
		while (scanner.hasNextLine())
		{
			number = Integer.parseInt(scanner.nextLine());
		}
		return number;
		
	}
	
	
	
	public static void writeNumber(int n) throws IOException
	{
		Integer i = n;
		i.toString();
		FileWriter fileWriter = null;
		fileWriter = new FileWriter("D:\\BSI\\SextoPeriodo\\DOO\\ExerciciosPOO2\\Singleton\\numbers.txt");
		fileWriter.write(i);
		fileWriter.close();
		
	}
}
