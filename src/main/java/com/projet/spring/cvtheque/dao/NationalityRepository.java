package com.projet.spring.cvtheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;



import com.projet.spring.cvtheque.entity.Nationality;





@CrossOrigin("http://localhost:4200")
public interface NationalityRepository extends JpaRepository<Nationality,Integer> {

}
