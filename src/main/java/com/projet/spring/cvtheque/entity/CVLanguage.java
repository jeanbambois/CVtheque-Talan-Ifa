package com.projet.spring.cvtheque.entity;


import java.util.List;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="CVLanguages")
@Data
@EntityListeners(AuditingEntityListener.class)
public class CVLanguage {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CVLanguageID")
	private int cvLanguageId;
	
	@Column(name = "LanguageID")
	private String languageId;
	
	
	//Relation entre CVLanguage et Task
	@OneToMany(mappedBy="cvLanguage",
			cascade = {CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH})
	private List<Task> tasks;
	
	//Relation entre CVLanguage et Title
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="Hobbies",
		joinColumns = @JoinColumn(name="CVLanguageID"),
		inverseJoinColumns = @JoinColumn(name="HobbyTitleID")
		)
	private List<Title> titles;
	
	//Relation entre CVlanguage et ExperienceDescription
	@OneToMany(mappedBy="cvLanguage",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<ExperienceDescription> experienceDescriptions;
	
	

	
}
