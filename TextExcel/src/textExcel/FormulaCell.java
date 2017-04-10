package textExcel;

public class FormulaCell extends RealCell{
	private String value = "";
	private Cell[][] Spreadsheet;
	public FormulaCell(String input, Cell[][] array){
		value = input;
		Spreadsheet = array;
		//stores string in parent class
	}
	public double getDoubleValue(){
		double sum = 0.0;
		String noParenthesis = value.substring(2, value.length() - 2);
		String[] changeValue = noParenthesis.split(" ");
		if(changeValue.length == 1){
			return Double.parseDouble(changeValue[0]);
			} else if(changeValue[0].toUpperCase().equals("AVG") || changeValue[0].toUpperCase().equals("SUM")){
				//get the beginning cell and ending cell
				int counter = 0;
				String beginning = changeValue[1].toUpperCase().substring(0, changeValue[1].indexOf('-'));
				String ending = changeValue[1].toUpperCase().substring(changeValue[1].indexOf('-') + 1);
				if(changeValue[0].toUpperCase().equals("AVG")){
					String placeHolder = beginning;
					while(!(placeHolder.equals(ending))){
						SpreadsheetLocation loc = new SpreadsheetLocation(placeHolder);
						//change the column when its the same row
						if(placeHolder.substring(1).equals(ending.substring(1))){
							//changes the letter by one if the rows are the same
							placeHolder = ((char)(placeHolder.charAt(0) + 1)) + beginning.substring(1);
							if(Spreadsheet[loc.getRow()][loc.getCol()] instanceof RealCell){
								//makes sure its a realcell there before adding one to counter
								counter++;
								System.out.println(counter);
							}
						}else{
							//Move to next row if the row isnt equal
							placeHolder = placeHolder.charAt(0) + "" + (Integer.parseInt(placeHolder.substring(1)) + 1);
							if(Spreadsheet[loc.getRow()][loc.getCol()] instanceof RealCell){
								counter++;
							}
						}
				}
				return (sum(beginning, beginning, ending)) / (counter+1);
			}else if(changeValue[0].toUpperCase().equals("SUM")){
				return (sum(beginning,beginning,ending));
			}
		} else{
			
			//the first part of the expression and the storing number
			//checks to see if its a cell or number
			if(changeValue[0].toUpperCase().charAt(0) >= 'A' && changeValue[0].toUpperCase().charAt(0) <='L'){
				changeValue[0] = changeValue[0].toUpperCase();

				SpreadsheetLocation cell = new SpreadsheetLocation(changeValue[0]);
				if(Spreadsheet[cell.getRow()][cell.getCol()] instanceof RealCell){
					sum = ((RealCell)Spreadsheet[cell.getRow()][cell.getCol()]).getDoubleValue();
				}else{
					sum = 0.0;
				}
			}else{
				sum = Double.parseDouble(changeValue[0]);
			}
			
			//goes through the rest of the expression and carries out operands for thevalues
			//or simplifies the formula to return the value
			for(int i = 1; i < changeValue.length - 1; i += 2 ){
				
				//checks to see if its a cell or number
				double num;
				if(changeValue[i + 1].toUpperCase().charAt(0) >= 'A' && changeValue[i + 1].toUpperCase().charAt(0) <='L'){
						changeValue[i + 1] = changeValue[i + 1].toUpperCase();

						SpreadsheetLocation loc = new SpreadsheetLocation(changeValue[i + 1]);
						if(Spreadsheet[loc.getRow()][loc.getCol()] instanceof RealCell){
							num = ((RealCell)Spreadsheet[loc.getRow()][loc.getCol()]).getDoubleValue();
						}else{
							num = 0.0;
						}

				}else{
					num = Double.parseDouble(changeValue[i + 1]);
				}

				//checks for operators to see what to do
				if(changeValue[i].equals("*")){
					sum *=  num;
				}else if(changeValue[i].equals("/")){
					sum /= num;
				}else if(changeValue[i].equals("+")){
					sum += num;
				}else{
					sum -= num;
				}
			}
		}
		return sum;
	}
	public String fullCellText(){
		return value;
	}
	public String abbreviatedCellText() {
		String value = getDoubleValue() + "";
		if (value.length() > 10) {
			return value.substring(0, 10);
		} else {
			for (int i = value.length(); i < 10; i++) {
				value += " ";
			}
			return value;
		}
	}
public double sum(String beginning, String changedCell, String end){	
		SpreadsheetLocation loc = new SpreadsheetLocation(changedCell);
		//when they are the same, finishes and goes back through
		if(changedCell.equals(end)){
			if(Spreadsheet[loc.getRow()][loc.getCol()] instanceof RealCell){
				return ((RealCell)Spreadsheet[loc.getRow()][loc.getCol()]).getDoubleValue();
			}else{
				return 0.0;
			}
		}
		//if the columns aren't the same, but the rows are, move horizontally
		if(Character.toUpperCase(beginning.charAt(0)) != Character.toUpperCase(end.charAt(0)) 
				&& Integer.parseInt(beginning.substring(1)) == Integer.parseInt(end.substring(1))){
			
			changedCell = ((char)(changedCell.charAt(0) + 1)) + beginning.substring(1);
			
			//if the columns are the same,but the rows are not, move vertically
		}else if(Character.toUpperCase(beginning.charAt(0)) == Character.toUpperCase(end.charAt(0))
				&& Integer.parseInt(beginning.substring(1)) <= Integer.parseInt(end.substring(1))){
			
			changedCell = Character.toString(beginning.charAt(0)) + (Integer.parseInt(changedCell.substring(1)) + 1);
			
			//if the columns and the rows aren't the same, move through all of the cells
		}else{
			
			//when row is less than the ending row, keep going down
			if(Integer.parseInt(changedCell.substring(1)) < Integer.parseInt(end.substring(1))){
				
				changedCell = Character.toString(changedCell.charAt(0)) + (Integer.parseInt(changedCell.substring(1)) + 1);

				//if the rows are the same, reset and move to next column
			}else if(Integer.parseInt(changedCell.substring(1)) == Integer.parseInt(end.substring(1))){
				
				changedCell = ((char)(changedCell.charAt(0) + 1)) + "" + beginning.substring(1);
				
			}
		}

		//gets the value of the cell and keeps it and returns it
		double first;
		if(Spreadsheet[loc.getRow()][loc.getCol()] instanceof RealCell){
			 first = ((RealCell)Spreadsheet[loc.getRow()][loc.getCol()]).getDoubleValue();
			return (first + sum(beginning, changedCell, end));
		}else{
			return sum(beginning, changedCell, end);
		}
	}
}
