package com.booking.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.booking.entity.Guest;
import com.booking.service.GuestService;

@RestController
@RequestMapping("/api")
public class GuestRestController {
	
	@Autowired
	private GuestService guestService;
	
	@GetMapping("/guests")
	public List<Guest> findAll() {
		return guestService.findAll();
	}
	
	@GetMapping("/guests/{guestId}")
	public Guest getGuest(@PathVariable int guestId) {
		Guest theGuest = guestService.findById(guestId);

		if (theGuest == null) {
			throw new RuntimeException("Guest id not found - " + guestId);
		}
		return theGuest;
	}
	
	// find by room id
	@GetMapping("/guests/roomid/{roomId}")
	public List<Guest> findByRoomIds(@PathVariable int roomId) {
		return guestService.findByRoomId(roomId);
	}
	
	@PostMapping("/guests")
	public Guest addGuest(@RequestBody Guest theGuest) {

		// also just in case they pass an id in JSON ... set id to 0
		// this is to force a save of new item ... instead of update
		theGuest.setId(0);
		guestService.save(theGuest);

		return theGuest;
	}
	
	@PutMapping("/guests")
	public Guest updateGuest(@RequestBody Guest theGuest) {

		guestService.save(theGuest);

		return theGuest;
	}
	
	@DeleteMapping("/guests/{guestId}")
	public String deleteGuest(@PathVariable int guestId) {

		Guest tempGuest = guestService.findById(guestId);
		// throw exception if null
		if (tempGuest == null) {
			throw new RuntimeException("Guest id not found - " + guestId);
		}
		
		guestService.deleteById(guestId);

		return "Deleted guest id - " + guestId;
	}
}
