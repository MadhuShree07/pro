package com.xworkz.springboot.dto;

import org.apache.log4j.Logger;

import lombok.Data;

@Data
public class SpringbootDTO {

	private static final Logger logger = Logger.getLogger(SpringbootDTO.class);

	private int id;
	private String fromName;
	private String message;

	public SpringbootDTO() {
		logger.info("created\t" + this.getClass().getSimpleName());
	}

}