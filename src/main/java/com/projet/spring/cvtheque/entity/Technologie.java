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
@Table(name="Technologies")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Technologie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TechID")
	private int techId;
	
	@Column(name="Title")
	private String title;
	
	//Relation en Technologie et Principle pour generer TechPrinciple
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="TechPrinciples",
		joinColumns = @JoinColumn(name="TechID"),
		inverseJoinColumns = @JoinColumn(name="PrincipleID")
		)
	private List<Principle> principles;
	
	
	//Relation entre Technologie et ProExp pour generer ProExpTech
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="ProExpTech",
		joinColumns = @JoinColumn(name="TechID"),
		inverseJoinColumns = @JoinColumn(name="ProExpID")
		)	
	private List<ProExp> proExps;
	
	//Relation entre Technologie et Profile pour generer ProfileTech
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="ProfileTech",
		joinColumns = @JoinColumn(name="TechID"),
		inverseJoinColumns = @JoinColumn(name="ProfileID")
		)
	private List<Profile> profiles;
	
}
