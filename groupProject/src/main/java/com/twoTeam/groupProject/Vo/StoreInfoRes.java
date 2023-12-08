package com.twoTeam.groupProject.Vo;

import java.util.List;

import com.twoTeam.groupProject.constants.RtnCode;
import com.twoTeam.groupProject.entity.StoreInfo;

public class StoreInfoRes {

    private List<StoreInfo> storeInfoList;

    private RtnCode rtnCode;

    public StoreInfoRes() {
        super();
    }

    public List<StoreInfo> getStoreInfoList() {
        return storeInfoList;
    }

    public void setStoreInfoList(List<StoreInfo> storeInfoList) {
        this.storeInfoList = storeInfoList;
    }

    public StoreInfoRes(List<StoreInfo> storeInfoList, RtnCode rtnCode) {
        super();
        this.storeInfoList = storeInfoList;
        this.rtnCode = rtnCode;
    }

	public StoreInfoRes(RtnCode locationCityError) {
		// TODO Auto-generated constructor stub
	}

	public RtnCode getRtnCode() {
        return rtnCode;
    }

    public void setRtnCode(RtnCode rtnCode) {
        this.rtnCode = rtnCode;
    }
}