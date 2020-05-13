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
@Table(name="language")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Language {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="language_id")
	private int languageId;
	
	@Column(name="language")
	private String language;
	

	
}
