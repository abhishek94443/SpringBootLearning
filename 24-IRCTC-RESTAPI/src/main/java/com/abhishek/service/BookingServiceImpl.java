package com.abhishek.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.abhishek.request.Passenger;
import com.abhishek.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {
    private Map<Integer, Ticket> bookedTicketsMap=new HashMap<>();
    private Integer ticketn=1;
	@Override
	public Ticket bookTicket(Passenger p) {
		// TODO Auto-generated method stub
		Ticket ticket=new Ticket();
		BeanUtils.copyProperties(p, ticket);
		ticket.setStatus("CONFIRMED");
		ticket.setTicketCost(550.00);
		ticket.setTicketNum(ticketn);
		
		bookedTicketsMap.put(ticketn++, ticket);
//		
		return ticket;
	}

	@Override
	public Ticket getTicket(Integer pid) {
		// TODO Auto-generated method stub
		if(bookedTicketsMap.containsKey(pid))
		return bookedTicketsMap.get(pid);
		return null;
	}

}
