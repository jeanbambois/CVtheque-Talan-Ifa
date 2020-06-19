package com.projet.spring.cvtheque.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Tasks")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TaskID")
	private int taskId;
	
	@Column(name="Title")
	private String title;
	
	
	
	
	//Relation en Task et ProExp
	
	@ManyToOne(cascade = {CascadeType.PERSIST,CascadeType.MERGE,
			CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name = "ProExpID")
	private ProExp proExp;
	
	//Relation entre Task et Language
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="LanguageID")
	private Language language;
	
	
	

	
}
