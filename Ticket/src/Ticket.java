
public class Ticket {
	int price;
	private int ticketNum;
	
	public Ticket(int ticketNum){
		this.ticketNum = ticketNum;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public String toString(){
	    return ( "Number: " + this.ticketNum + ", Price: " + this.getPrice());
	}
}
