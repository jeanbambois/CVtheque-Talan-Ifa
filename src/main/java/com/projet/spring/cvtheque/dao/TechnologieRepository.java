package com.projet.spring.cvtheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.spring.cvtheque.entity.City;
import com.projet.spring.cvtheque.entity.Technologie;





@CrossOrigin("http://localhost:4200")
public interface TechnologieRepository extends JpaRepository<Technologie,Integer> {

}
