package textExcel;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextExcel
{

	public static void main(String[] args)
	{
		Spreadsheet test = new Spreadsheet();
		Scanner input = new Scanner(System.in);
		String command = input.next();
	    do{
	    	test.processCommand(command);
	    	command = input.next();
	    }while(!command.equals("quit"));
	    
	    
	    
	}
}
