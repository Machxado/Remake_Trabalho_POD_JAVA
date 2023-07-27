import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class app
{
   public static void main(String[] args)
   {
    try 
    {
        File arq = new File("Operacoes/1.txt");
        Scanner Reader = new Scanner(arq);
    
    } 
    catch (FileNotFoundException e) 
    {
        System.out.println("Arquivo não Encontrado");
        e.printStackTrace();
    }
    while (Reader.hasNextLine()) 
    {
        String operacao = Reader.nextLine();
        System.out.println(operacao);
    }
    Reader.close();
   }
}
