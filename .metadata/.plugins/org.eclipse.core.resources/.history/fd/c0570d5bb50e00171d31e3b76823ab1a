package textExcel;

public class PercentCell extends RealCell implements Cell{

	private String input;
	public PercentCell (String input){
		super (input);
		this.input = input;
	}
	
	public String abbreviatedCellText() {
		String abrv;
		if(input.indexOf(".")<0){
			abrv = input;
		}else{
			abrv = input.substring(0, input.indexOf("."));
		}
		abrv += "%          ";
		
		return abrv.substring(0,10);
	}

	public String fullCellText() {

		return GetDoubleValue()+"";
	}
	
	public double GetDoubleValue (){
		return Double.parseDouble(input.substring(0, input.length()-1))/100;
		
	}

}
