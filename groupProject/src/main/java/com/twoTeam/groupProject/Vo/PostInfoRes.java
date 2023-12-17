package com.twoTeam.groupProject.Vo;

import com.twoTeam.groupProject.constants.RtnCode;
import com.twoTeam.groupProject.entity.PostInfo;

public class PostInfoRes {

	private PostInfo postInfo;
	
	private RtnCode rtnCode;

	private String string;

	public PostInfoRes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PostInfoRes(PostInfo postInfo, RtnCode rtnCode) {
		super();
		this.postInfo = postInfo;
		this.rtnCode = rtnCode;
	}

	public PostInfoRes(String string) {
		super();
		this.string = string;
	}

	public PostInfoRes(PostInfo postInfo, String string) {
		super();
		this.postInfo = postInfo;
		this.string = string;
	}

	public PostInfo getPostInfo() {
		return postInfo;
	}

	public void setPostInfo(PostInfo postInfo) {
		this.postInfo = postInfo;
	}

	public RtnCode getRtnCode() {
		return rtnCode;
	}

	public void setRtnCode(RtnCode rtnCode) {
		this.rtnCode = rtnCode;
	}
	
	
}
