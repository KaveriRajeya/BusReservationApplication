package bus.reservation.system;

public class TicketBooking implements Runnable{
	
	private TicketCounter ticketCounter;
	private String passangerName;
	private int noOfSeats;
	private int passengerAge;
	private int seats;
		
	public TicketBooking(TicketCounter ticketCounter,String passangerName,int noOfSeats,int passengerAge)
	{
		this.ticketCounter=ticketCounter;
		this.passangerName=passangerName;
		this.noOfSeats=noOfSeats;
		this.passengerAge=passengerAge;
		this.setSeats(seats);
	}
	
	public void run()
	{
		try {
		ticketCounter.bookTicket(passangerName,noOfSeats,passengerAge);	
		Thread.sleep(1000);
		}
		catch(InterruptedException exception){
			exception.printStackTrace();
		}
	}

	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}

}


