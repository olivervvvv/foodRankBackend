package com.twoTeam.groupProject.Service.ifs;

import com.twoTeam.groupProject.Vo.StoreInfoReq;
import com.twoTeam.groupProject.Vo.StoreInfoRes;

public interface foodMapService {
	
	public StoreInfoRes SearchLocation(String locationCity);
	
	public StoreInfoRes CreateStoreInfo(StoreInfoReq req);

	StoreInfoRes SearchStoreName(String name);
}
