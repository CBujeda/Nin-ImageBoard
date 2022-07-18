package com.example.demo.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IPostDAO;
import com.example.demo.models.service.IPostService;

@Service
public class PostServiceImpl implements IPostService {

	@Autowired
	private IPostDAO postDao;
	@Override
	public long getCountPosts() {
		try {
			return postDao.getCountPosts();
		}catch(Exception e){
			return -1;
		}
	}
}
