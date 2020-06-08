package com.projet.spring.cvtheque.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Cities")
@Data
@EntityListeners(AuditingEntityListener.class)
public class City {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CityID")
	private int cityId;
	
	@Column(name="Name")
	private String name;
	
	
	
	

	//Relation entre City et Profile
	@OneToMany(mappedBy="city",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Profile> profiles;
	
	//Relation entre City et Country
	@ManyToOne(fetch= FetchType.LAZY)
	@JoinColumn(name="CountryID")
	private Country country;
	
	//Relation entre City et ProExp
	@OneToMany(mappedBy="city",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	private List<ProExp> proExps;
	
	
	

	
	

	
}
