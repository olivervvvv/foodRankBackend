package com.twoTeam.groupProject.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.twoTeam.groupProject.Service.ifs.PostInfoService;
import com.twoTeam.groupProject.Vo.PostInfoReq;
import com.twoTeam.groupProject.Vo.PostInfoRes;
import com.twoTeam.groupProject.constants.RtnCode;

@RestController
@CrossOrigin
@RequestMapping("/posts")
public class PostInfoController {

	    @Autowired
	    private PostInfoService postInfoService;

	    @PostMapping("/create")
	    public ResponseEntity<PostInfoRes> createPost(@ModelAttribute PostInfoReq req) {
	        try {
	        	PostInfoRes result = postInfoService.createPost(req);
	        	return new ResponseEntity<>(result, HttpStatus.CREATED);
	        } catch (IOException e) {
	            
	        	return new ResponseEntity<>(new PostInfoRes("Error creating post: " + e.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
	        }
	    }
	    
	    @GetMapping("/getPhoto")
	    public PostInfoRes getPost(@RequestParam int postId) {
	    	return postInfoService.getImageData(postId);
	    }
	    
	    @GetMapping("/getPhoto")
	    public PostInfoRes getPostList(@RequestParam int postId) {
	    	return postInfoService.getImageData(postId);
	    }


}
