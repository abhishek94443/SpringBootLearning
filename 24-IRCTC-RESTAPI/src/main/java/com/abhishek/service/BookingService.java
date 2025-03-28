package com.abhishek.service;

import com.abhishek.request.Passenger;
import com.abhishek.response.Ticket;

public interface BookingService {
	public Ticket bookTicket(Passenger p);
	
	public Ticket getTicket(Integer pid);

}
