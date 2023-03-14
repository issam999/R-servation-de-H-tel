package com.example.ReservationsHotels.ControllerHotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ReservationsHotels.Models.Reservation;
import com.example.ReservationsHotels.Service.IServiceReservation;

@RestController
@RequestMapping
@Component
public class ControllerReservation {

	
	
	@Autowired
	IServiceReservation Sresv;
	
	@PostMapping("/Reservation")
	@ResponseBody
	public ResponseEntity<?> AJouterReservation(@RequestBody Reservation res)
	{
		return ResponseEntity.status(HttpStatus.OK).body(Sresv.AjouterReservation(res));
	}
	@GetMapping("/Reservation/{res}")
	
	public ResponseEntity<?> MontantResveration(@RequestBody @PathVariable Reservation res)
	{
		return ResponseEntity.status(HttpStatus.OK).body(Sresv.AjouterReservation(res));
	}
	
}
