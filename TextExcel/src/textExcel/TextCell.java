package textExcel;

public class TextCell implements Cell {

	private String content;
	
	public TextCell(String s) {
		content = s;
	}

	public String abbreviatedCellText() {
		int strlength = content.length();
		String abbreviated;
		if(strlength < 10){
			abbreviated = content.substring(0);
		}else{
			abbreviated = content.substring(0, 10);
		}
		return abbreviated;
	}

	
	public String fullCellText() {
		
		return content;
	}

}
