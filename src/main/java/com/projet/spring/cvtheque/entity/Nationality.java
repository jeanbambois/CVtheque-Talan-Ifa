package com.projet.spring.cvtheque.entity;


<<<<<<< HEAD:src/main/java/com/projet/spring/cvtheque/entity/Nationality.java
import java.util.ArrayList;
=======
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139:src/main/java/com/projet/spring/cvtheque/entity/CVLanguage.java
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD:src/main/java/com/projet/spring/cvtheque/entity/Nationality.java
=======
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139:src/main/java/com/projet/spring/cvtheque/entity/CVLanguage.java
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
<<<<<<< HEAD:src/main/java/com/projet/spring/cvtheque/entity/Nationality.java
@Table(name="Nationalities")
=======
@Table(name="CVLanguages")
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139:src/main/java/com/projet/spring/cvtheque/entity/CVLanguage.java
@Data
@EntityListeners(AuditingEntityListener.class)
public class Nationality {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
<<<<<<< HEAD:src/main/java/com/projet/spring/cvtheque/entity/Nationality.java
	@Column(name="NationalityID")
	private int nationalityId;
	
	@Column(name="Description")
	private String description;
	
	
	
	//Relation entre Nationality et Profile
	@OneToMany(mappedBy="nationality",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<Profile>profiles;
	
=======
	@Column(name="CVLanguageID")
	private int cvLanguageId;
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139:src/main/java/com/projet/spring/cvtheque/entity/CVLanguage.java
	
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
