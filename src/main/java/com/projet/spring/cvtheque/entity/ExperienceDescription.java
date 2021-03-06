package com.projet.spring.cvtheque.entity;


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
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="ExperienceDescriptions")
@Data
@EntityListeners(AuditingEntityListener.class)
public class ExperienceDescription {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ExpID")
	private int expId;
	
	@Column(name="Title")
	private String title;
	
	@Column(name="Description")
	private String description;
	
	//Relation entre ExperienceDescription et Position
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="PositionID")
	private Position position;
	
<<<<<<< HEAD
	
=======
	// Relation entre ExperienceDescription et CVLanguage
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="CVLanguageID")
	private CVLanguage cvLanguage;
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139
	
	// Relation entre ExperienceDescription et ProExp
		@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
		@JoinColumn(name="ProExpID")
		private ProExp proExp;
	
<<<<<<< HEAD
	//relation entre ExperienceDescription et Language
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name="LanguageID")
		private Language language; 
=======
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139
	
	

	
}
