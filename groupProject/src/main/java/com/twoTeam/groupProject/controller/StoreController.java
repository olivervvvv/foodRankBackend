package com.twoTeam.groupProject.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twoTeam.groupProject.Service.ifs.foodMapService;
import com.twoTeam.groupProject.Vo.StoreInfoReq;
import com.twoTeam.groupProject.Vo.StoreInfoRes;
import com.twoTeam.groupProject.entity.StoreInfo;

@RestController
@CrossOrigin
public class StoreController {

	@Autowired
	private foodMapService foodMapService;
	
	 @GetMapping(value = "/foodMap/getlocation")
	    public StoreInfoRes getLocationCity(@RequestParam String locationCity) {
	        System.out.println(locationCity);
	        return foodMapService.SearchLocation(locationCity);
	    }
	 
	 @PostMapping("/foodMap/create")
	    public StoreInfoRes createStoreInfo(@RequestBody StoreInfoReq req) {
	        // Call your service method to handle the creation logic
		 StoreInfo storeInfo = req.getStoreInfo();
		 System.out.println("===========");
		 System.out.println(storeInfo.getName());
		 System.out.println(storeInfo.getAddress());
		 System.out.println(storeInfo.getLocationCity());
		 System.out.println("==========");
	     return foodMapService.CreateStoreInfo(req);
	         
	    }

	 @GetMapping(value = "/foodMap/searchName")
	    public StoreInfoRes SearchStoreName(@RequestParam String name) {
	        System.out.println(name);
	        return foodMapService.SearchStoreName(name);
	    }
}
