package com.xworkz.springboot.service;

import com.xworkz.springboot.dto.SpringbootDTO;
import com.xworkz.springboot.entity.SpringbootEntity;

public interface SpringbootService {

	public SpringbootEntity validateAndSave(SpringbootDTO springbootDTO);

}
