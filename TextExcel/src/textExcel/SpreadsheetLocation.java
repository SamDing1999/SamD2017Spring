package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location
{
	private int col;
	private int row;
	private String location;
    @Override
    public int getRow()
    {
    	// gets row of this location
    	this.row = 
        return this.row;
    }

    @Override
    public int getCol()
    {
    	// gets column of this location
    	this.col = Integer.parseInt(location.substring(1));
        return this.col;
    }
    
    public SpreadsheetLocation(String cellName)
    {
    	location = cellName;
    	
    	
    }

}
