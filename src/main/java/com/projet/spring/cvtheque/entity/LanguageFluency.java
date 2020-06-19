package com.projet.spring.cvtheque.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="LanguageFluencies")
@Data
@EntityListeners(AuditingEntityListener.class)
public class LanguageFluency {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LanguageFluencyID")
	private int languageFluencyId;
	
	//Relation entre LanguageFluency et profile
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="ProfileID")
	private Profile profile;
	
	// Relation entre LanguageFluency et LanguageID
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="LanguageID")
	private Language language;
	
	// Relation1 entre LanguageFluency et Fluency
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="ConversationFluencyID")
	private Fluency fluencyConversation;
	
	// Relation2 entre LanguageFluency et Fluency
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="SpokenFluencyID")
	private Fluency fluencySpoken;
	
	// Relation3 entre LanguageFluency et Fluency
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="TechnicalVocabFluencyID")
	private Fluency fluencyTechnicalVocab;
	
	// Relation4 entre LanguageFluency et Fluency
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="WrittenExpressionFluencyID")
	private Fluency fluencyWrittenExpression;
	
	// Relation5 entre LanguageFluency et Fluency
	@ManyToOne(cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="WrittenComprehensionFluencyID")
	private Fluency fluencyWrittenComprehension;
	
		
}
