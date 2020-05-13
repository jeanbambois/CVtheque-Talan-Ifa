package com.projet.spring.cvtheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;


import com.projet.spring.cvtheque.entity.Company;
import com.projet.spring.cvtheque.entity.Country;




@CrossOrigin("http://localhost:4200")
public interface CountryRepository extends JpaRepository<Country,Integer> {

}
