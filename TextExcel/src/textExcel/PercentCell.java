package textExcel;



	public class PercentCell extends RealCell{
		private String input = "";
		private double percent = 0.0;
		public PercentCell(String input){
			this.input = input;
			setRealCell(input);
		}
		public double getDoubleValue(){
			percent = Double.parseDouble(input.substring(0, input.length()-1))/100;
			return percent;
		}
	}
