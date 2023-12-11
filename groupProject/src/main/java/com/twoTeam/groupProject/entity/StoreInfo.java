package com.twoTeam.groupProject.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "store_info")
public class StoreInfo{

	//流水號
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "store_id")
	private int storeId;
	
	//地址
	@Column(name = "address")
	private String address;
	
	//店家名稱
	@Column(name = "name")
	private String name;

	//年排行榜
	@Column(name = "ranking_Ynumber")
	private int rankingYearNumber;
	
	//月排行榜
	@Column(name = "ranking_Mnumber")
	private int rankingMonthNumber;
	
	//位置城市
	@Column(name = "location_city")
	private String locationCity;

	//食物種類
	@Column(name = "food_style")
	private String foodStyle;
	
	//上傳時間
	@Column(name = "update_time")
	private LocalDateTime updateTime;
	
	public StoreInfo() {
		super();
//		this.updateTime = LocalDateTime.now();
	}

	public StoreInfo(int storeId, String address, String name, int rankingYearNumber, int rankingMonthNumber,
			String locationCity, String foodStyle, LocalDateTime updateTime) {
		super();
		this.storeId = storeId;
		this.address = address;
		this.name = name;
		this.rankingYearNumber = rankingYearNumber;
		this.rankingMonthNumber = rankingMonthNumber;
		this.locationCity = locationCity;
		this.foodStyle = foodStyle;
		this.updateTime = updateTime != null ? updateTime : LocalDateTime.now();
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocationCity() {
		return locationCity;
	}

	public void setLocationCity(String locationCity) {
		this.locationCity = locationCity;
	}

	public String getFoodStyle() {
		return foodStyle;
	}

	public void setFoodStyle(String foodStyle) {
		this.foodStyle = foodStyle;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getRankingYearNumber() {
		return rankingYearNumber;
	}

	public void setRankingYearNumber(int rankingYearNumber) {
		this.rankingYearNumber = rankingYearNumber;
	}

	public int getRankingMonthNumber() {
		return rankingMonthNumber;
	}

	public void setRankingMonthNumber(int rankingMonthNumber) {
		this.rankingMonthNumber = rankingMonthNumber;
	}

	public LocalDateTime getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}
	
}
