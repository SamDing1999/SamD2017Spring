
public class AdvancedTicket extends Ticket{
	private int daysInAdvance;
	static int limitDays= 10;
	
	public AdvancedTicket(int ticketNumber, int daysInAdvance)
	{
	    super(ticketNumber);
	   
	    if(daysInAdvance >= limitDays){
	    	super.price = 30;
	    }else{
	    	super.price = 40;
	    }
		this.daysInAdvance = daysInAdvance;
	}
		
	public String toString()
	{
		return super.toString();
	}
}

