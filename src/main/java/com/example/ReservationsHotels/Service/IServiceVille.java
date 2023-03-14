package com.example.ReservationsHotels.Service;

import java.util.List;

import com.example.ReservationsHotels.Models.Hotel;
import com.example.ReservationsHotels.Models.Ville;


public interface IServiceVille {

	public List<Ville> getListeVille();
	public Ville getByVille(String Ville);
	public List<Hotel> getHotelByVille(String ville);
}
