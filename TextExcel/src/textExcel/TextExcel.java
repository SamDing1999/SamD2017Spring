package textExcel;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextExcel
{

	public static void main(String[] args)
	{
 
		String letter = "";
		
		System.out.println(ha);
		for(char i = 'A'; i<='L';i++){
			letter = i + "         |";
		}
		System.out.println(letter);
		Spreadsheet test = new Spreadsheet();

		test.getGridText();
		
		Scanner input = new Scanner(System.in);
		String command = input.next();
		while(!command.equals("quit")){
			test.processCommand(command);
	    	command = input.next();
		}
	    
	    
	    
	    
	}
}
