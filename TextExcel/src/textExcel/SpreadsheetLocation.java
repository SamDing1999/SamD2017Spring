package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int col;
	private int row;
    @Override
    public int getRow()
    {
        
        return this.row;
    }

    @Override
    public int getCol()
    {
        return this.col;
    }
    
    public SpreadsheetLocation(String cellName)
    {
        // TODO: Fill this out with your own code
    	this.col = cellName.charAt(0);
    	this.row = cellName.charAt(1);
    	
    	
    }

}
