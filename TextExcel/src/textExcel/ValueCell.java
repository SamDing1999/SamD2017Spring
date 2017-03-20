package textExcel;

public class ValueCell extends RealCell implements Cell{


	private String input;
	
	public ValueCell (String input){
		super (input);

	}

	public String abbreviatedCellText() {

		String abrv = GetDoubleValue(input)+"";
		abrv += "          ";
		return abrv.substring(0,10);
	}

	public String fullCellText() {

		return GetDoubleValue(input)+"";
	}
	
	public double GetDoubleValue (String words){
		return Double.parseDouble(input);
	}

}
