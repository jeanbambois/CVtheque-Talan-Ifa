package com.projet.spring.cvtheque.entity;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="Companies")
@Data
@EntityListeners(AuditingEntityListener.class)
public class Company {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CompanyID")
	private int companyId;
	
	@Column(name="Name")
	private String name;
	
	
	
	//relation entre Company et Proexp
	@OneToMany(mappedBy="company",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	private List<ProExp> proExps;
	
	
	

	
}
