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
@Table(name="position")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Position {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="position_id")
	private int positionId;
	
	@Column(name="description")
	private String description;
	

	
}
