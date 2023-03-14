package com.example.ReservationsHotels.RepositoryHotel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ReservationsHotels.Models.Reservation;

@Repository
public interface RepositoryResv extends CrudRepository<Reservation,Integer> {
	

	
}
