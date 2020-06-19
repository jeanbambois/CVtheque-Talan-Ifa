package com.projet.spring.cvtheque.entity;


import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Logs")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Log {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="LogID")
	private int logId;
	
	@Column(name="ModifDate")
	private LocalDate lastModifDate;
	
	@Column(name= "UpdateMsg")
	private String updateMsg;
	

	//Relation1 entre Log et Profile
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="ModifID")
	private Profile profileModifId;
	
	//Relation2 entre Log et Profile
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.DETACH,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="ProfileModifID")
	private Profile profileProfileModifId;
	
	
}
