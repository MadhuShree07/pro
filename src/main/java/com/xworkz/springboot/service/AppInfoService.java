package com.xworkz.springboot.service;

import java.util.List;

import com.xworkz.springboot.dto.AppInfoDto;


public interface AppInfoService {
	
	public AppInfoDto saveAppInfo(AppInfoDto appInfoDto,List<AppInfoDto> list);

}
