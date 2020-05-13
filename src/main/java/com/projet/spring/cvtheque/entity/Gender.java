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
@Table(name="gender")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Gender {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gender_id")
	private int cityId;
	
	@Column(name="description")
	private String description;
	

	

	
}
