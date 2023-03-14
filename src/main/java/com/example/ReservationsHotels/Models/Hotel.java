package com.example.ReservationsHotels.Models;




import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;


@SuppressWarnings("serial")
@Entity
@Data

public class Hotel implements Serializable{
	/**
	 * 
	 */
	@Id
	@GeneratedValue
	private int id;
	public Hotel() {
		super();
	}
	public Hotel(int id, String nom, String adresse, double prixChambre) {
		super();
		this.id = id;
		this.nom = nom;
		this.adresse = adresse;
		this.prixChambre = prixChambre;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public double getPrixChambre() {
		return prixChambre;
	}
	public void setPrixChambre(double prixChambre) {
		this.prixChambre = prixChambre;
	}
	public Ville getVille() {
		return ville;
	}
	public void setVille(Ville ville) {
		this.ville = ville;
	}
	@Column(name="Nom")
	private String nom;
	@Column(name="Adresse")
	private String adresse;
	@Column(name="PrixChambre")
	private double prixChambre;
	@JsonIgnore
	@ManyToOne
	private Ville ville;
	@JsonIgnore 
	@OneToMany(mappedBy="hotel",fetch=FetchType.LAZY)
	private List<Reservation> reservation = new ArrayList<>();
	
	public List<Reservation> getReservation() {
		return reservation;
	}
	
	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}
	

}
