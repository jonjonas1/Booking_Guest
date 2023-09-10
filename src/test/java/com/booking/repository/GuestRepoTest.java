package com.booking.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.booking.dao.GuestRepository;
import com.booking.entity.Guest;
import com.booking.service.GuestService;

@DataJpaTest
public class GuestRepoTest {

	@Autowired
//	private GuestService guestService;
	private GuestRepository guestService;
	
	@Test
	@DisplayName("Create new guest")
	public void save() {
		Guest guest = new Guest();
		guest.setFirstName("Unit");
		guest.setLastName("Test");
		guest.setEmail("test@gmail.com");
		guest.setRoomId(1);
		
		Guest newGuest = guestService.save(guest);
		assertThat(newGuest.getId()).isNotEqualTo(null);
	}
	
	@Test
	public void testFindById() {
		Optional<Guest> guest = guestService.findById(2);
		System.out.println(guest.get().getFirstName());
		assertThat(guest.get().getId()).isNotEqualTo(null);
	}
	@Test
    public void testSave() {
		Guest user = new Guest();
        user.setFirstName("Jane Doe");
        guestService.save(user);
//        assertEquals("Jane Doe" guestService.);
    }
}
