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
@Table(name="Languages")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Language {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LanguageID")
	private int languageId;
	
	@Column(name="Language")
	private String language;
	
	//Relation entre Language et LanguageFluency
	@OneToMany(mappedBy="language", cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluencies;
	
	//Relation entre Language et title
	@OneToMany(mappedBy="language",cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Title> titles;
	
	//Relation entre Language et Experiencedescription
	@OneToMany(mappedBy="language",cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<ExperienceDescription> experienceDescriptions;
	
	@OneToMany(mappedBy="language",cascade={CascadeType.PERSIST,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Task> tasks;

	
}
