package textExcel;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextExcel
{

	public static void main(String[] args)
	{
		
		
		Cell a = new EmptyCell();
		String b = a.abbreviatedCellText();
		System.out.println(b);
		Grid test = new Spreadsheet();

		test.processCommand("A1 = \"hahahhahah\"");
		
		TestsALL.Helper th = new TestsALL.Helper();
        System.out.println(th.getText());
		
		Scanner input = new Scanner(System.in);
		String command = input.next();
		while(!command.equals("quit")){
			test.processCommand(command);
	    	command = input.next();
		}
	    
	    
	    
	    
	}
}
