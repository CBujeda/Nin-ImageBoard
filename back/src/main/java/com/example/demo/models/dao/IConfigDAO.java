package com.example.demo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.entity.Config;

public interface IConfigDAO extends JpaRepository<Config,Long> {
	
	@Query(nativeQuery=true, value=
			  "select count(c.id) "
			+ "from config c ")
	public long getCountConfig();
}
