package com.projet.spring.cvtheque.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;

import com.projet.spring.cvtheque.entity.City;





@CrossOrigin("http://localhost:4200")
public interface CityRepository extends JpaRepository<City,Integer> {

}
