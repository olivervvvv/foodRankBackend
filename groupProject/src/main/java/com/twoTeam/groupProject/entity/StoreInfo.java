package com.twoTeam.groupProject.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "store_info")
public class StoreInfo{

	//商店流水號
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "store_id")
	private int storeId;

<<<<<<< HEAD
	//地址
	@Column(name = "address")
	private String address;

	//店名
=======
	//�a�}
	@Column(name = "address")
	private String address;

	//���a�W��
>>>>>>> origin/main
	@Column(name = "name")
	private String name;

	//月排名
	@Column(name = "ranking_Ynumber")
	private int rankingYearNumber;

<<<<<<< HEAD
	//年排名
	@Column(name = "ranking_Mnumber")
	private int rankingMonthNumber;

	//所在都市
=======
	//��Ʀ�]
	@Column(name = "ranking_Mnumber")
	private int rankingMonthNumber;

	//��m����
>>>>>>> origin/main
	@Column(name = "location_city")
	private String locationCity;

	//食物風格
	@Column(name = "food_style")
	private String foodStyle;

<<<<<<< HEAD
	//按讚數
	@Column(name = "user_like")
	private double userLike;
	
	//上傳時間
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss") // 指定日期時間的格式
=======
	//�W�Ǯɶ�
>>>>>>> origin/main
	@Column(name = "update_time")
	private LocalDateTime updateTime;

	public StoreInfo() {
		super();
//		this.updateTime = LocalDateTime.now();
	}

	public StoreInfo(int storeId, String address, String name, int rankingYearNumber, int rankingMonthNumber,
<<<<<<< HEAD
					 String locationCity, String foodStyle, LocalDateTime updateTime, double userLike) {
=======
					 String locationCity, String foodStyle, LocalDateTime updateTime) {
>>>>>>> origin/main
		super();
		this.storeId = storeId;
		this.address = address;
		this.name = name;
		this.rankingYearNumber = rankingYearNumber;
		this.rankingMonthNumber = rankingMonthNumber;
		this.locationCity = locationCity;
		this.foodStyle = foodStyle;
		this.updateTime = updateTime != null ? updateTime : LocalDateTime.now();
		this.userLike = userLike;
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

<<<<<<< HEAD
	public double getUserLike() {
		return userLike;
	}

	public void setUserLike(double userLike) {
		this.userLike = userLike;
	}

=======
>>>>>>> origin/main
}
