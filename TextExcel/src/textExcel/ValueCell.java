package textExcel;

public class ValueCell extends RealCell{
	private String value = "";
	public ValueCell(String a){
		value = a;
		setRealCell(a);
	}
	public double getDoubleValue(){
		double placeHolder = Double.parseDouble(value);
		return placeHolder;
	}

}
