package com.twoTeam.groupProject.Service.ifs;

import java.io.IOException;

import com.twoTeam.groupProject.Vo.PostInfoReq;
import com.twoTeam.groupProject.Vo.PostInfoRes;

public interface PostInfoService {

//	PostInfoRes savePost(int storeId, int userId, String description, byte[] picture);

	PostInfoRes createPost(PostInfoReq req) throws IOException;

	PostInfoRes getImageData(int postId);

	
}
