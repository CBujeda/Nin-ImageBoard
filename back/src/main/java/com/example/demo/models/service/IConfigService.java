package com.example.demo.models.service;

import com.example.demo.models.entity.Config;

public interface IConfigService {

	long getCountConfig();

	Config saveNewConfig(Config config);

}
