package com.xworkz.springboot.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.apache.log4j.Logger;
import org.hibernate.annotations.GenericGenerator;

import com.xworkz.springboot.dto.SpringbootDTO;

import lombok.Data;

@Entity
@Table(name = "springboot")
@Data
public class SpringbootEntity implements Serializable {

	private static final Logger logger = Logger.getLogger(SpringbootEntity.class);

	@Id
	@GenericGenerator(name = "madhu", strategy = "increment")
	@GeneratedValue(generator = "madhu")
	@Column(name = "id")
	private int id;
	@Column(name = "from_name")
	private String fromName;
	@Column(name = "message")
	private String message;

	public SpringbootEntity() {
		logger.info("created\t" + this.getClass().getSimpleName());
	}

}
