package com.example.ReservationsHotels.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ReservationsHotels.Models.Reservation;
import com.example.ReservationsHotels.RepositoryHotel.RepositoryResv;

@Service
public class ServiceReservationImpl implements IServiceReservation{
	
	@Autowired
	RepositoryResv res;
	

	@Override
	public Reservation AjouterReservation( Reservation resv) {
		
		return res.save(resv);
		
		
	}


	@Override
	public double montant(Reservation resv) {
		// TODO Auto-generated method stub
		return (resv.getHotel().getPrixChambre()*resv.getNombreDeJours());
	}
	
	

}
