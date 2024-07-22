package bus.reservation.system;

import java.util.concurrent.atomic.AtomicInteger;

public class TicketCounter
{
 
	private int availableSeats=20;
	private final int seats = 150;
	private static final AtomicInteger totalPrice = new AtomicInteger();
	
	public synchronized void bookTicket(String passangerName , int noOfSeats,int passengerAge)
	{
		int price = seats * noOfSeats ;
		totalPrice.addAndGet(price);
		
		if((availableSeats >= noOfSeats) && (noOfSeats >= 0) && (passengerAge >=18))
		{
			int price1 = seats * noOfSeats ;
			
			System.out.println("Hi " + passangerName + " : " + noOfSeats + " Tickets Booked Successfully" );
			System.out.println("Total Price Of Booked " + noOfSeats + " Tickets Are : $ " + price1);
			availableSeats = availableSeats - noOfSeats;
			System.out.println("Available Tickets Left : " + availableSeats);
	
		}
		else if(availableSeats < noOfSeats)
		{
			System.out.println("Hi " + passangerName + " : " + "Sorry, Tickets Are Not Available");
			System.out.println("Not Enough Tickets Left");
		}
		else
		{
			System.out.println("Hi " + passangerName + " Could Not Book The Tickets");
		}
	
	}
	
} 