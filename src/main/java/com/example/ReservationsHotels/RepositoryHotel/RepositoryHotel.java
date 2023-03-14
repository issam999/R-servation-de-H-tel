package com.example.ReservationsHotels.RepositoryHotel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ReservationsHotels.Models.Hotel;
import com.example.ReservationsHotels.Models.Ville;


@Repository
public interface RepositoryHotel extends JpaRepository<Hotel,Integer>  {

	public Hotel findByNom(String Name);
	public Hotel findByAdresse(String adress);
	public Hotel findByPrixChambre(int prix);
}
