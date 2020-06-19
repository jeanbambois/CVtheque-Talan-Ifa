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
@Table(name="Nationalities")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Nationality {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NationalityID")
	private int nationalityId;
	
	@Column(name="Description")
	private String description;
	
	
	
	//Relation entre Nationality et Profile
	@OneToMany(mappedBy="nationality",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Profile>profiles;
	
	
	


	

	

	
}
