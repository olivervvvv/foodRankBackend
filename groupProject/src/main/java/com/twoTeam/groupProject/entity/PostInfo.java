package com.twoTeam.groupProject.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "post_info")
public class PostInfo {

	//貼文流水號
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "post_id")
	private int postId;
	
	@Column(name = "store_id")
	private int storeId;
	
	@Column(name = "user_id")
	private int userId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "post_like_number")
	private int postLikeNumber;
	
	@Lob 
	@Basic(fetch = FetchType.LAZY)
	@Column(length=100000)
	private byte[] picture;

	public PostInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostInfo(int postId, int storeId, int userId, String description, int postLikeNumber, byte[] picture) {
		super();
		this.postId = postId;
		this.storeId = storeId;
		this.userId = userId;
		this.description = description;
		this.postLikeNumber = postLikeNumber;
		this.picture = picture;
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPostLikeNumber() {
		return postLikeNumber;
	}

	public void setPostLikeNumber(int postLikeNumber) {
		this.postLikeNumber = postLikeNumber;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public boolean isPresent() {
		
		return false;
	}
	
	
}
