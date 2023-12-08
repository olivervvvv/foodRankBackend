package com.twoTeam.groupProject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "store_info")
public class StoreInfo{

	@Id
	@Column(name = "location")
	private String location;
	
	@Column(name = "name")
	private String name;

	@Column(name = "ranking_number")
	private int rankingNumber;
	
	@Column(name = "location_city")
	private String locationCity;

	@Column(name = "food_style")
	private String foodStyle;
	
	public StoreInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StoreInfo(String location, String name, int rankingNumber, String locationCity, String foodStyle) {
		super();
		this.location = location;
		this.name = name;
		this.rankingNumber = rankingNumber;
		this.locationCity = locationCity;
		this.foodStyle = foodStyle;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRankingNumber() {
		return rankingNumber;
	}

	public void setRankingNumber(int rankingNumber) {
		this.rankingNumber = rankingNumber;
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
	
}
