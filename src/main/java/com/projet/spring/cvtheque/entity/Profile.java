package com.projet.spring.cvtheque.entity;




import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Profiles")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="ProfileID")
	private int profileId;
	
	@Column(name="LastName")
	private String lastName;
	
	@Column(name="FirstName")
	private String firstName;
	
	
	
	@Column(name="DateOfBirth")
	private LocalDate dateOfBirth;
	
	@Column(name="Address")
	private String address;
	
	@Column(name="Zip")
	private String zip;
	
	@Column(name="PhoneNumer")
	private String phoneNumber;
	
	@Column(name="Email")
	private String email;
	
	@Column(name="ProfilePassword")
	private String profilePassword;
	
	@Column(name="ProfileMainType")
	private int profileMainType;
	
	@Column(name="PhotoFileName")
	private String photoFileName;
	
	
	
	
	
	

	//Relation Profile avec Title pour generer la table education
	@ManyToMany(fetch = FetchType.LAZY ,
				cascade = { CascadeType.PERSIST,CascadeType.MERGE,
						CascadeType.DETACH,CascadeType.REFRESH
				})
	@JoinTable(
			name="Education",
			joinColumns = @JoinColumn(name="ProfileID"),
			inverseJoinColumns = @JoinColumn(name="EducationTitleID")
			)
	private List<Title> titlesEducation;
	
	
	//Relation Profile avec Title pour generer la table trainCertif
<<<<<<< HEAD
	@OneToMany(mappedBy="profile",cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private Set<TrainCertif> trainCertifs = new HashSet<>();
	
	
	//relation Profile avec Title pour generer pour generer la table hobby
=======
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
<<<<<<< HEAD
		name="Hobbies",
		joinColumns = @JoinColumn(name="ProfileID"),
		inverseJoinColumns = @JoinColumn(name="HobbyTitleID")
=======
		name="TrainCertif",
		joinColumns = @JoinColumn(name="ProfileID"),
		inverseJoinColumns = @JoinColumn(name="TrainCertifTitleID")
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139
		)
	private List<Title> titlesHobby;
	
<<<<<<< HEAD
	//Relation1 entre Profile et Log
	@OneToMany(mappedBy="profileModifId",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Log> logModifId;
=======
	//relation Profile avec Title pour generer pour generer la table hobby
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="Hobbies",
		joinColumns = @JoinColumn(name="ProfileID"),
		inverseJoinColumns = @JoinColumn(name="HobbyTitleID")
		)
	private List<Title> titlesHobby;
	
	//Relation1 entre Profile et Log
	@OneToMany(mappedBy="profileModifId",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Log> logModifId;
	
	//Relation 2 entre Profile et Log
	@OneToMany(mappedBy="profileProfileModifId",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Log> logProfileModifId;
	
	//Relation entre Profile et Gender
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="GenderID")
	private Gender gender;
	
	//Relation entre Profile et Nationality
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NationalityID")
	private Nationality nationality;
	
	//Relation entre Profile et City
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CityID")
	private City city;
	
	//Relation entre Profile et Technologie pour generer la table ProfileTech
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="ProfileTech",
		joinColumns = @JoinColumn(name="ProfileID"),
		inverseJoinColumns = @JoinColumn(name="TechID")
		)
	private List<Technologie> technologies;
	
	//Relation entre Profile et TechLevel
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="profileTech",
		joinColumns = @JoinColumn(name="ProfileID"),
		inverseJoinColumns = @JoinColumn(name="TechLevelID")
		)
	private List<TechLevel> techLevels;
	
	//Relation entre Profile et ProExp
	@OneToMany(mappedBy="profile", cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<ProExp> proExps;
	
	//Relation entre Profile et LanguageFluency
	@OneToMany(mappedBy="profile",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluencies;
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139
	
	//Relation 2 entre Profile et Log
	@OneToMany(mappedBy="profileProfileModifId",cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.MERGE,CascadeType.REFRESH})
	private List<Log> logProfileModifId;
	
<<<<<<< HEAD
	//Relation entre Profile et Gender
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="GenderID")
	private Gender gender;
	
	//Relation entre Profile et Nationality
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="NationalityID")
	private Nationality nationality;
	
	//Relation entre Profile et City
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CityID")
	private City city;
	
	//Relation entre Profile et Technologie pour generer la table ProfileTech
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="ProfileTech",
		joinColumns = @JoinColumn(name="ProfileID"),
		inverseJoinColumns = @JoinColumn(name="TechID")
		)
	private List<Technologie> technologies;
	
	//Relation entre Profile et TechLevel
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="profileTech",
		joinColumns = @JoinColumn(name="ProfileID"),
		inverseJoinColumns = @JoinColumn(name="TechLevelID")
		)
	private List<TechLevel> techLevels;
	
	//Relation entre Profile et ProExp
	@OneToMany(mappedBy="profile", cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<ProExp> proExps;
	
	//Relation entre Profile et LanguageFluency
	@OneToMany(mappedBy="profile",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<LanguageFluency> languageFluencies;
	
	
	public void addTitleEducation(Title theTitle) {
		if (titlesEducation==null) {
			titlesEducation = new ArrayList<>();
		}
		titlesEducation.add(theTitle);
	}
	
	
	
=======
	public void addTitleEducation(Title theTitle) {
		if (titlesEducation==null) {
			titlesEducation = new ArrayList<>();
		}
		titlesEducation.add(theTitle);
	}
	
	public void addTitleTrainCertif(Title theTitle) {
		if (titlesTrainCertif==null) {
			titlesTrainCertif = new ArrayList<>();
		}
		titlesTrainCertif.add(theTitle);
	}
	
>>>>>>> 963c4a7c2c2c6bb9369ef0c98ad10421aa57c139
	public void addTitleHobby(Title theTitle) {
		if (titlesHobby==null) {
			titlesHobby = new ArrayList<>();
		}
		titlesHobby.add(theTitle);
	}
	
	
	
	
	
	
	

	
}
