package com.projet.spring.cvtheque.entity;


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
@Table(name="Fluency")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Fluency {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="FluencyID")
	private int fluencyId;
	
	@Column(name="LevelDescription")
	private String levelDescription;
	
	//Relation1 entre Fluency et LanguageFluency
	@OneToMany(mappedBy="fluencyConversation",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluenciesConv;
	
	//Relation2 entre Fluency et LanguageFluency
	@OneToMany(mappedBy="fluencySpoken",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluenciesSpok;
	
	//Relation3 entre Fluency et LanguageFluency
	@OneToMany(mappedBy="fluencyTechnicalVocab",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluenciesTechVoc;
	
	//Relation4 entre Fluency et LanguageFluency
	@OneToMany(mappedBy="fluencyWrittenExpression",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluenciesWritExp;
	
	//Relation5 entre Fluency et LanguageFluency
	@OneToMany(mappedBy="fluencyWrittenComprehension",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluenciesWritCompr;
}
