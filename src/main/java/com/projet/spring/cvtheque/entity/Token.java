package com.projet.spring.cvtheque.entity;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Token")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Token {
	
	@Id
	private int id;
	
	@Column(name="TokenValidity")
	private LocalDate tokenValidity;
	
	@Column(name="TokenValue")
	private String tokenValue;
	
	
	@OneToOne
	@MapsId
	@JoinColumn(name="ProfileID")
	private Profile profile;
	
	
	
	
}
