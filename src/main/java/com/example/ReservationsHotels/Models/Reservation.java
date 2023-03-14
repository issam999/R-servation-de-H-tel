package com.example.ReservationsHotels.Models;

import java.io.Serializable;
import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Reservation implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	private int numero;
	private Date dateDeDebut;
	private int nombreDeJours;
	private int nombreDeChambres;
	private String nom;
	private String prenom;
	private String email;
	
	@ManyToOne
	private Hotel hotel;
	@ManyToOne
	private Client client;
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Reservation() {
		super();
	}

	public Reservation(int numero, Date dateDeDebut, int nombreDeJours, int nombreDeChambres, String nom, String prenom,
			String email) {
		super();
		this.numero = numero;
		this.dateDeDebut = dateDeDebut;
		this.nombreDeJours = nombreDeJours;
		this.nombreDeChambres = nombreDeChambres;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDateDeDebut() {
		return dateDeDebut;
	}

	public void setDateDeDebut(Date dateDeDebut) {
		this.dateDeDebut = dateDeDebut;
	}

	public int getNombreDeJours() {
		return nombreDeJours;
	}

	public void setNombreDeJours(int nombreDeJours) {
		this.nombreDeJours = nombreDeJours;
	}

	public int getNombreDeChambres() {
		return nombreDeChambres;
	}

	public void setNombreDeChambres(int nombreDeChambres) {
		this.nombreDeChambres = nombreDeChambres;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
