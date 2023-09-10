package com.booking.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GuestServiceTest {
	
	private GuestService gService = new GuestMockSerive();
	
	
	@Test
	void testFindAllIsNotNull() {
		assertNotNull(gService.findAll());
	}
	
	@Test
	void testSizeOfAllStudents() {
		assertEquals(gService.findAll().size(), 3);
	}
}
