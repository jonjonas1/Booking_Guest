package com.booking.service;

import java.util.ArrayList;
import java.util.List;

import com.booking.entity.Guest;

public class GuestMockSerive implements GuestService {
	
private List<Guest> listGuest = new ArrayList<>() ;
	
	
	public GuestMockSerive() {
		listGuest
		.add(new Guest("John", "Rain", "aa@mail.com"));
		listGuest
		.add(new Guest("John", "Rain", "aa@mail.com"));
		listGuest
		.add(new Guest("John", "Rain", "aa@mail.com"));
	}
	
	

	@Override
	public List<Guest> findAll() {
		// TODO Auto-generated method stub
		return listGuest;
	}

	@Override
	public Guest findById(int theId) {
		Guest emp = listGuest
				.stream()
				.filter(e -> e.getId() == theId)
				.findFirst()
				.get();
		
		return emp;
	}

	@Override
	public void save(Guest theGuest) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Guest> findByRoomId(int theRoomId) {
		// TODO Auto-generated method stub
		return null;
	}

}
