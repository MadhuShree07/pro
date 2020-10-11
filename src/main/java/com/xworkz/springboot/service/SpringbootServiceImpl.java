package com.xworkz.springboot.service;

import java.util.Objects;
import org.apache.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xworkz.springboot.dto.SpringbootDTO;
import com.xworkz.springboot.entity.SpringbootEntity;
import com.xworkz.springboot.repository.SpringbootRepository;

@Service
public class SpringbootServiceImpl implements SpringbootService {

	private static final Logger logger = Logger.getLogger(SpringbootServiceImpl.class);

	@Autowired
	private SpringbootRepository springbootRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public SpringbootEntity validateAndSave(SpringbootDTO springbootDTO) {
		SpringbootEntity springbootEntity = null;
		logger.info("started validateAndSave method for springboot service impl");
		try {
			logger.info("inside the validateAndSaveMessage method of message service impl ");
			if (Objects.nonNull(springbootDTO)) {

				logger.info("Saving springboot entity details into springboot table" + springbootDTO);
				logger.info("calling the model mapper class");
				springbootEntity = modelMapper.map(springbootDTO, SpringbootEntity.class);
				springbootRepository.save(springbootEntity);

			}
			return springbootEntity;
		} catch (Exception e) {
			logger.error("Exception in save method in springboot serviceimpl ", e);
			System.out.println(e);
		}
		logger.info("Ended save method from springboot serviceimpl");
		return springbootEntity;
	}
}
