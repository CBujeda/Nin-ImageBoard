package com.example.demo.models.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.dao.IConfigDAO;
import com.example.demo.models.entity.Config;
import com.example.demo.models.service.IConfigService;

@Service
public class ConfigServiceImpl implements IConfigService {

	@Autowired
	private IConfigDAO configDAO;
	
	@Override
	public long getCountConfig() {
		try {
			return configDAO.getCountConfig();
		}catch(Exception e){
			return -1;
		}
	}
	@Override
	public Config saveNewConfig(Config config) {
		try {
			return configDAO.save(config);
		}catch(Exception e) {
			return new Config();
		}
	}
	
}
