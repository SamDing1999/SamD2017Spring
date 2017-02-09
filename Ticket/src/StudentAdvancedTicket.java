
public class StudentAdvancedTicket extends AdvancedTicket{
	
	public StudentAdvancedTicket(int ticketNumber, int daysInAdvance){
		super(ticketNumber, daysInAdvance);
		 if(daysInAdvance >= limitDays){
		    	super.price = 15;
		    }else{
		    	super.price = 20;
		    }
	}
	
	public String toString(){
		return super.toString() ;
	}
}
