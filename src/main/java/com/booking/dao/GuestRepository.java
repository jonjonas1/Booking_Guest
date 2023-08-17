package com.booking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.booking.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Integer> {

}
