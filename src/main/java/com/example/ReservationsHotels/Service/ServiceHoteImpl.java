package com.example.ReservationsHotels.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.ReservationsHotels.Models.Hotel;
import com.example.ReservationsHotels.Models.Ville;
import com.example.ReservationsHotels.RepositoryHotel.RepositoryHotel;
import com.example.ReservationsHotels.RepositoryHotel.RepositoryVille;



@Service
@Component
public class ServiceHoteImpl implements IServiceHotel{

	  
	 @Autowired
	RepositoryHotel hotel;
	 @Autowired
	 RepositoryVille Rville;

	@Override
	
	public List<Hotel> getListHotel() {
		
		return (List<Hotel>) hotel.findAll();
				 
		}

@Override
public Hotel getInfoHotel(String nom) {
			
		return hotel.findByNom(nom);	
}

@Override
public Hotel getAdresseHotel(String adrss) {
	// TODO Auto-generated method stub
	return hotel.findByAdresse(adrss);
}

@Override
public Hotel getHotelByPrixChambre(int prix) {
	
	return hotel.findByPrixChambre(prix);
}

@Override
public Hotel getHotelByVille(String ville) {

	
	
	
	
	
	return null;
}

}
