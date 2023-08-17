package com.booking.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.booking.dao.GuestRepository;
import com.booking.entity.Guest;

@Service
public class GuestServiceImpl implements GuestService {

	@Autowired
	private GuestRepository guestRepository;

	@Override
	public List<Guest> findAll() {
		return guestRepository.findAll();
	}

	@Override
	public Guest findById(int theId) {
		Optional<Guest> result = guestRepository.findById(theId);

		Guest theGuest = null;

		if (result.isPresent()) {
			theGuest = result.get();
		} else {
			throw new RuntimeException("Did not find guest id - " + theId);
		}

		return theGuest;
	}

	@Override
	public void save(Guest theGuest) {
		guestRepository.save(theGuest);
	}

	@Override
	public void deleteById(int theId) {
		guestRepository.deleteById(theId);
	}

}
