package bus.reservation.client;

import bus.reservation.system.TicketBooking;
import bus.reservation.system.TicketCounter;

public class Check {
	

	public static void main(String[] args) throws InterruptedException 
	{
		TicketCounter ticketCounter=new TicketCounter();
		
		Thread thread1=new Thread(new TicketBooking(ticketCounter, "kavya", 12, 25));
		Thread thread2=new Thread(new TicketBooking(ticketCounter, "Mala", 3,23));
		Thread thread3=new Thread(new TicketBooking(ticketCounter, "Raju", 5,17));
		Thread thread4=new Thread(new TicketBooking(ticketCounter, "Caramel",1,24));
		Thread thread5=new Thread(new TicketBooking(ticketCounter, "Daina", 2,16));
		Thread thread6=new Thread(new TicketBooking(ticketCounter, "Myna", 5,22));
		
		thread1.start();
		thread1.join();
		
		thread2.start();
		thread2.join();
		
		thread3.start();
		thread3.join();
		
		thread4.start();
		thread4.join();
		
		thread5.start();
		thread5.join();
		
		thread6.start();
		thread6.join();
		
		System.out.println("");
		System.out.println("Bus Reservation Ticket Booked Successfully");
	}
}
