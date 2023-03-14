package com.example.ReservationsHotels.ControllerHotel;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ReservationsHotels.Models.Hotel;
import com.example.ReservationsHotels.Service.IServiceHotel;
import com.example.ReservationsHotels.Service.IServiceVille;


@RestController

@Component
public class HotelsController {
	
	 

	  
	@Autowired
	IServiceHotel Ht;
	@Autowired
	IServiceVille VL;
	
	@GetMapping("/Hotel")
	
	public ResponseEntity<?> ListeDesHotels()
	{
		return ResponseEntity.status(HttpStatus.OK).body(Ht.getListHotel());
	}
	@GetMapping("/Hotel/{NomHotel}")
	
	  public ResponseEntity<Hotel> getHotelByName(@PathVariable String name) {
        Hotel hotel = Ht.getInfoHotel(name);
        if (hotel == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(hotel);
    }

	@GetMapping("/Hotels/{adrss}")
	
	public ResponseEntity<?> InfosurVille(@PathVariable String  adrss)
	{
		
		Hotel hotel = Ht.getAdresseHotel(adrss);
		if( hotel != null)
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
		else 
			 return ResponseEntity.notFound().build();

	}
	@GetMapping("/hotel/{prix}")
	public ResponseEntity<?> InfosurHotelByPrix(@PathVariable int  prix)
	{
		
		Hotel hotel = Ht.getHotelByPrixChambre(prix);
		if( hotel != null)
		return ResponseEntity.status(HttpStatus.OK).body(hotel);
		else 
			 return ResponseEntity.notFound().build();

	}
	@GetMapping("/{ville}/hotel")
	 public ResponseEntity<?> getHotelBVille(@PathVariable String ville)
	
	{
		List<Hotel> hotels = VL.getHotelByVille(ville);
		if( hotels != null)
		return ResponseEntity.status(HttpStatus.OK).body(hotels);
		else 
			 return ResponseEntity.notFound().build();

		
	}
	

		
	}
	





