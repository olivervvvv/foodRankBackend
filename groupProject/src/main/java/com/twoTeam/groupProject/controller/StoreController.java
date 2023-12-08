package com.twoTeam.groupProject.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twoTeam.groupProject.Service.ifs.foodMapService;
import com.twoTeam.groupProject.Vo.StoreInfoRes;

@RestController
public class StoreController {

	@Autowired
	private foodMapService foodMapService;
	
	 @GetMapping(value = "/foodMap/getlocation")
	    public StoreInfoRes getLocationCity(@RequestParam String locationCity) {
	        System.out.println(locationCity);
	        return foodMapService.SearchLocation(locationCity);
	    }

}
