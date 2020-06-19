package com.projet.spring.cvtheque.entity;


import java.time.LocalDate;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="ProExps")
@Data
@EntityListeners(AuditingEntityListener.class)
public class ProExp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ProExpID")
	private int proExpId;
	
	@Column(name="FromDate")
	private LocalDate fromDate;
	
	@Column(name ="ToDate")
	private LocalDate toDate;
	
	
	

	//Relation entre ProExp et Technologie
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="ProExpTech",
		joinColumns = @JoinColumn(name="ProExpID"),
		inverseJoinColumns = @JoinColumn(name="TechID")
		)	
	private List<Technologie> technologies;
	
	//Relation entre ProExp et Task
	
	@OneToMany(mappedBy="proExp",
			cascade = {CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH})
	private List<Task> tasks;
	
	//Relation entre ProExp et City
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CityID")
	private City city;
	
	//Relation entre ProExp et Company
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CompanyID")
	private Company company;
	
	//relation entre ProExp et Profile
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ProfileID")
	private Profile profile;
	
	//Relation entre ProExp et ExperienceDescription
	@OneToMany(mappedBy="proExp",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<ExperienceDescription> experienceDescriptions;
	
	
	
	
	

	
}
