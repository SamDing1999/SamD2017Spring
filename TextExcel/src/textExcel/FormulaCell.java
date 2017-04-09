package textExcel;

public class FormulaCell extends RealCell{
	private String value = "";
	public FormulaCell(String input){
		value = input;
		//stores string in parent class
		getDoubleValue();
	}
	public double getDoubleValue(){
		String noParenthesis = value.substring(2, value.length() - 2);
		String[] changeValue = noParenthesis.split(" ");
		if(changeValue.length == 1){
			return Double.parseDouble(changeValue[0]);
		}
		for(int i = 0;)
		double finalValue = Double.parseDouble(changeValue[0]);
		//( 5.4 * 3.5 / -1.4 + 27.4 - 11.182 ) 
		//increments by 2 and tests for signs to correctly 
		for(int i = 2; i < changeValue.length; i+=2){
			if(changeValue[i-1].equals("+")){
				finalValue += Double.parseDouble(changeValue[i]);
			} else if(changeValue[i-1].equals("*")){
				finalValue *= Double.parseDouble(changeValue[i]);
			} else if(changeValue[i-1].equals("/")){
				finalValue /= Double.parseDouble(changeValue[i]);
			} else{
				finalValue -= Double.parseDouble(changeValue[i]);
			}
		}
		setRealCell(finalValue + "");
		return finalValue;
	}
	public String fullCellText(){
		return value;
	}
	public 
}
}
