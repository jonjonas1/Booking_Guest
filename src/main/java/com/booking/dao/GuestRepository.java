package com.booking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Integer> {
	
	List<Guest> findByRoomId (int roomId);
}
