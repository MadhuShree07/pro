package com.xworkz.springboot.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xworkz.springboot.dto.AppInfoDto;
import com.xworkz.springboot.dto.SpringbootDTO;
import com.xworkz.springboot.entity.SpringbootEntity;
import com.xworkz.springboot.service.AppInfoService;
import com.xworkz.springboot.service.SpringbootService;

@Controller
public class SpringBootController {

	private static final Logger logger = Logger.getLogger(SpringBootController.class);

	@Autowired
	private SpringbootService springbootService;

	@Autowired
	private AppInfoService appInfoService;

	private List<AppInfoDto> list;

	public SpringBootController() {
		logger.info("Created " + this.getClass().getSimpleName());
	}

	@InitBinder
	public void init(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("dd-MM-yyyy"), true));
	}

	@PostConstruct
	public void init() {
		list = new ArrayList<AppInfoDto>();
	}

	@RequestMapping("onDo")
	public String onDO() {
		logger.info("Invoked onDo");
		return "springboot";

	}

	@RequestMapping("springboot")
	public String save(SpringbootDTO springbootDTO, Model model) {
		try {
			logger.info("Started save from springboot controller" + springbootDTO);
			logger.info("Invoked springboot page");

			if (Objects.nonNull(springbootDTO)) {

				SpringbootEntity fetchedMessage = springbootService.validateAndSave(springbootDTO);
				logger.info(fetchedMessage);

				model.addAttribute("from", springbootDTO.getFromName());
				model.addAttribute("message", springbootDTO.getMessage());
				logger.info("Directing to message.jsp");
				return "message";
			} else {
				logger.error("Message not valid");
				model.addAttribute("Error", "check the details you entered");
				return "springboot";
			}
		} catch (Exception e) {
			logger.error("Exception in save method of SpringbootController " + e);
		}
		logger.info("Ended save method of SpringbootController " + springbootDTO);
		return "message";
	}
}
