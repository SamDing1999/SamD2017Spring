package textExcel;



public class Spreadsheet implements Grid
{


	private String command;
	private Cell[][] grid;
	
	public Spreadsheet(){
		grid = new EmptyCell[20][12];
	}
	
	public String processCommand(String command)
	{
		
		/*String[] Command = command.split(" ");
		
		if(Command.equals()){                   								//REDO
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
		grid = new EmptyCell[20][12];
		String Grid = ""; 
		String topLetter = "   |";
		for(char i = 'A'; i<='L'; i++){
			topLetter += i + "         |";
		}
		
		String numbers = "\n";
		for(int i = 0;i < 20;i++){
			if(i<9){
				numbers += (i+1);
				numbers += "  |";
				for(int j = 0; j<12;j++){
					numbers += grid[i][j].abbreviatedCellText() + "|";
				}
				numbers +="\n";
			}else{
				numbers += (i+1);
				numbers += " |";
				for(int j = 0; j<12;j++){
					numbers += grid[i][j].abbreviatedCellText() + "|";
				}
				numbers +="\n";
			}
		}
		
		
		Grid = topLetter + numbers;
		return Grid;
	}

}
