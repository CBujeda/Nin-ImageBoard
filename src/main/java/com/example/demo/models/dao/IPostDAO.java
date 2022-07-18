package com.example.demo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.entity.Post;

public interface IPostDAO extends JpaRepository<Post,Long> {
	
	
	
	@Query(nativeQuery=true, value=
			  "select count(p.id_post) "
			+ "from post p ")
	public long getCountPosts();
}
