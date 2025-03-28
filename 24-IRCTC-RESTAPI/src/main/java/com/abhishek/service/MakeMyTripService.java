package com.abhishek.service;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.abhishek.request.Passenger;
import com.abhishek.response.Ticket;

public class MakeMyTripService {
	
	private String BOOK_TICKET_URL="http://localhost:8080/ticket";
	
	private String GET_TICKET_URL="http://localhost:8080/ticket/{ticketNum}";

	
	public Ticket bookTicket(Passenger passenger) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> respEntity = 
				rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class);
		
		Ticket ticket = respEntity.getBody();
		
		return ticket;
	}

	
	public Ticket getTicketByNum(Integer ticketNumber) {
		
		RestTemplate rt = new RestTemplate();
		
		ResponseEntity<Ticket> respEntity = 
				rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);
		
		Ticket ticket = respEntity.getBody();
		
		return ticket;
	}

}
