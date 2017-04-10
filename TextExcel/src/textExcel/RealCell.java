package textExcel;

public abstract class RealCell implements Cell {
	private String input = "";
	private int count = 0;
	public abstract double getDoubleValue();
	public String abbreviatedCellText() {
		if(input.length() < 10){
			//percent
			if(input.contains("%")){
				String placeholder = input.substring(0, input.indexOf(".")) + "%";
				return addSpaces(placeholder);
			}
			//checks if its a whole number thats a value cell, no percent or formula cell
			if(!input.contains(".") && !input.contains("(")){
				String anotherPlaceholder = input + ".0";
				return addSpaces(anotherPlaceholder);
			}
			//the one exception to having 2 zeros next to each other, treats it differently and just adds spaces
			if(input.equals("0.0")){
				input = addSpaces(input);
				return input;
			}
			//reverse for loop to check for two or more zeros together from the end
			if(!input.contains("(")){
				for(int i = input.length()-1; i >=0; i--){
					//ends the loop if its not a zero
					if(input.charAt(i) != '0'){
						i = 0;
					}
					if(input.charAt(i) == '0'){
						count ++;
						//checks to see if there is 2 zeros in a row
						if(count >= 2){
							input = input.substring(0, i);
						}
					}

				}
			}
			//adds a .0 if there's nothing after the decimal
			if(input.charAt(input.length()-1) == '.'){
				input = input + "0";
			}
			input = addSpaces(input);
			//if longer than 10, shortens to 10
		} else if(input.length() > 10){
			return input.substring(0, 10);
		}
		return input;
	}

	public String getRealCell(){
		return input;
	}
	
	public void setRealCell(String value){
		input = value;
	}
	
	public String fullCellText() {
		RealCell cell;
		if(input.equals("0")){
			return "0";
		}
		//finds the right cell form
		if(input.contains("%")){
			cell = new PercentCell(input);
			//formulacell is overridden for fullcelltext
		}else{
			cell = new ValueCell(input);
		}
		//switches double to string to get rid of extra 0s at the end
		String removeZeros = cell.getDoubleValue() + "";
		//makes sure number is positive and longer than one place value
		if((removeZeros.substring(removeZeros.indexOf(".")).equalsIgnoreCase(".0")) && ((cell.getDoubleValue() > 0) && (removeZeros.length() > 3))){
			return removeZeros.substring(0, removeZeros.indexOf("."));
		}
		return cell.getDoubleValue() + "";

}
	public String addSpaces(String hold){
		//formats abbreviatedCellText to length 10 if its too short
		while(hold.length() < 10){
			hold += " ";
		}
		return hold;
	}
}