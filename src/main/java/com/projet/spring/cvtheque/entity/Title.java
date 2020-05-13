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
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="title")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Title {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="title_id")
	private int titleId;
	
	@Column(name="description")
	private String descrition;
	
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
@JoinTable(
		name="education",
		joinColumns = @JoinColumn(name="education_title_id"),
		inverseJoinColumns = @JoinColumn(name ="profile_id")

		)
	private List<Profile> profilesEducation;
	
	
	
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
@JoinTable(
		name="trainCertif",
		joinColumns = @JoinColumn(name="train_certif_title_id"),
		inverseJoinColumns = @JoinColumn(name="profile_id"))
	private List<Profile> profilesTrainCertif;
	

	
}
