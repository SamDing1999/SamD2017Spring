package textExcel;

public class FormulaCell extends RealCell implements Cell{

private String input;
	
	public FormulaCell (String input){
		super (input);
		this.input = input;
	}
	

	public String abbreviatedCellText() {

		String abrv = this.input;
		abrv += "          ";
		return abrv.substring(0,10);
	}

	public String fullCellText() {
		return input;
	}
	
	public double GetDoubleValue (){
		String formula = input.substring(1,input.length()-1);//get rid of the parenthesis
		String[] num = formula.split(" ");
		int start = 0;
		while(start<=num.length){
			start+=2;
		}
		return Double.parseDouble(input);
	}
}
