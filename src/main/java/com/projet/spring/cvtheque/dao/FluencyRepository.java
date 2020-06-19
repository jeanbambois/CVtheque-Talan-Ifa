package com.projet.spring.cvtheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;


import com.projet.spring.cvtheque.entity.Fluency;





@CrossOrigin("http://localhost:4200")
public interface FluencyRepository extends JpaRepository<Fluency,Integer> {

}
