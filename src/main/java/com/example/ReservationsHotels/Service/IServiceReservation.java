package com.example.ReservationsHotels.Service;

import com.example.ReservationsHotels.Models.Reservation;

public interface IServiceReservation {
	
	public double montant (Reservation resv );
	public Reservation AjouterReservation(Reservation resv);
	

}
