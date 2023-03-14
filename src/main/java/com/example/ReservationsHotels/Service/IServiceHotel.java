package com.example.ReservationsHotels.Service;

import java.util.List;

import com.example.ReservationsHotels.Models.Hotel;
import com.example.ReservationsHotels.Models.Ville;


public interface IServiceHotel {

	public List<Hotel> getListHotel();
	public Hotel getInfoHotel(String nom);
	public Hotel getAdresseHotel(String adrss);
	public Hotel getHotelByPrixChambre(int prix);
	public Hotel getHotelByVille(String ville);

}
