package com.booking.service;

import java.util.List;

import com.booking.entity.Guest;

public interface GuestService {
	
	public List<Guest> findAll();
	
	public Guest findById(int theId);
	
	public void save(Guest theGuest);

	public void deleteById(int theId);
	
	public List<Guest> findByRoomId(int theRoomId);

}
