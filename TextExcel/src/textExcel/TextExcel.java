package textExcel;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;



public class TextExcel
{

	public static void main(String[] args)
	{
		String greeting = "9";

		Grid test = new Spreadsheet();
		String a = test.processCommand("a2 = " + greeting);
		System.out.println(a);

		//TestsALL.Helper th = new TestsALL.Helper();
        //System.out.println(th.getText());
		
		Scanner input = new Scanner(System.in);
		String command = input.next();
		while(!command.equals("quit")){
			test.processCommand(command);
	    	command = input.next();
		}
	    
	    
	    
	    
	}
}
