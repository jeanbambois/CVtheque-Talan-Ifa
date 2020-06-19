package com.projet.spring.cvtheque.entity;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="TrainCertif")
@Data
@EntityListeners(AuditingEntityListener.class)
public class TrainCertif implements Serializable {
	
	@Id
	@ManyToOne
	@JoinColumn(name="ProfileId")
	private Profile profile;
	
	@Id
	@ManyToOne
	@JoinColumn(name="TrainCertifTitleId")
	private Title title;
	
	@Column(name="GraduationDate")
	private LocalDate graduationDate;
	
	
	
	

	
	
	

	
}
