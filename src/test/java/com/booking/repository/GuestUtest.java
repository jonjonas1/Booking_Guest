package com.booking.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.booking.entity.Guest;

@SpringBootTest
public class GuestUtest {
	
	private Guest guest;
	
	@BeforeEach
	public void setup() {
		guest = new Guest("Mark","Zuck","mark@gmail.com");
	}
	
	@Test
	public void testGuest() {
		assertEquals(guest.getFirstName(), "Mark");
		assertEquals(guest.getLastName(), "Zuck");
		assertEquals(guest.getEmail(), "mark@gmail.com");
	}
}
