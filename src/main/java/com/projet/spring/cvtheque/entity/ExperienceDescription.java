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
@Table(name="experienceDescription")
@Data
@EntityListeners(AuditingEntityListener.class)
public class ExperienceDescription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exp_id")
	private int expId;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	
	

	
}
