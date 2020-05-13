package com.projet.spring.cvtheque.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="country")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Country {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="country_id")
	private int countryId;
	
	@Column(name="name")
	private String name;
	

	
}
