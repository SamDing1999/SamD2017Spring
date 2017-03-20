package textExcel;

public class RealCell implements Cell {

	private String input;
	
	public RealCell(String input) {
		this.input = input;
	}

	public String abbreviatedCellText() {
		
		return "          ";
	}


	public String fullCellText() {

		return this.input;
	}
	
	public double getDoubleValue(){
		return Double.parseDouble(input);
	}

}
