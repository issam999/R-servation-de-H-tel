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
import jakarta.persistence.OneToMany;
import lombok.Data;


@SuppressWarnings("serial")
@Entity

@Data

public class Ville implements Serializable {
	@Id
	@GeneratedValue
	
	private int id;
	public Ville() {
		super();
	}
	public Ville(int id, String villes) {
		super();
		this.id = id;
		this.villes = villes;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVille() {
		return villes;
	}
	public void setVille(String ville) {
		this.villes = ville;
	}
	public List<Hotel> getHotels() {
		return hotels;
	}
	public void setHotels(List<Hotel> hotels) {
		this.hotels = hotels;
	}
	@Column(name="Villes")
	private String villes;
	
	@JsonIgnore
	@OneToMany(mappedBy="ville",fetch=FetchType.LAZY)
	private List<Hotel> hotels = new ArrayList<>();

}
