package com.twoTeam.groupProject.Service.impl;

import java.io.IOException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twoTeam.groupProject.Service.ifs.PostInfoService;
import com.twoTeam.groupProject.Vo.PostInfoReq;
import com.twoTeam.groupProject.Vo.PostInfoRes;
import com.twoTeam.groupProject.constants.RtnCode;
import com.twoTeam.groupProject.entity.PostInfo;
import com.twoTeam.groupProject.repository.PostInfoDao;

@Service
public class PostInfoServiceImpl implements PostInfoService{

	@Autowired
	private PostInfoDao postInfoDao;

	@Override
	public PostInfoRes createPost(PostInfoReq req) throws IOException{
		try {
			byte[] pictureData = req.getPicture().getBytes();

            // 將數據保存到數據庫中
            PostInfo postInfo = new PostInfo();
            postInfo.setStoreId(req.getStoreId());
            postInfo.setUserId(req.getUserId());
            postInfo.setDescription(req.getDescription());
            postInfo.setPicture(pictureData);

            PostInfo savedPost = postInfoDao.save(postInfo);

            // 返回包含成功信息和貼文資訊的 PostInfoRes 對象
            return new PostInfoRes(savedPost, "Post created successfully");
        } catch (Exception e) {
            e.printStackTrace();
            // 返回包含錯誤信息的 PostInfoRes 對象，你也可以擲回一個例外
            return new PostInfoRes("Error creating post: " + e.getMessage());
        }
	}

	@Override
	public PostInfoRes getImageData(int postId) {
		PostInfo postInfo = postInfoDao.findById(postId);
        
        if (postInfo != null) {
            System.out.println("Found PostInfo with id: " + postInfo.getPostId());	
            return new PostInfoRes(postInfo, RtnCode.SUCCESSFUL);
        } 
        System.out.println("PostInfo not found for id: " + postId);
        return new PostInfoRes(null, RtnCode.POST_ID_NOT_FOUND);
	}

}
