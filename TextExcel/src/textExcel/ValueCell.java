package textExcel;

public class ValueCell extends RealCell implements Cell{


	private String input;
	
	public ValueCell (String input){
		super (input);
		
	}

	public String abbreviatedCellText() {
		String abrv;
		if(input.length()>10){
			abrv = input.substring(0,10);
		}else{
			abrv = GetDoubleValue () + "";
			abrv += "          ";
		}
		return abrv.substring(0,10);
	}

	public String fullCellText() {
		
		return input;
		
	}
	public double GetDoubleValue (){
		return Double.parseDouble(input);
	}

}
