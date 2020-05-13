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
@Table(name="principle")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Principle {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="principle_id")
	private int principleId;
	
	@Column(name="name")
	private String name;
	
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
@JoinTable(
		name="techprinciple",
		joinColumns = @JoinColumn(name="principle_id"),
		inverseJoinColumns = @JoinColumn(name="tech_id")
		)
private List<Technologie> technologies;
	
}
