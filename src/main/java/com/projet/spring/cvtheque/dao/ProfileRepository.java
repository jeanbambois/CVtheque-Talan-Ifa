package com.projet.spring.cvtheque.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.projet.spring.cvtheque.entity.Profile;


@CrossOrigin(/*"http://localhost:4200"*/)
public interface ProfileRepository extends JpaRepository<Profile,Integer> {
	
	Page<Profile> findByLastNameContaining(@RequestParam("lastName") String lastName ,Pageable pageable);

}
