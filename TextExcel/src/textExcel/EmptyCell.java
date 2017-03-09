package textExcel;

public class EmptyCell implements Cell {

	public EmptyCell(){
		
	}
	
	public String abbreviatedCellText() {
		
		return "          a";
	}

	
	public String fullCellText() {
		
		return "";
	}

}
