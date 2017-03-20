package textExcel;

public class PercentCell extends RealCell implements Cell{

	private String input;
	public PercentCell (String input){
		super (input);

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

		return GetDoubleValue(input)+"";
	}
	
	public double GetDoubleValue (String words){
		return Double.parseDouble(words.substring(0, words.length()-1))/100;
		
	}

}
