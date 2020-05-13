package com.projet.spring.cvtheque.entity;


import java.lang.annotation.Repeatable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="profile")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Profile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="profile_id")
	private int profileId;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="nationality")
	private String nationality;
	
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
	@Column(name="address")
	private String address;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="profile_password")
	private String profilePassword;
	
	@Column(name="profile_main_type")
	private int profileMainType;
	
	@Column(name="photo_file_name")
	private String photoFileName;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY ,
				cascade = { CascadeType.PERSIST,CascadeType.MERGE,
						CascadeType.DETACH,CascadeType.REFRESH
				})
	@JoinTable(
			name="education",
			joinColumns = @JoinColumn(name="profile_id"),
			inverseJoinColumns = @JoinColumn(name="education_title_id")
			)
	private List<Title> titlesEducation;
	
	
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
@JoinTable(
		name="trainCertif",
		joinColumns = @JoinColumn(name="profile_id"),
		inverseJoinColumns = @JoinColumn(name="train_certif_title_id")
		)
	private List<Title> titlesTrainCertif;
	
	
	
	/*add a convenience method
	
	public void addTitle(Title theTitle) {
		
		if(titles == null) {
			titles = new ArrayList<>();
		}
		titles.add(theTitle);
	}*/
	
	
	

	
}
