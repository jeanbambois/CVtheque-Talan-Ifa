package com.projet.spring.cvtheque.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Countries")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CountryID")
	private int countryID;
	
	@Column(name="Name")
	private String name;
	
	
	
	public Country(String name) {
		
		this.name = name;
	}
	
	



	//Relation entre Country et City
	@OneToMany(mappedBy="country",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<City> cities;
	
	
	//convinience method for bi directional relationship between country and city
	public void addCity(City tempCity) {
		if(cities==null) {
			cities = new ArrayList<>();
		}
		cities.add(tempCity);
		tempCity.setCountry(this);
	}


	public Country() {
		
	}
	

	
}
