package com.xworkz.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xworkz.springboot.entity.SpringbootEntity;

@Repository
public interface SpringbootRepository extends JpaRepository<SpringbootEntity, Long>{

}
