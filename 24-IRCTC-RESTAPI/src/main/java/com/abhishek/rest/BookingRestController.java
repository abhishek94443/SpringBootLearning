package com.abhishek.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abhishek.request.Passenger;
import com.abhishek.response.Ticket;
import com.abhishek.service.BookingService;

@RestController
public class BookingRestController {
	@Autowired
	private BookingService service;
	
	@PostMapping(
			value = "/ticket", 
			produces = {"application/json"}, 
			consumes = {"application/json"}
			)
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger p){
		Ticket ticket=service.bookTicket(p);
		return new ResponseEntity<Ticket>(ticket, HttpStatus.CREATED);
	}
	 @GetMapping(value = "/ticket/{ticketNum}",
			 produces  = "application/json"
			 
			 )
	public Ticket getTicket(@PathVariable Integer ticketNum) {
		 
		return service.getTicket(ticketNum);
	}

}
