package com.example.ReservationsHotels.RepositoryHotel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.ReservationsHotels.Models.Ville;


@Repository
public interface RepositoryVille extends CrudRepository<Ville,Integer> {

	public Ville findByVilles(String ville);
}
