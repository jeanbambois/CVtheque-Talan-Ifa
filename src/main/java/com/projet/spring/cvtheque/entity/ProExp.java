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
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Entity
@Table(name="proexp")
@Data
@EntityListeners(AuditingEntityListener.class)
public class ProExp {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="proexp_id")
	private int proExpId;
	
	@Column(name="from_date")
	private LocalDate fromDate;
	
	@Column(name ="to_date")
	private LocalDate toDate;
	
	@ManyToMany(fetch = FetchType.LAZY ,
			cascade = { CascadeType.PERSIST,CascadeType.MERGE,
					CascadeType.DETACH,CascadeType.REFRESH
			})
@JoinTable(
		name="proExpTech",
		joinColumns = @JoinColumn(name="proexp_id"),
		inverseJoinColumns = @JoinColumn(name="tech_id")
		)	
	private List<Technologie> technologies;
	

	
}
