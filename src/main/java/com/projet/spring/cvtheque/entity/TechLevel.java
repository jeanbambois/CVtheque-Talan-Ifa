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
@Table(name="Techlevels")
@Data
@EntityListeners(AuditingEntityListener.class)
public class TechLevel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TechLevelID")
	private int techLevelId;
	
	@Column(name="Description")
	private String description;
	
	
	// relation entre TechLevel et Profile pour generer ProfileTech
	
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
	@JoinTable(
		name="ProfileTech",
		joinColumns = @JoinColumn(name="TechLevelID"),
		inverseJoinColumns = @JoinColumn(name="ProfileID")
		)
	private List<Profile> profiles;
	

	
}
