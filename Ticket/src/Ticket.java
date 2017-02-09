
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
	
	public static void main(String[] args){
		AdvancedTicket janson = new AdvancedTicket(17, 4);
		janson.toString();
	}
}
