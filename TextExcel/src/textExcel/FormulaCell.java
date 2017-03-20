package textExcel;

public class FormulaCell extends RealCell implements Cell{

private String input;
	
	public FormulaCell (String input){
		super (input);

	}
	

	public String abbreviatedCellText() {

		String abrv = this.input;
		abrv += "          ";
		return abrv.substring(0,10);
	}

	public String fullCellText() {
		return input;
	}
	
	public double GetDoubleValue (String words){
		return Double.parseDouble(words);
	}
}
