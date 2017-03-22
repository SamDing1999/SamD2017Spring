package textExcel;

public class ValueCell extends RealCell implements Cell{


	private String input;
	
	public ValueCell (String input){
		super (input);
		this.input = input;
	}

	public String abbreviatedCellText() {

		String abrv = GetDoubleValue () + "";
		abrv += "          ";
		
		return abrv.substring(0,10);
	}

	public String fullCellText() {

		return GetDoubleValue()+"";
	}
	
	public double GetDoubleValue (){
		return Double.parseDouble(input);
	}

}
