package com.twoTeam.groupProject.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twoTeam.groupProject.repository.storeInfoDao;
import com.twoTeam.groupProject.constants.RtnCode;
import com.twoTeam.groupProject.Service.ifs.foodMapService;
import com.twoTeam.groupProject.Vo.StoreInfoRes;
import com.twoTeam.groupProject.entity.StoreInfo;

@Service
public class foodMapServiceImpl implements foodMapService{

	@Autowired
	private storeInfoDao storeInfoDao;
	
	@Override
	public StoreInfoRes SearchLocation(String locationCity) {
		System.out.println("===========");
		System.out.println(locationCity);
		System.out.println("===========");

		List<StoreInfo> storeInfoList=storeInfoDao.findByLocationCity(locationCity);
		
		 if (storeInfoList != null && !storeInfoList.isEmpty()) {
		    	for (StoreInfo storeInfo : storeInfoList) {
		    		System.out.println(storeInfo.getName());
		    		System.out.println(storeInfo.getFoodStyle());
//					return new StoreInfoRes(storeInfoList,RtnCode.SUCCESSFUL);
		        }
		    	return new StoreInfoRes(storeInfoList,RtnCode.SUCCESSFUL);
	        }
	     System.out.println("未找到相應的StoreInfo");
	     return new StoreInfoRes(RtnCode.LOCATION_CITY_ERROR);		
		
	}

}
