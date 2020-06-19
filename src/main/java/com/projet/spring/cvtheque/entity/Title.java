package com.projet.spring.cvtheque.entity;


import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Titles")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Title {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TitleID")
	private int titleId;
	
	@Column(name="Description")
	private String descrition;
	
	//Relation entre Title et Profile pour genener la table education
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="Education",
		joinColumns = @JoinColumn(name="EducationTitleID"),
		inverseJoinColumns = @JoinColumn(name ="ProfileID")

		)
	private List<Profile> profilesEducation;
	
	
	//Relation entre Title et Traincertif
	
	@OneToMany(mappedBy="title",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Set<TrainCertif> trainCertifs;
	
	
	//Relation entre Title et Profile pour generer la table hobby
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="Hobbies",
		joinColumns = @JoinColumn(name="HobbyTitleID"),
		inverseJoinColumns = @JoinColumn(name="ProfileID")
		)
	private List<Profile> profilesHobby;
	
	//Relation entre Title et Language
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="LanguageID")
	private Language language; 
	
	

	
}
