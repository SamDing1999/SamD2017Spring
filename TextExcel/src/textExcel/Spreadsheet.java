package textExcel;



public class Spreadsheet implements Grid
{

	private int row = 20;
	private int col = 12;
	private String command;
	private Cell[][] grid = new EmptyCell[12][20];
	
	public String processCommand(String command)
	{
		String[] Command = command.split(" ");
		
		if(Command){
		//clearing a particular cell (e.g., clear A1).
			
		}else if(Command[1].substring(0,1).equals("=")){
		//assignment to string values (e.g., A1 = �Hello�).
			Location cell = new SpreadsheetLocation(Command[0]);
			grid[cell.getRow()][cell.getCol()] = Command[2].substring(1);
		}else{
			if(Command.equals("clear")){
				//clearing the entire sheet (e.g., clear).
				
			}else{
		//cell inspection (e.g., A1). This should return the value at that cell
			
			}
		}		
	}

	
	public int getRows()
	{
		
		return this.row;
	}

	
	public int getCols()
	{
		
		return this.col;
	}

@Override
	public Cell getCell(Location loc)
	{
		
		return null;
	}

	
	public String getGridText()
	{
		String Grid = ""; 
		for(int i = 0 ; i < 20; i++){
			for(int j = 0; j < 12; j++){
				Grid += grid[i][j].abbreviatedCellText();
			}
			Grid += "\n";	
		}
		
		return Grid;
	}

}
