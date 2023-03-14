package com.example.ReservationsHotels.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.ReservationsHotels.Models.Hotel;
import com.example.ReservationsHotels.Models.Ville;
import com.example.ReservationsHotels.RepositoryHotel.RepositoryVille;


@Service
@Component
public class ServiceVilleImpl implements IServiceVille{

	  
	 @Autowired
	RepositoryVille vil;
	
	@Override
	public List<Ville> getListeVille(){
		
		
		return (List<Ville>) vil.findAll();
	}
	
	@Override
	public Ville getByVille(String ville)
	{
		return vil.findByVilles(ville);
	}
	public List<Hotel> getHotelByVille(String ville)
	{
		Ville v = vil.findByVilles(ville);
		return v.getHotels();
	}
}