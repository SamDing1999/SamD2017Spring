package textExcel;



public class Spreadsheet implements Grid
{


	private String command;
	private Cell[][] grid = new EmptyCell[12][20];
	
	public Spreadsheet(){
		
	}
	
	public String processCommand(String command)
	{
		
		/*String[] Command = command.split(" ");
		
		if(Command.equals(haha)){                   								//REDO
		//clearing a particular cell (e.g., clear A1).
			
		}else if(Command[1].substring(0,1).equals("=")){
		//assignment to string values (e.g., A1 = "Hello").
			Location cell = new SpreadsheetLocation(Command[0]);
			grid[cell.getRow()][cell.getCol()] = test;				//Redo this part b/c it is just a test code
		}else{
			if(Command.equals("clear")){
				//clearing the entire sheet (e.g., clear).
				
			}else{
		//cell inspection (e.g., A1). This should return the value at that cell
			
			}
		}	*/
		return command;
	}

	
	public int getRows()
	{
		
		return 20;
	}

	
	public int getCols()
	{
		
		return 12;
	}

@Override
	public Cell getCell(Location loc)
	{
		
		return null;
	}

	
	public String getGridText()
	{
		String Grid = ""; 
		String letter = "";
		for(char i = 'A'; i<='L'; i++){
			letter = i + "         |";
		}
		
		return letter;
	}

}
